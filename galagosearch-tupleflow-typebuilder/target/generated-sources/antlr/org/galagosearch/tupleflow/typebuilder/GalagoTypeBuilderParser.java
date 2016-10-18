// $ANTLR 3.0.1 /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g 2016-10-05 12:31:08

  package org.galagosearch.tupleflow.typebuilder;
  import java.util.HashMap;
  import org.galagosearch.tupleflow.typebuilder.OrderSpecification;
  import org.galagosearch.tupleflow.typebuilder.OrderedFieldSpecification;
  import org.galagosearch.tupleflow.typebuilder.Direction;
  import org.galagosearch.tupleflow.typebuilder.FieldSpecification;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GalagoTypeBuilderParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "NEWLINE", "WS", "COMMENT", "'bytes'", "'boolean'", "'int'", "'long'", "'short'", "'byte'", "'float'", "'double'", "'String'", "';'", "'+'", "'-'", "'order:'", "'.'", "'package'", "'type'", "'{'", "'}'"
    };
    public static final int WS=6;
    public static final int NEWLINE=5;
    public static final int COMMENT=7;
    public static final int ID=4;
    public static final int EOF=-1;

        public GalagoTypeBuilderParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "/home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g"; }



    // $ANTLR start var_type
    // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:17:1: var_type returns [ FieldSpecification.DataType dataType ] : ( 'bytes' | 'boolean' | 'int' | 'long' | 'short' | 'byte' | 'float' | 'double' | 'String' );
    public final FieldSpecification.DataType var_type() throws RecognitionException {
        FieldSpecification.DataType dataType = null;

        try {
            // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:17:59: ( 'bytes' | 'boolean' | 'int' | 'long' | 'short' | 'byte' | 'float' | 'double' | 'String' )
            int alt1=9;
            switch ( input.LA(1) ) {
            case 8:
                {
                alt1=1;
                }
                break;
            case 9:
                {
                alt1=2;
                }
                break;
            case 10:
                {
                alt1=3;
                }
                break;
            case 11:
                {
                alt1=4;
                }
                break;
            case 12:
                {
                alt1=5;
                }
                break;
            case 13:
                {
                alt1=6;
                }
                break;
            case 14:
                {
                alt1=7;
                }
                break;
            case 15:
                {
                alt1=8;
                }
                break;
            case 16:
                {
                alt1=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("17:1: var_type returns [ FieldSpecification.DataType dataType ] : ( 'bytes' | 'boolean' | 'int' | 'long' | 'short' | 'byte' | 'float' | 'double' | 'String' );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:18:5: 'bytes'
                    {
                    match(input,8,FOLLOW_8_in_var_type61); 
                     dataType = FieldSpecification.DataType.BYTES; 

                    }
                    break;
                case 2 :
                    // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:19:5: 'boolean'
                    {
                    match(input,9,FOLLOW_9_in_var_type71); 
                     dataType = FieldSpecification.DataType.BOOLEAN; 

                    }
                    break;
                case 3 :
                    // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:20:5: 'int'
                    {
                    match(input,10,FOLLOW_10_in_var_type81); 
                     dataType = FieldSpecification.DataType.INT; 

                    }
                    break;
                case 4 :
                    // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:21:5: 'long'
                    {
                    match(input,11,FOLLOW_11_in_var_type91); 
                     dataType = FieldSpecification.DataType.LONG; 

                    }
                    break;
                case 5 :
                    // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:22:5: 'short'
                    {
                    match(input,12,FOLLOW_12_in_var_type101); 
                     dataType = FieldSpecification.DataType.SHORT; 

                    }
                    break;
                case 6 :
                    // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:23:5: 'byte'
                    {
                    match(input,13,FOLLOW_13_in_var_type111); 
                     dataType = FieldSpecification.DataType.BYTE; 

                    }
                    break;
                case 7 :
                    // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:24:5: 'float'
                    {
                    match(input,14,FOLLOW_14_in_var_type121); 
                     dataType = FieldSpecification.DataType.FLOAT; 

                    }
                    break;
                case 8 :
                    // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:25:5: 'double'
                    {
                    match(input,15,FOLLOW_15_in_var_type131); 
                     dataType = FieldSpecification.DataType.DOUBLE; 

                    }
                    break;
                case 9 :
                    // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:26:5: 'String'
                    {
                    match(input,16,FOLLOW_16_in_var_type141); 
                     dataType = FieldSpecification.DataType.STRING; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return dataType;
    }
    // $ANTLR end var_type


    // $ANTLR start field_def
    // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:28:1: field_def returns [ FieldSpecification field ] : v= var_type i= ID ';' ;
    public final FieldSpecification field_def() throws RecognitionException {
        FieldSpecification field = null;

        Token i=null;
        FieldSpecification.DataType v = null;


        try {
            // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:28:48: (v= var_type i= ID ';' )
            // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:29:5: v= var_type i= ID ';'
            {
            pushFollow(FOLLOW_var_type_in_field_def165);
            v=var_type();
            _fsp--;

            i=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_field_def169); 
            match(input,17,FOLLOW_17_in_field_def171); 
             field = new FieldSpecification(v, i.getText()); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return field;
    }
    // $ANTLR end field_def


    // $ANTLR start field_defs
    // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:33:1: field_defs returns [ ArrayList<FieldSpecification> fields ] : (v= field_def )+ ;
    public final ArrayList<FieldSpecification> field_defs() throws RecognitionException {
        ArrayList<FieldSpecification> fields = null;

        FieldSpecification v = null;


        try {
            // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:33:61: ( (v= field_def )+ )
            // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:34:5: (v= field_def )+
            {
             fields = new ArrayList<FieldSpecification>(); 
            // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:35:5: (v= field_def )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=8 && LA2_0<=16)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:35:6: v= field_def
            	    {
            	    pushFollow(FOLLOW_field_def_in_field_defs207);
            	    v=field_def();
            	    _fsp--;

            	     fields.add(v); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return fields;
    }
    // $ANTLR end field_defs


    // $ANTLR start order_field
    // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:38:1: order_field returns [ OrderedFieldSpecification ord_field ] : ( '+' | '-' ) i= ID ;
    public final OrderedFieldSpecification order_field() throws RecognitionException {
        OrderedFieldSpecification ord_field = null;

        Token i=null;

        try {
            // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:38:61: ( ( '+' | '-' ) i= ID )
            // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:39:5: ( '+' | '-' ) i= ID
            {
            Direction direction = Direction.ASCENDING;
            // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:40:5: ( '+' | '-' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("40:5: ( '+' | '-' )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:40:6: '+'
                    {
                    match(input,18,FOLLOW_18_in_order_field246); 

                    }
                    break;
                case 2 :
                    // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:40:12: '-'
                    {
                    match(input,19,FOLLOW_19_in_order_field250); 
                    direction = Direction.DESCENDING;

                    }
                    break;

            }

            i=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_order_field261); 
             ord_field = new OrderedFieldSpecification(direction, i.getText()); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ord_field;
    }
    // $ANTLR end order_field


    // $ANTLR start order_def
    // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:43:1: order_def returns [ OrderSpecification defs ] : 'order:' (o= order_field )* ';' ;
    public final OrderSpecification order_def() throws RecognitionException {
        OrderSpecification defs = null;

        OrderedFieldSpecification o = null;


        try {
            // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:43:47: ( 'order:' (o= order_field )* ';' )
            // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:44:5: 'order:' (o= order_field )* ';'
            {
             defs = new OrderSpecification(); 
            match(input,20,FOLLOW_20_in_order_def289); 
            // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:45:14: (o= order_field )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=18 && LA4_0<=19)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:45:15: o= order_field
            	    {
            	    pushFollow(FOLLOW_order_field_in_order_def294);
            	    o=order_field();
            	    _fsp--;

            	     defs.addOrderedField(o); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match(input,17,FOLLOW_17_in_order_def300); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return defs;
    }
    // $ANTLR end order_def


    // $ANTLR start order_defs
    // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:47:1: order_defs returns [ ArrayList<OrderSpecification> defs ] : (o= order_def )+ ;
    public final ArrayList<OrderSpecification> order_defs() throws RecognitionException {
        ArrayList<OrderSpecification> defs = null;

        OrderSpecification o = null;


        try {
            // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:47:59: ( (o= order_def )+ )
            // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:48:5: (o= order_def )+
            {
             defs = new ArrayList<OrderSpecification>(); 
            // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:49:5: (o= order_def )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:49:6: o= order_def
            	    {
            	    pushFollow(FOLLOW_order_def_in_order_defs330);
            	    o=order_def();
            	    _fsp--;

            	     defs.add(o); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return defs;
    }
    // $ANTLR end order_defs

    public static class package_name_return extends ParserRuleReturnScope {
        public String name;
    };

    // $ANTLR start package_name
    // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:52:1: package_name returns [ String name ] : ID ( '.' ID )* ;
    public final package_name_return package_name() throws RecognitionException {
        package_name_return retval = new package_name_return();
        retval.start = input.LT(1);

        try {
            // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:52:38: ( ID ( '.' ID )* )
            // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:53:5: ID ( '.' ID )*
            {
            match(input,ID,FOLLOW_ID_in_package_name355); 
            // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:53:8: ( '.' ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:53:9: '.' ID
            	    {
            	    match(input,21,FOLLOW_21_in_package_name358); 
            	    match(input,ID,FOLLOW_ID_in_package_name360); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             retval.name = input.toString(retval.start,input.LT(-1)); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end package_name


    // $ANTLR start package_def
    // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:56:1: package_def returns [ String name ] : 'package' pn= package_name ';' ;
    public final String package_def() throws RecognitionException {
        String name = null;

        package_name_return pn = null;


        try {
            // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:56:37: ( 'package' pn= package_name ';' )
            // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:57:5: 'package' pn= package_name ';'
            {
            match(input,22,FOLLOW_22_in_package_def385); 
            pushFollow(FOLLOW_package_name_in_package_def389);
            pn=package_name();
            _fsp--;

            match(input,17,FOLLOW_17_in_package_def391); 
             name = pn.name; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return name;
    }
    // $ANTLR end package_def


    // $ANTLR start type_def
    // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:60:1: type_def returns [ TypeSpecification spec ] : p= package_def 'type' i= ID '{' v= field_defs o= order_defs '}' ;
    public final TypeSpecification type_def() throws RecognitionException {
        TypeSpecification spec = null;

        Token i=null;
        String p = null;

        ArrayList<FieldSpecification> v = null;

        ArrayList<OrderSpecification> o = null;


        try {
            // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:60:45: (p= package_def 'type' i= ID '{' v= field_defs o= order_defs '}' )
            // /home/user/workspace/Galago/galagosearch-1.04/galagosearch-tupleflow-typebuilder/src/main/antlr/org/galagosearch/tupleflow/typebuilder/GalagoTypeBuilder.g:61:5: p= package_def 'type' i= ID '{' v= field_defs o= order_defs '}'
            {

                    spec = new TypeSpecification();
                
            pushFollow(FOLLOW_package_def_in_type_def471);
            p=package_def();
            _fsp--;

             spec.setPackageName(p); 
            match(input,23,FOLLOW_23_in_type_def479); 
            i=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_type_def483); 
             spec.setTypeName(i.getText()); 
            match(input,24,FOLLOW_24_in_type_def491); 
            pushFollow(FOLLOW_field_defs_in_type_def499);
            v=field_defs();
            _fsp--;

             spec.setFields(v); 
            pushFollow(FOLLOW_order_defs_in_type_def509);
            o=order_defs();
            _fsp--;

             spec.setOrders(o); 
            match(input,25,FOLLOW_25_in_type_def517); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return spec;
    }
    // $ANTLR end type_def


 

    public static final BitSet FOLLOW_8_in_var_type61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_var_type71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_var_type81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_var_type91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_var_type101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_var_type111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_var_type121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_var_type131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_var_type141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_type_in_field_def165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_field_def169 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_field_def171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_def_in_field_defs207 = new BitSet(new long[]{0x000000000001FF02L});
    public static final BitSet FOLLOW_18_in_order_field246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19_in_order_field250 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_order_field261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_order_def289 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_order_field_in_order_def294 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_17_in_order_def300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_order_def_in_order_defs330 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ID_in_package_name355 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_package_name358 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_package_name360 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_22_in_package_def385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_package_name_in_package_def389 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_package_def391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_package_def_in_type_def471 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_type_def479 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_type_def483 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_type_def491 = new BitSet(new long[]{0x000000000001FF00L});
    public static final BitSet FOLLOW_field_defs_in_type_def499 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_order_defs_in_type_def509 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_type_def517 = new BitSet(new long[]{0x0000000000000002L});

}