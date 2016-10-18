package org.galagosearch.exercises;


import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

import org.galagosearch.core.parse.Document;
import org.galagosearch.core.parse.Tag;
import org.galagosearch.core.parse.TagTokenizer;

public class Crawler {
	//private String root;

	public URL getBaseUrl(Document document, URL fetchUrl) {
		try {
			for (Tag tag : document.tags) {
				if (tag.name.equals("base") && tag.attributes.containsKey("href")){
					return new URL(tag.attributes.get("href"));
				}
			}
		} catch(MalformedURLException e) {
			return fetchUrl;
		}
		return fetchUrl;
	}
	
	public ArrayList<String> getChildUrls(String fileNameId, URL fetchUrl, URL baseURL) {
		//Array to store URLs found in the text document.
		ArrayList<String> urlArray = new ArrayList<String>();
		
		// Set the directory path of the file to create.
        String fileName = "download/" + fileNameId + ".txt";

        // Reference each line in the text document.
        String line = null;
		
        try {
        	//Read the text document in its default encoding.
            FileReader fileReader = new FileReader(fileName);

            //Wrap FileReader in a BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            //Start index of the substring.
            int startIndex;
            String subString;
            //Search each line of the text document for <a> tags and get its href attribute. 
            while((line = bufferedReader.readLine()) != null) {
            	if(line.indexOf("<a href=\"/") != -1)
            	{
                	startIndex = line.indexOf("<a href=")+9;
                	subString = line.substring(startIndex);
                    //Add the base URL and relative URL together.
                	urlArray.add("https://" + baseURL.getHost() + subString.substring(0, subString.indexOf("\"")));
            	}
            }   
            // Close the file once done.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
        }
        
		return urlArray;
	}
	
	public String fetchUrlToString(URL fetchUrl) throws IOException {	
		InputStream string = new URL(fetchUrl.toString().trim()).openStream();

		int ch;
		StringBuilder sb = new StringBuilder();
		while ((ch = string.read ()) != -1){
		     sb.append((char) ch);
		}
		string.close();

		if(sb.length() == 0)
		{
			return null;
		}
		return sb.toString();
		// Download actual pages. Java.net.URL.openConnection()		
		/*URLConnection connection = fetchUrl.openConnection();

		InputStream input = fetchUrl.openConnection().getInputStream();

       System.out.println(input.read());

			
		connection.connect();
		InputStream stream = connection.getInputStream();
		System.out.println("Stream: " + stream.toString());

		ByteArrayOutputStream dataString = new ByteArrayOutputStream();

		// Limit reads to 256k
		byte[] buffer = new byte[256000000];
		int bytesRead = 0;
		System.out.println("Buffer Length: " + buffer.length);

		while ((bytesRead = stream.read(buffer)) != -1) {
			// Read until there's no more data,or until we've read 256KB, then
			// quit.
			if (dataString.size() <= 256000000) {
				dataString.write(buffer, 0, bytesRead);
			} else {
				break;
			}
		}
		// Decode the stream to UTF-8 format. Hint: look at String class
		return dataString.toString();*/
		
	}
	
	public String fetchUrlToFile(URL url) throws IOException {

		// String format of HTML file. Hint: call fetchUrlToString(URL).
		String urlString = fetchUrlToString(url);
		
		if(urlString == null)
		{
			return null;
		}
		String documentTitle;
		//Document title for file name.

		documentTitle = urlString.substring(urlString.indexOf("<title>")+7, urlString.indexOf("</title>"));

		//Create new file with the documentTitle as its name.
		PrintWriter newFile = new PrintWriter("download/"+ documentTitle + ".txt"); 
			
		//Write content of urlString to text document.
		newFile.println(urlString);
			
		//Close the text document.
		newFile.close();
		return documentTitle;

	}
	
	public void run(URL rootUrl) throws UnsupportedEncodingException, IOException, InterruptedException {
		// ~/parse/TagTokenizer.java
		TagTokenizer tokenizer = new TagTokenizer();
		// Java.util.LinkedList, Java.util.Queue
		Queue<URL> urls = new LinkedList<URL>();
		// Java.util.HashSet
		HashSet<URL> seen = new HashSet<URL>();
		
		URL urlRequest;
		URL url;
		URL baseURL;
		ArrayList<String> childURL;
		String fileNameId;
		Document tokenized;
		
		//Add the seed URL to the URL request queue.
		urls.add(rootUrl);		
		
		int counter = 10;
		while(counter >= 0)
		{
			//Fetch a URL from the queue.
			urlRequest = urls.poll();
			// Add the URL to seen queue to avoid duplicate crawls.
			if(!seen.contains(urlRequest))
			{
				seen.add(urlRequest);
				System.out.println("Adding to \"Seen\" queue");
			}
			else
			{	
				System.out.println("Duplicate crawl url");
				continue;
			}

			// Request a URL from the URLS queue.
			// Write the string we download to a text document in the downloads folder.
			// Extract the title of the web document as its identity for fileNameId.
			try
			{
				fileNameId = fetchUrlToFile(urlRequest);
				if(fileNameId == null)
				{
					continue;
				}
			}
			catch(FileNotFoundException ex)
			{
				//If the file is not found continue on to the next url
				System.out.println("File not found: " + urlRequest);
				continue;
			}
			//Token the web document so we can acquire the base URL.
			tokenized = tokenizer.tokenize("download/" + fileNameId + ".txt");
			baseURL = getBaseUrl(tokenized, urlRequest);
			
			childURL = getChildUrls(fileNameId, urlRequest, baseURL);
			for(int indexOfUrl = 0; indexOfUrl < childURL.size(); indexOfUrl++)
			{
				// Add the URL to urls queue if we have not seen it yet.
				if(!seen.contains(childURL.get(indexOfUrl)))
				{
					url = new URL(childURL.get(indexOfUrl));
					urls.add(url);
					//System.out.println("Adding to \"urls\" queue");
				}
				else
				{
					System.out.println("Duplicate crawl of child url");	
					continue;
				}
			}
			counter = counter - 1;
			Thread.sleep(5000);
		}
		
		
		// After fetching a document, we need to look for new URLs to crawl.
		// Hint: use loop – refer getBaseUrl. It is very similar
		// URLs on an HTML page are relative to the base URL.
		// For instance, <a href="/search"> on yahoo.com is
		// equivalent to http://yahoo.com/search.
		// We check here to see if we've seen this URL before.
		// It's important to do the check when adding to the queue
		// to keep the queue size low.
		// Wait 5 seconds between fetches.
	}

	public void setFolder(String string) {
		File dir = new File("download");
		dir.mkdir();
	}
	
}