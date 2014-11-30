package com.opcoach.training.rental.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.opcoach.training.rental.xtext.services.RentalDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRentalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RentalAgency'", "'{'", "'objectsToRent'", "','", "'}'", "'customers'", "'rentals'", "'Address'", "'streetType'", "'number'", "'zipCode'", "'city'", "'streetName'", "'available'", "'RentalObject'", "'name'", "'Customer'", "'firstName'", "'lastName'", "'licenses'", "'Rental'", "'startDate'", "'endDate'", "'customer'", "'rentedObject'", "'-'", "'License'", "'validityDate'", "'EReference0'", "'EDate'", "'Street'", "'Road'"
    };
    public static final int T__42=42;
    public static final int RULE_ID=5;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalRentalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRentalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRentalDslParser.tokenNames; }
    public String getGrammarFileName() { return "../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g"; }



     	private RentalDslGrammarAccess grammarAccess;
     	
        public InternalRentalDslParser(TokenStream input, RentalDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "RentalAgency";	
       	}
       	
       	@Override
       	protected RentalDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRentalAgency"
    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:68:1: entryRuleRentalAgency returns [EObject current=null] : iv_ruleRentalAgency= ruleRentalAgency EOF ;
    public final EObject entryRuleRentalAgency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRentalAgency = null;


        try {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:69:2: (iv_ruleRentalAgency= ruleRentalAgency EOF )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:70:2: iv_ruleRentalAgency= ruleRentalAgency EOF
            {
             newCompositeNode(grammarAccess.getRentalAgencyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRentalAgency_in_entryRuleRentalAgency75);
            iv_ruleRentalAgency=ruleRentalAgency();

            state._fsp--;

             current =iv_ruleRentalAgency; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRentalAgency85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRentalAgency"


    // $ANTLR start "ruleRentalAgency"
    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:77:1: ruleRentalAgency returns [EObject current=null] : (otherlv_0= 'RentalAgency' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_address_3_0= ruleAddress ) )? (otherlv_4= 'objectsToRent' otherlv_5= '{' ( (lv_objectsToRent_6_0= ruleRentalObject ) ) (otherlv_7= ',' ( (lv_objectsToRent_8_0= ruleRentalObject ) ) )* otherlv_9= '}' )? (otherlv_10= 'customers' otherlv_11= '{' ( (lv_customers_12_0= ruleCustomer ) ) (otherlv_13= ',' ( (lv_customers_14_0= ruleCustomer ) ) )* otherlv_15= '}' )? (otherlv_16= 'rentals' otherlv_17= '{' ( (lv_rentals_18_0= ruleRental ) ) (otherlv_19= ',' ( (lv_rentals_20_0= ruleRental ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleRentalAgency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_address_3_0 = null;

        EObject lv_objectsToRent_6_0 = null;

        EObject lv_objectsToRent_8_0 = null;

        EObject lv_customers_12_0 = null;

        EObject lv_customers_14_0 = null;

        EObject lv_rentals_18_0 = null;

        EObject lv_rentals_20_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:80:28: ( (otherlv_0= 'RentalAgency' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_address_3_0= ruleAddress ) )? (otherlv_4= 'objectsToRent' otherlv_5= '{' ( (lv_objectsToRent_6_0= ruleRentalObject ) ) (otherlv_7= ',' ( (lv_objectsToRent_8_0= ruleRentalObject ) ) )* otherlv_9= '}' )? (otherlv_10= 'customers' otherlv_11= '{' ( (lv_customers_12_0= ruleCustomer ) ) (otherlv_13= ',' ( (lv_customers_14_0= ruleCustomer ) ) )* otherlv_15= '}' )? (otherlv_16= 'rentals' otherlv_17= '{' ( (lv_rentals_18_0= ruleRental ) ) (otherlv_19= ',' ( (lv_rentals_20_0= ruleRental ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:81:1: (otherlv_0= 'RentalAgency' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_address_3_0= ruleAddress ) )? (otherlv_4= 'objectsToRent' otherlv_5= '{' ( (lv_objectsToRent_6_0= ruleRentalObject ) ) (otherlv_7= ',' ( (lv_objectsToRent_8_0= ruleRentalObject ) ) )* otherlv_9= '}' )? (otherlv_10= 'customers' otherlv_11= '{' ( (lv_customers_12_0= ruleCustomer ) ) (otherlv_13= ',' ( (lv_customers_14_0= ruleCustomer ) ) )* otherlv_15= '}' )? (otherlv_16= 'rentals' otherlv_17= '{' ( (lv_rentals_18_0= ruleRental ) ) (otherlv_19= ',' ( (lv_rentals_20_0= ruleRental ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:81:1: (otherlv_0= 'RentalAgency' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_address_3_0= ruleAddress ) )? (otherlv_4= 'objectsToRent' otherlv_5= '{' ( (lv_objectsToRent_6_0= ruleRentalObject ) ) (otherlv_7= ',' ( (lv_objectsToRent_8_0= ruleRentalObject ) ) )* otherlv_9= '}' )? (otherlv_10= 'customers' otherlv_11= '{' ( (lv_customers_12_0= ruleCustomer ) ) (otherlv_13= ',' ( (lv_customers_14_0= ruleCustomer ) ) )* otherlv_15= '}' )? (otherlv_16= 'rentals' otherlv_17= '{' ( (lv_rentals_18_0= ruleRental ) ) (otherlv_19= ',' ( (lv_rentals_20_0= ruleRental ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:81:3: otherlv_0= 'RentalAgency' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_address_3_0= ruleAddress ) )? (otherlv_4= 'objectsToRent' otherlv_5= '{' ( (lv_objectsToRent_6_0= ruleRentalObject ) ) (otherlv_7= ',' ( (lv_objectsToRent_8_0= ruleRentalObject ) ) )* otherlv_9= '}' )? (otherlv_10= 'customers' otherlv_11= '{' ( (lv_customers_12_0= ruleCustomer ) ) (otherlv_13= ',' ( (lv_customers_14_0= ruleCustomer ) ) )* otherlv_15= '}' )? (otherlv_16= 'rentals' otherlv_17= '{' ( (lv_rentals_18_0= ruleRental ) ) (otherlv_19= ',' ( (lv_rentals_20_0= ruleRental ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRentalAgency122); 

                	newLeafNode(otherlv_0, grammarAccess.getRentalAgencyAccess().getRentalAgencyKeyword_0());
                
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:85:1: ( (lv_name_1_0= ruleEString ) )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:86:1: (lv_name_1_0= ruleEString )
            {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:86:1: (lv_name_1_0= ruleEString )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:87:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRentalAgencyAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRentalAgency143);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRentalAgencyRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRentalAgency155); 

                	newLeafNode(otherlv_2, grammarAccess.getRentalAgencyAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:107:1: ( (lv_address_3_0= ruleAddress ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==18) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:108:1: (lv_address_3_0= ruleAddress )
                    {
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:108:1: (lv_address_3_0= ruleAddress )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:109:3: lv_address_3_0= ruleAddress
                    {
                     
                    	        newCompositeNode(grammarAccess.getRentalAgencyAccess().getAddressAddressParserRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAddress_in_ruleRentalAgency176);
                    lv_address_3_0=ruleAddress();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRentalAgencyRule());
                    	        }
                           		set(
                           			current, 
                           			"address",
                            		lv_address_3_0, 
                            		"Address");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:125:3: (otherlv_4= 'objectsToRent' otherlv_5= '{' ( (lv_objectsToRent_6_0= ruleRentalObject ) ) (otherlv_7= ',' ( (lv_objectsToRent_8_0= ruleRentalObject ) ) )* otherlv_9= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:125:5: otherlv_4= 'objectsToRent' otherlv_5= '{' ( (lv_objectsToRent_6_0= ruleRentalObject ) ) (otherlv_7= ',' ( (lv_objectsToRent_8_0= ruleRentalObject ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRentalAgency190); 

                        	newLeafNode(otherlv_4, grammarAccess.getRentalAgencyAccess().getObjectsToRentKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRentalAgency202); 

                        	newLeafNode(otherlv_5, grammarAccess.getRentalAgencyAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:133:1: ( (lv_objectsToRent_6_0= ruleRentalObject ) )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:134:1: (lv_objectsToRent_6_0= ruleRentalObject )
                    {
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:134:1: (lv_objectsToRent_6_0= ruleRentalObject )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:135:3: lv_objectsToRent_6_0= ruleRentalObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getRentalAgencyAccess().getObjectsToRentRentalObjectParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRentalObject_in_ruleRentalAgency223);
                    lv_objectsToRent_6_0=ruleRentalObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRentalAgencyRule());
                    	        }
                           		add(
                           			current, 
                           			"objectsToRent",
                            		lv_objectsToRent_6_0, 
                            		"RentalObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:151:2: (otherlv_7= ',' ( (lv_objectsToRent_8_0= ruleRentalObject ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==14) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:151:4: otherlv_7= ',' ( (lv_objectsToRent_8_0= ruleRentalObject ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRentalAgency236); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getRentalAgencyAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:155:1: ( (lv_objectsToRent_8_0= ruleRentalObject ) )
                    	    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:156:1: (lv_objectsToRent_8_0= ruleRentalObject )
                    	    {
                    	    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:156:1: (lv_objectsToRent_8_0= ruleRentalObject )
                    	    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:157:3: lv_objectsToRent_8_0= ruleRentalObject
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRentalAgencyAccess().getObjectsToRentRentalObjectParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRentalObject_in_ruleRentalAgency257);
                    	    lv_objectsToRent_8_0=ruleRentalObject();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRentalAgencyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"objectsToRent",
                    	            		lv_objectsToRent_8_0, 
                    	            		"RentalObject");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRentalAgency271); 

                        	newLeafNode(otherlv_9, grammarAccess.getRentalAgencyAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:177:3: (otherlv_10= 'customers' otherlv_11= '{' ( (lv_customers_12_0= ruleCustomer ) ) (otherlv_13= ',' ( (lv_customers_14_0= ruleCustomer ) ) )* otherlv_15= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:177:5: otherlv_10= 'customers' otherlv_11= '{' ( (lv_customers_12_0= ruleCustomer ) ) (otherlv_13= ',' ( (lv_customers_14_0= ruleCustomer ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRentalAgency286); 

                        	newLeafNode(otherlv_10, grammarAccess.getRentalAgencyAccess().getCustomersKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRentalAgency298); 

                        	newLeafNode(otherlv_11, grammarAccess.getRentalAgencyAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:185:1: ( (lv_customers_12_0= ruleCustomer ) )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:186:1: (lv_customers_12_0= ruleCustomer )
                    {
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:186:1: (lv_customers_12_0= ruleCustomer )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:187:3: lv_customers_12_0= ruleCustomer
                    {
                     
                    	        newCompositeNode(grammarAccess.getRentalAgencyAccess().getCustomersCustomerParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCustomer_in_ruleRentalAgency319);
                    lv_customers_12_0=ruleCustomer();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRentalAgencyRule());
                    	        }
                           		add(
                           			current, 
                           			"customers",
                            		lv_customers_12_0, 
                            		"Customer");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:203:2: (otherlv_13= ',' ( (lv_customers_14_0= ruleCustomer ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:203:4: otherlv_13= ',' ( (lv_customers_14_0= ruleCustomer ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRentalAgency332); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getRentalAgencyAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:207:1: ( (lv_customers_14_0= ruleCustomer ) )
                    	    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:208:1: (lv_customers_14_0= ruleCustomer )
                    	    {
                    	    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:208:1: (lv_customers_14_0= ruleCustomer )
                    	    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:209:3: lv_customers_14_0= ruleCustomer
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRentalAgencyAccess().getCustomersCustomerParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleCustomer_in_ruleRentalAgency353);
                    	    lv_customers_14_0=ruleCustomer();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRentalAgencyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"customers",
                    	            		lv_customers_14_0, 
                    	            		"Customer");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRentalAgency367); 

                        	newLeafNode(otherlv_15, grammarAccess.getRentalAgencyAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:229:3: (otherlv_16= 'rentals' otherlv_17= '{' ( (lv_rentals_18_0= ruleRental ) ) (otherlv_19= ',' ( (lv_rentals_20_0= ruleRental ) ) )* otherlv_21= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:229:5: otherlv_16= 'rentals' otherlv_17= '{' ( (lv_rentals_18_0= ruleRental ) ) (otherlv_19= ',' ( (lv_rentals_20_0= ruleRental ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRentalAgency382); 

                        	newLeafNode(otherlv_16, grammarAccess.getRentalAgencyAccess().getRentalsKeyword_6_0());
                        
                    otherlv_17=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRentalAgency394); 

                        	newLeafNode(otherlv_17, grammarAccess.getRentalAgencyAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:237:1: ( (lv_rentals_18_0= ruleRental ) )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:238:1: (lv_rentals_18_0= ruleRental )
                    {
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:238:1: (lv_rentals_18_0= ruleRental )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:239:3: lv_rentals_18_0= ruleRental
                    {
                     
                    	        newCompositeNode(grammarAccess.getRentalAgencyAccess().getRentalsRentalParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRental_in_ruleRentalAgency415);
                    lv_rentals_18_0=ruleRental();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRentalAgencyRule());
                    	        }
                           		add(
                           			current, 
                           			"rentals",
                            		lv_rentals_18_0, 
                            		"Rental");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:255:2: (otherlv_19= ',' ( (lv_rentals_20_0= ruleRental ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:255:4: otherlv_19= ',' ( (lv_rentals_20_0= ruleRental ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRentalAgency428); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getRentalAgencyAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:259:1: ( (lv_rentals_20_0= ruleRental ) )
                    	    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:260:1: (lv_rentals_20_0= ruleRental )
                    	    {
                    	    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:260:1: (lv_rentals_20_0= ruleRental )
                    	    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:261:3: lv_rentals_20_0= ruleRental
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRentalAgencyAccess().getRentalsRentalParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRental_in_ruleRentalAgency449);
                    	    lv_rentals_20_0=ruleRental();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRentalAgencyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"rentals",
                    	            		lv_rentals_20_0, 
                    	            		"Rental");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRentalAgency463); 

                        	newLeafNode(otherlv_21, grammarAccess.getRentalAgencyAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRentalAgency477); 

                	newLeafNode(otherlv_22, grammarAccess.getRentalAgencyAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRentalAgency"


    // $ANTLR start "entryRuleEString"
    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:293:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:294:2: (iv_ruleEString= ruleEString EOF )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:295:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString514);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString525); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:302:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:305:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:306:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:306:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:306:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString565); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:314:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString591); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAddress"
    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:329:1: entryRuleAddress returns [EObject current=null] : iv_ruleAddress= ruleAddress EOF ;
    public final EObject entryRuleAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddress = null;


        try {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:330:2: (iv_ruleAddress= ruleAddress EOF )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:331:2: iv_ruleAddress= ruleAddress EOF
            {
             newCompositeNode(grammarAccess.getAddressRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddress_in_entryRuleAddress636);
            iv_ruleAddress=ruleAddress();

            state._fsp--;

             current =iv_ruleAddress; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddress646); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddress"


    // $ANTLR start "ruleAddress"
    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:338:1: ruleAddress returns [EObject current=null] : ( () otherlv_1= 'Address' otherlv_2= '{' (otherlv_3= 'streetType' ( (lv_streetType_4_0= ruleStreetType ) ) )? (otherlv_5= 'number' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= 'zipCode' ( (lv_zipCode_8_0= ruleEString ) ) )? (otherlv_9= 'city' ( (lv_city_10_0= ruleEString ) ) )? (otherlv_11= 'streetName' ( (lv_streetName_12_0= ruleEString ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Enumerator lv_streetType_4_0 = null;

        AntlrDatatypeRuleToken lv_number_6_0 = null;

        AntlrDatatypeRuleToken lv_zipCode_8_0 = null;

        AntlrDatatypeRuleToken lv_city_10_0 = null;

        AntlrDatatypeRuleToken lv_streetName_12_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:341:28: ( ( () otherlv_1= 'Address' otherlv_2= '{' (otherlv_3= 'streetType' ( (lv_streetType_4_0= ruleStreetType ) ) )? (otherlv_5= 'number' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= 'zipCode' ( (lv_zipCode_8_0= ruleEString ) ) )? (otherlv_9= 'city' ( (lv_city_10_0= ruleEString ) ) )? (otherlv_11= 'streetName' ( (lv_streetName_12_0= ruleEString ) ) )? otherlv_13= '}' ) )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:342:1: ( () otherlv_1= 'Address' otherlv_2= '{' (otherlv_3= 'streetType' ( (lv_streetType_4_0= ruleStreetType ) ) )? (otherlv_5= 'number' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= 'zipCode' ( (lv_zipCode_8_0= ruleEString ) ) )? (otherlv_9= 'city' ( (lv_city_10_0= ruleEString ) ) )? (otherlv_11= 'streetName' ( (lv_streetName_12_0= ruleEString ) ) )? otherlv_13= '}' )
            {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:342:1: ( () otherlv_1= 'Address' otherlv_2= '{' (otherlv_3= 'streetType' ( (lv_streetType_4_0= ruleStreetType ) ) )? (otherlv_5= 'number' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= 'zipCode' ( (lv_zipCode_8_0= ruleEString ) ) )? (otherlv_9= 'city' ( (lv_city_10_0= ruleEString ) ) )? (otherlv_11= 'streetName' ( (lv_streetName_12_0= ruleEString ) ) )? otherlv_13= '}' )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:342:2: () otherlv_1= 'Address' otherlv_2= '{' (otherlv_3= 'streetType' ( (lv_streetType_4_0= ruleStreetType ) ) )? (otherlv_5= 'number' ( (lv_number_6_0= ruleEInt ) ) )? (otherlv_7= 'zipCode' ( (lv_zipCode_8_0= ruleEString ) ) )? (otherlv_9= 'city' ( (lv_city_10_0= ruleEString ) ) )? (otherlv_11= 'streetName' ( (lv_streetName_12_0= ruleEString ) ) )? otherlv_13= '}'
            {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:342:2: ()
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:343:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAddressAccess().getAddressAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAddress692); 

                	newLeafNode(otherlv_1, grammarAccess.getAddressAccess().getAddressKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAddress704); 

                	newLeafNode(otherlv_2, grammarAccess.getAddressAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:356:1: (otherlv_3= 'streetType' ( (lv_streetType_4_0= ruleStreetType ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:356:3: otherlv_3= 'streetType' ( (lv_streetType_4_0= ruleStreetType ) )
                    {
                    otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAddress717); 

                        	newLeafNode(otherlv_3, grammarAccess.getAddressAccess().getStreetTypeKeyword_3_0());
                        
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:360:1: ( (lv_streetType_4_0= ruleStreetType ) )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:361:1: (lv_streetType_4_0= ruleStreetType )
                    {
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:361:1: (lv_streetType_4_0= ruleStreetType )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:362:3: lv_streetType_4_0= ruleStreetType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAddressAccess().getStreetTypeStreetTypeEnumRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStreetType_in_ruleAddress738);
                    lv_streetType_4_0=ruleStreetType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAddressRule());
                    	        }
                           		set(
                           			current, 
                           			"streetType",
                            		lv_streetType_4_0, 
                            		"StreetType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:378:4: (otherlv_5= 'number' ( (lv_number_6_0= ruleEInt ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:378:6: otherlv_5= 'number' ( (lv_number_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAddress753); 

                        	newLeafNode(otherlv_5, grammarAccess.getAddressAccess().getNumberKeyword_4_0());
                        
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:382:1: ( (lv_number_6_0= ruleEInt ) )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:383:1: (lv_number_6_0= ruleEInt )
                    {
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:383:1: (lv_number_6_0= ruleEInt )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:384:3: lv_number_6_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getAddressAccess().getNumberEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleAddress774);
                    lv_number_6_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAddressRule());
                    	        }
                           		set(
                           			current, 
                           			"number",
                            		lv_number_6_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:400:4: (otherlv_7= 'zipCode' ( (lv_zipCode_8_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:400:6: otherlv_7= 'zipCode' ( (lv_zipCode_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAddress789); 

                        	newLeafNode(otherlv_7, grammarAccess.getAddressAccess().getZipCodeKeyword_5_0());
                        
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:404:1: ( (lv_zipCode_8_0= ruleEString ) )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:405:1: (lv_zipCode_8_0= ruleEString )
                    {
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:405:1: (lv_zipCode_8_0= ruleEString )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:406:3: lv_zipCode_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAddressAccess().getZipCodeEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAddress810);
                    lv_zipCode_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAddressRule());
                    	        }
                           		set(
                           			current, 
                           			"zipCode",
                            		lv_zipCode_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:422:4: (otherlv_9= 'city' ( (lv_city_10_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:422:6: otherlv_9= 'city' ( (lv_city_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAddress825); 

                        	newLeafNode(otherlv_9, grammarAccess.getAddressAccess().getCityKeyword_6_0());
                        
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:426:1: ( (lv_city_10_0= ruleEString ) )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:427:1: (lv_city_10_0= ruleEString )
                    {
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:427:1: (lv_city_10_0= ruleEString )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:428:3: lv_city_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAddressAccess().getCityEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAddress846);
                    lv_city_10_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAddressRule());
                    	        }
                           		set(
                           			current, 
                           			"city",
                            		lv_city_10_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:444:4: (otherlv_11= 'streetName' ( (lv_streetName_12_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:444:6: otherlv_11= 'streetName' ( (lv_streetName_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAddress861); 

                        	newLeafNode(otherlv_11, grammarAccess.getAddressAccess().getStreetNameKeyword_7_0());
                        
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:448:1: ( (lv_streetName_12_0= ruleEString ) )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:449:1: (lv_streetName_12_0= ruleEString )
                    {
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:449:1: (lv_streetName_12_0= ruleEString )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:450:3: lv_streetName_12_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAddressAccess().getStreetNameEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAddress882);
                    lv_streetName_12_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAddressRule());
                    	        }
                           		set(
                           			current, 
                           			"streetName",
                            		lv_streetName_12_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAddress896); 

                	newLeafNode(otherlv_13, grammarAccess.getAddressAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddress"


    // $ANTLR start "entryRuleRentalObject"
    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:478:1: entryRuleRentalObject returns [EObject current=null] : iv_ruleRentalObject= ruleRentalObject EOF ;
    public final EObject entryRuleRentalObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRentalObject = null;


        try {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:479:2: (iv_ruleRentalObject= ruleRentalObject EOF )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:480:2: iv_ruleRentalObject= ruleRentalObject EOF
            {
             newCompositeNode(grammarAccess.getRentalObjectRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRentalObject_in_entryRuleRentalObject932);
            iv_ruleRentalObject=ruleRentalObject();

            state._fsp--;

             current =iv_ruleRentalObject; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRentalObject942); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRentalObject"


    // $ANTLR start "ruleRentalObject"
    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:487:1: ruleRentalObject returns [EObject current=null] : ( () ( (lv_available_1_0= 'available' ) )? otherlv_2= 'RentalObject' ( (lv_ID_3_0= ruleELong ) ) otherlv_4= '{' otherlv_5= 'name' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleRentalObject() throws RecognitionException {
        EObject current = null;

        Token lv_available_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_ID_3_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:490:28: ( ( () ( (lv_available_1_0= 'available' ) )? otherlv_2= 'RentalObject' ( (lv_ID_3_0= ruleELong ) ) otherlv_4= '{' otherlv_5= 'name' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '}' ) )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:491:1: ( () ( (lv_available_1_0= 'available' ) )? otherlv_2= 'RentalObject' ( (lv_ID_3_0= ruleELong ) ) otherlv_4= '{' otherlv_5= 'name' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '}' )
            {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:491:1: ( () ( (lv_available_1_0= 'available' ) )? otherlv_2= 'RentalObject' ( (lv_ID_3_0= ruleELong ) ) otherlv_4= '{' otherlv_5= 'name' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '}' )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:491:2: () ( (lv_available_1_0= 'available' ) )? otherlv_2= 'RentalObject' ( (lv_ID_3_0= ruleELong ) ) otherlv_4= '{' otherlv_5= 'name' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '}'
            {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:491:2: ()
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:492:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRentalObjectAccess().getRentalObjectAction_0(),
                        current);
                

            }

            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:497:2: ( (lv_available_1_0= 'available' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:498:1: (lv_available_1_0= 'available' )
                    {
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:498:1: (lv_available_1_0= 'available' )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:499:3: lv_available_1_0= 'available'
                    {
                    lv_available_1_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRentalObject994); 

                            newLeafNode(lv_available_1_0, grammarAccess.getRentalObjectAccess().getAvailableAvailableKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRentalObjectRule());
                    	        }
                           		setWithLastConsumed(current, "available", true, "available");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleRentalObject1020); 

                	newLeafNode(otherlv_2, grammarAccess.getRentalObjectAccess().getRentalObjectKeyword_2());
                
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:516:1: ( (lv_ID_3_0= ruleELong ) )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:517:1: (lv_ID_3_0= ruleELong )
            {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:517:1: (lv_ID_3_0= ruleELong )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:518:3: lv_ID_3_0= ruleELong
            {
             
            	        newCompositeNode(grammarAccess.getRentalObjectAccess().getIDELongParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleELong_in_ruleRentalObject1041);
            lv_ID_3_0=ruleELong();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRentalObjectRule());
            	        }
                   		set(
                   			current, 
                   			"ID",
                    		lv_ID_3_0, 
                    		"ELong");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRentalObject1053); 

                	newLeafNode(otherlv_4, grammarAccess.getRentalObjectAccess().getLeftCurlyBracketKeyword_4());
                
            otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRentalObject1065); 

                	newLeafNode(otherlv_5, grammarAccess.getRentalObjectAccess().getNameKeyword_5());
                
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:542:1: ( (lv_name_6_0= ruleEString ) )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:543:1: (lv_name_6_0= ruleEString )
            {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:543:1: (lv_name_6_0= ruleEString )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:544:3: lv_name_6_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRentalObjectAccess().getNameEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRentalObject1086);
            lv_name_6_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRentalObjectRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_6_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRentalObject1098); 

                	newLeafNode(otherlv_7, grammarAccess.getRentalObjectAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRentalObject"


    // $ANTLR start "entryRuleCustomer"
    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:572:1: entryRuleCustomer returns [EObject current=null] : iv_ruleCustomer= ruleCustomer EOF ;
    public final EObject entryRuleCustomer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomer = null;


        try {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:573:2: (iv_ruleCustomer= ruleCustomer EOF )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:574:2: iv_ruleCustomer= ruleCustomer EOF
            {
             newCompositeNode(grammarAccess.getCustomerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCustomer_in_entryRuleCustomer1134);
            iv_ruleCustomer=ruleCustomer();

            state._fsp--;

             current =iv_ruleCustomer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCustomer1144); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCustomer"


    // $ANTLR start "ruleCustomer"
    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:581:1: ruleCustomer returns [EObject current=null] : (otherlv_0= 'Customer' ( (lv_ID_1_0= ruleELong ) ) otherlv_2= '{' otherlv_3= 'firstName' ( (lv_firstName_4_0= ruleEString ) ) otherlv_5= 'lastName' ( (lv_lastName_6_0= ruleEString ) ) ( (lv_address_7_0= ruleAddress ) )? (otherlv_8= 'licenses' otherlv_9= '{' ( (lv_licenses_10_0= ruleLicense ) ) (otherlv_11= ',' ( (lv_licenses_12_0= ruleLicense ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject ruleCustomer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_ID_1_0 = null;

        AntlrDatatypeRuleToken lv_firstName_4_0 = null;

        AntlrDatatypeRuleToken lv_lastName_6_0 = null;

        EObject lv_address_7_0 = null;

        EObject lv_licenses_10_0 = null;

        EObject lv_licenses_12_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:584:28: ( (otherlv_0= 'Customer' ( (lv_ID_1_0= ruleELong ) ) otherlv_2= '{' otherlv_3= 'firstName' ( (lv_firstName_4_0= ruleEString ) ) otherlv_5= 'lastName' ( (lv_lastName_6_0= ruleEString ) ) ( (lv_address_7_0= ruleAddress ) )? (otherlv_8= 'licenses' otherlv_9= '{' ( (lv_licenses_10_0= ruleLicense ) ) (otherlv_11= ',' ( (lv_licenses_12_0= ruleLicense ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:585:1: (otherlv_0= 'Customer' ( (lv_ID_1_0= ruleELong ) ) otherlv_2= '{' otherlv_3= 'firstName' ( (lv_firstName_4_0= ruleEString ) ) otherlv_5= 'lastName' ( (lv_lastName_6_0= ruleEString ) ) ( (lv_address_7_0= ruleAddress ) )? (otherlv_8= 'licenses' otherlv_9= '{' ( (lv_licenses_10_0= ruleLicense ) ) (otherlv_11= ',' ( (lv_licenses_12_0= ruleLicense ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:585:1: (otherlv_0= 'Customer' ( (lv_ID_1_0= ruleELong ) ) otherlv_2= '{' otherlv_3= 'firstName' ( (lv_firstName_4_0= ruleEString ) ) otherlv_5= 'lastName' ( (lv_lastName_6_0= ruleEString ) ) ( (lv_address_7_0= ruleAddress ) )? (otherlv_8= 'licenses' otherlv_9= '{' ( (lv_licenses_10_0= ruleLicense ) ) (otherlv_11= ',' ( (lv_licenses_12_0= ruleLicense ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:585:3: otherlv_0= 'Customer' ( (lv_ID_1_0= ruleELong ) ) otherlv_2= '{' otherlv_3= 'firstName' ( (lv_firstName_4_0= ruleEString ) ) otherlv_5= 'lastName' ( (lv_lastName_6_0= ruleEString ) ) ( (lv_address_7_0= ruleAddress ) )? (otherlv_8= 'licenses' otherlv_9= '{' ( (lv_licenses_10_0= ruleLicense ) ) (otherlv_11= ',' ( (lv_licenses_12_0= ruleLicense ) ) )* otherlv_13= '}' )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleCustomer1181); 

                	newLeafNode(otherlv_0, grammarAccess.getCustomerAccess().getCustomerKeyword_0());
                
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:589:1: ( (lv_ID_1_0= ruleELong ) )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:590:1: (lv_ID_1_0= ruleELong )
            {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:590:1: (lv_ID_1_0= ruleELong )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:591:3: lv_ID_1_0= ruleELong
            {
             
            	        newCompositeNode(grammarAccess.getCustomerAccess().getIDELongParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleELong_in_ruleCustomer1202);
            lv_ID_1_0=ruleELong();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCustomerRule());
            	        }
                   		set(
                   			current, 
                   			"ID",
                    		lv_ID_1_0, 
                    		"ELong");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCustomer1214); 

                	newLeafNode(otherlv_2, grammarAccess.getCustomerAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleCustomer1226); 

                	newLeafNode(otherlv_3, grammarAccess.getCustomerAccess().getFirstNameKeyword_3());
                
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:615:1: ( (lv_firstName_4_0= ruleEString ) )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:616:1: (lv_firstName_4_0= ruleEString )
            {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:616:1: (lv_firstName_4_0= ruleEString )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:617:3: lv_firstName_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCustomerAccess().getFirstNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCustomer1247);
            lv_firstName_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCustomerRule());
            	        }
                   		set(
                   			current, 
                   			"firstName",
                    		lv_firstName_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCustomer1259); 

                	newLeafNode(otherlv_5, grammarAccess.getCustomerAccess().getLastNameKeyword_5());
                
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:637:1: ( (lv_lastName_6_0= ruleEString ) )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:638:1: (lv_lastName_6_0= ruleEString )
            {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:638:1: (lv_lastName_6_0= ruleEString )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:639:3: lv_lastName_6_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCustomerAccess().getLastNameEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCustomer1280);
            lv_lastName_6_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCustomerRule());
            	        }
                   		set(
                   			current, 
                   			"lastName",
                    		lv_lastName_6_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:655:2: ( (lv_address_7_0= ruleAddress ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:656:1: (lv_address_7_0= ruleAddress )
                    {
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:656:1: (lv_address_7_0= ruleAddress )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:657:3: lv_address_7_0= ruleAddress
                    {
                     
                    	        newCompositeNode(grammarAccess.getCustomerAccess().getAddressAddressParserRuleCall_7_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAddress_in_ruleCustomer1301);
                    lv_address_7_0=ruleAddress();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCustomerRule());
                    	        }
                           		set(
                           			current, 
                           			"address",
                            		lv_address_7_0, 
                            		"Address");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:673:3: (otherlv_8= 'licenses' otherlv_9= '{' ( (lv_licenses_10_0= ruleLicense ) ) (otherlv_11= ',' ( (lv_licenses_12_0= ruleLicense ) ) )* otherlv_13= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:673:5: otherlv_8= 'licenses' otherlv_9= '{' ( (lv_licenses_10_0= ruleLicense ) ) (otherlv_11= ',' ( (lv_licenses_12_0= ruleLicense ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCustomer1315); 

                        	newLeafNode(otherlv_8, grammarAccess.getCustomerAccess().getLicensesKeyword_8_0());
                        
                    otherlv_9=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCustomer1327); 

                        	newLeafNode(otherlv_9, grammarAccess.getCustomerAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:681:1: ( (lv_licenses_10_0= ruleLicense ) )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:682:1: (lv_licenses_10_0= ruleLicense )
                    {
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:682:1: (lv_licenses_10_0= ruleLicense )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:683:3: lv_licenses_10_0= ruleLicense
                    {
                     
                    	        newCompositeNode(grammarAccess.getCustomerAccess().getLicensesLicenseParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLicense_in_ruleCustomer1348);
                    lv_licenses_10_0=ruleLicense();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCustomerRule());
                    	        }
                           		add(
                           			current, 
                           			"licenses",
                            		lv_licenses_10_0, 
                            		"License");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:699:2: (otherlv_11= ',' ( (lv_licenses_12_0= ruleLicense ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:699:4: otherlv_11= ',' ( (lv_licenses_12_0= ruleLicense ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCustomer1361); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getCustomerAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:703:1: ( (lv_licenses_12_0= ruleLicense ) )
                    	    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:704:1: (lv_licenses_12_0= ruleLicense )
                    	    {
                    	    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:704:1: (lv_licenses_12_0= ruleLicense )
                    	    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:705:3: lv_licenses_12_0= ruleLicense
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCustomerAccess().getLicensesLicenseParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleLicense_in_ruleCustomer1382);
                    	    lv_licenses_12_0=ruleLicense();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCustomerRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"licenses",
                    	            		lv_licenses_12_0, 
                    	            		"License");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCustomer1396); 

                        	newLeafNode(otherlv_13, grammarAccess.getCustomerAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCustomer1410); 

                	newLeafNode(otherlv_14, grammarAccess.getCustomerAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCustomer"


    // $ANTLR start "entryRuleRental"
    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:737:1: entryRuleRental returns [EObject current=null] : iv_ruleRental= ruleRental EOF ;
    public final EObject entryRuleRental() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRental = null;


        try {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:738:2: (iv_ruleRental= ruleRental EOF )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:739:2: iv_ruleRental= ruleRental EOF
            {
             newCompositeNode(grammarAccess.getRentalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRental_in_entryRuleRental1446);
            iv_ruleRental=ruleRental();

            state._fsp--;

             current =iv_ruleRental; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRental1456); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRental"


    // $ANTLR start "ruleRental"
    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:746:1: ruleRental returns [EObject current=null] : (otherlv_0= 'Rental' otherlv_1= '{' (otherlv_2= 'startDate' ( (lv_startDate_3_0= ruleEDate ) ) )? (otherlv_4= 'endDate' ( (lv_endDate_5_0= ruleEDate ) ) )? otherlv_6= 'customer' ( ( ruleEString ) ) (otherlv_8= 'rentedObject' ( ( ruleEString ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleRental() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_startDate_3_0 = null;

        AntlrDatatypeRuleToken lv_endDate_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:749:28: ( (otherlv_0= 'Rental' otherlv_1= '{' (otherlv_2= 'startDate' ( (lv_startDate_3_0= ruleEDate ) ) )? (otherlv_4= 'endDate' ( (lv_endDate_5_0= ruleEDate ) ) )? otherlv_6= 'customer' ( ( ruleEString ) ) (otherlv_8= 'rentedObject' ( ( ruleEString ) ) )? otherlv_10= '}' ) )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:750:1: (otherlv_0= 'Rental' otherlv_1= '{' (otherlv_2= 'startDate' ( (lv_startDate_3_0= ruleEDate ) ) )? (otherlv_4= 'endDate' ( (lv_endDate_5_0= ruleEDate ) ) )? otherlv_6= 'customer' ( ( ruleEString ) ) (otherlv_8= 'rentedObject' ( ( ruleEString ) ) )? otherlv_10= '}' )
            {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:750:1: (otherlv_0= 'Rental' otherlv_1= '{' (otherlv_2= 'startDate' ( (lv_startDate_3_0= ruleEDate ) ) )? (otherlv_4= 'endDate' ( (lv_endDate_5_0= ruleEDate ) ) )? otherlv_6= 'customer' ( ( ruleEString ) ) (otherlv_8= 'rentedObject' ( ( ruleEString ) ) )? otherlv_10= '}' )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:750:3: otherlv_0= 'Rental' otherlv_1= '{' (otherlv_2= 'startDate' ( (lv_startDate_3_0= ruleEDate ) ) )? (otherlv_4= 'endDate' ( (lv_endDate_5_0= ruleEDate ) ) )? otherlv_6= 'customer' ( ( ruleEString ) ) (otherlv_8= 'rentedObject' ( ( ruleEString ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRental1493); 

                	newLeafNode(otherlv_0, grammarAccess.getRentalAccess().getRentalKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRental1505); 

                	newLeafNode(otherlv_1, grammarAccess.getRentalAccess().getLeftCurlyBracketKeyword_1());
                
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:758:1: (otherlv_2= 'startDate' ( (lv_startDate_3_0= ruleEDate ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:758:3: otherlv_2= 'startDate' ( (lv_startDate_3_0= ruleEDate ) )
                    {
                    otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleRental1518); 

                        	newLeafNode(otherlv_2, grammarAccess.getRentalAccess().getStartDateKeyword_2_0());
                        
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:762:1: ( (lv_startDate_3_0= ruleEDate ) )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:763:1: (lv_startDate_3_0= ruleEDate )
                    {
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:763:1: (lv_startDate_3_0= ruleEDate )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:764:3: lv_startDate_3_0= ruleEDate
                    {
                     
                    	        newCompositeNode(grammarAccess.getRentalAccess().getStartDateEDateParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEDate_in_ruleRental1539);
                    lv_startDate_3_0=ruleEDate();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRentalRule());
                    	        }
                           		set(
                           			current, 
                           			"startDate",
                            		lv_startDate_3_0, 
                            		"EDate");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:780:4: (otherlv_4= 'endDate' ( (lv_endDate_5_0= ruleEDate ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:780:6: otherlv_4= 'endDate' ( (lv_endDate_5_0= ruleEDate ) )
                    {
                    otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleRental1554); 

                        	newLeafNode(otherlv_4, grammarAccess.getRentalAccess().getEndDateKeyword_3_0());
                        
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:784:1: ( (lv_endDate_5_0= ruleEDate ) )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:785:1: (lv_endDate_5_0= ruleEDate )
                    {
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:785:1: (lv_endDate_5_0= ruleEDate )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:786:3: lv_endDate_5_0= ruleEDate
                    {
                     
                    	        newCompositeNode(grammarAccess.getRentalAccess().getEndDateEDateParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEDate_in_ruleRental1575);
                    lv_endDate_5_0=ruleEDate();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRentalRule());
                    	        }
                           		set(
                           			current, 
                           			"endDate",
                            		lv_endDate_5_0, 
                            		"EDate");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleRental1589); 

                	newLeafNode(otherlv_6, grammarAccess.getRentalAccess().getCustomerKeyword_4());
                
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:806:1: ( ( ruleEString ) )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:807:1: ( ruleEString )
            {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:807:1: ( ruleEString )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:808:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRentalRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRentalAccess().getCustomerCustomerCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRental1612);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:821:2: (otherlv_8= 'rentedObject' ( ( ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:821:4: otherlv_8= 'rentedObject' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleRental1625); 

                        	newLeafNode(otherlv_8, grammarAccess.getRentalAccess().getRentedObjectKeyword_6_0());
                        
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:825:1: ( ( ruleEString ) )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:826:1: ( ruleEString )
                    {
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:826:1: ( ruleEString )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:827:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRentalRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRentalAccess().getRentedObjectRentalObjectCrossReference_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRental1648);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRental1662); 

                	newLeafNode(otherlv_10, grammarAccess.getRentalAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRental"


    // $ANTLR start "entryRuleEInt"
    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:852:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:853:2: (iv_ruleEInt= ruleEInt EOF )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:854:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1699);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1710); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:861:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:864:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:865:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:865:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:865:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:865:2: (kw= '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:866:2: kw= '-'
                    {
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleEInt1749); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1766); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleELong"
    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:886:1: entryRuleELong returns [String current=null] : iv_ruleELong= ruleELong EOF ;
    public final String entryRuleELong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELong = null;


        try {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:887:2: (iv_ruleELong= ruleELong EOF )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:888:2: iv_ruleELong= ruleELong EOF
            {
             newCompositeNode(grammarAccess.getELongRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleELong_in_entryRuleELong1812);
            iv_ruleELong=ruleELong();

            state._fsp--;

             current =iv_ruleELong.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleELong1823); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleELong"


    // $ANTLR start "ruleELong"
    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:895:1: ruleELong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleELong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:898:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:899:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:899:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:899:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:899:2: (kw= '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:900:2: kw= '-'
                    {
                    kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleELong1862); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getELongAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleELong1879); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getELongAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleELong"


    // $ANTLR start "entryRuleLicense"
    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:922:1: entryRuleLicense returns [EObject current=null] : iv_ruleLicense= ruleLicense EOF ;
    public final EObject entryRuleLicense() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLicense = null;


        try {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:923:2: (iv_ruleLicense= ruleLicense EOF )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:924:2: iv_ruleLicense= ruleLicense EOF
            {
             newCompositeNode(grammarAccess.getLicenseRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLicense_in_entryRuleLicense1926);
            iv_ruleLicense=ruleLicense();

            state._fsp--;

             current =iv_ruleLicense; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLicense1936); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLicense"


    // $ANTLR start "ruleLicense"
    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:931:1: ruleLicense returns [EObject current=null] : ( () otherlv_1= 'License' otherlv_2= '{' (otherlv_3= 'number' ( (lv_number_4_0= ruleEInt ) ) )? (otherlv_5= 'validityDate' ( (lv_validityDate_6_0= ruleEDate ) ) )? (otherlv_7= 'EReference0' ( ( ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleLicense() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_number_4_0 = null;

        AntlrDatatypeRuleToken lv_validityDate_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:934:28: ( ( () otherlv_1= 'License' otherlv_2= '{' (otherlv_3= 'number' ( (lv_number_4_0= ruleEInt ) ) )? (otherlv_5= 'validityDate' ( (lv_validityDate_6_0= ruleEDate ) ) )? (otherlv_7= 'EReference0' ( ( ruleEString ) ) )? otherlv_9= '}' ) )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:935:1: ( () otherlv_1= 'License' otherlv_2= '{' (otherlv_3= 'number' ( (lv_number_4_0= ruleEInt ) ) )? (otherlv_5= 'validityDate' ( (lv_validityDate_6_0= ruleEDate ) ) )? (otherlv_7= 'EReference0' ( ( ruleEString ) ) )? otherlv_9= '}' )
            {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:935:1: ( () otherlv_1= 'License' otherlv_2= '{' (otherlv_3= 'number' ( (lv_number_4_0= ruleEInt ) ) )? (otherlv_5= 'validityDate' ( (lv_validityDate_6_0= ruleEDate ) ) )? (otherlv_7= 'EReference0' ( ( ruleEString ) ) )? otherlv_9= '}' )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:935:2: () otherlv_1= 'License' otherlv_2= '{' (otherlv_3= 'number' ( (lv_number_4_0= ruleEInt ) ) )? (otherlv_5= 'validityDate' ( (lv_validityDate_6_0= ruleEDate ) ) )? (otherlv_7= 'EReference0' ( ( ruleEString ) ) )? otherlv_9= '}'
            {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:935:2: ()
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:936:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLicenseAccess().getLicenseAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleLicense1982); 

                	newLeafNode(otherlv_1, grammarAccess.getLicenseAccess().getLicenseKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLicense1994); 

                	newLeafNode(otherlv_2, grammarAccess.getLicenseAccess().getLeftCurlyBracketKeyword_2());
                
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:949:1: (otherlv_3= 'number' ( (lv_number_4_0= ruleEInt ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==20) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:949:3: otherlv_3= 'number' ( (lv_number_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleLicense2007); 

                        	newLeafNode(otherlv_3, grammarAccess.getLicenseAccess().getNumberKeyword_3_0());
                        
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:953:1: ( (lv_number_4_0= ruleEInt ) )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:954:1: (lv_number_4_0= ruleEInt )
                    {
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:954:1: (lv_number_4_0= ruleEInt )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:955:3: lv_number_4_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getLicenseAccess().getNumberEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleLicense2028);
                    lv_number_4_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLicenseRule());
                    	        }
                           		set(
                           			current, 
                           			"number",
                            		lv_number_4_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:971:4: (otherlv_5= 'validityDate' ( (lv_validityDate_6_0= ruleEDate ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:971:6: otherlv_5= 'validityDate' ( (lv_validityDate_6_0= ruleEDate ) )
                    {
                    otherlv_5=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleLicense2043); 

                        	newLeafNode(otherlv_5, grammarAccess.getLicenseAccess().getValidityDateKeyword_4_0());
                        
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:975:1: ( (lv_validityDate_6_0= ruleEDate ) )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:976:1: (lv_validityDate_6_0= ruleEDate )
                    {
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:976:1: (lv_validityDate_6_0= ruleEDate )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:977:3: lv_validityDate_6_0= ruleEDate
                    {
                     
                    	        newCompositeNode(grammarAccess.getLicenseAccess().getValidityDateEDateParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEDate_in_ruleLicense2064);
                    lv_validityDate_6_0=ruleEDate();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLicenseRule());
                    	        }
                           		set(
                           			current, 
                           			"validityDate",
                            		lv_validityDate_6_0, 
                            		"EDate");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:993:4: (otherlv_7= 'EReference0' ( ( ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:993:6: otherlv_7= 'EReference0' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleLicense2079); 

                        	newLeafNode(otherlv_7, grammarAccess.getLicenseAccess().getEReference0Keyword_5_0());
                        
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:997:1: ( ( ruleEString ) )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:998:1: ( ruleEString )
                    {
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:998:1: ( ruleEString )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:999:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLicenseRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLicenseAccess().getEReference0CustomerCrossReference_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLicense2102);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLicense2116); 

                	newLeafNode(otherlv_9, grammarAccess.getLicenseAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLicense"


    // $ANTLR start "entryRuleEDate"
    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:1024:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:1025:2: (iv_ruleEDate= ruleEDate EOF )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:1026:2: iv_ruleEDate= ruleEDate EOF
            {
             newCompositeNode(grammarAccess.getEDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDate_in_entryRuleEDate2153);
            iv_ruleEDate=ruleEDate();

            state._fsp--;

             current =iv_ruleEDate.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDate2164); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:1033:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EDate' ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:1036:28: (kw= 'EDate' )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:1038:2: kw= 'EDate'
            {
            kw=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleEDate2201); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEDateAccess().getEDateKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDate"


    // $ANTLR start "ruleStreetType"
    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:1051:1: ruleStreetType returns [Enumerator current=null] : ( (enumLiteral_0= 'Street' ) | (enumLiteral_1= 'Road' ) ) ;
    public final Enumerator ruleStreetType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:1053:28: ( ( (enumLiteral_0= 'Street' ) | (enumLiteral_1= 'Road' ) ) )
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:1054:1: ( (enumLiteral_0= 'Street' ) | (enumLiteral_1= 'Road' ) )
            {
            // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:1054:1: ( (enumLiteral_0= 'Street' ) | (enumLiteral_1= 'Road' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41) ) {
                alt26=1;
            }
            else if ( (LA26_0==42) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:1054:2: (enumLiteral_0= 'Street' )
                    {
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:1054:2: (enumLiteral_0= 'Street' )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:1054:4: enumLiteral_0= 'Street'
                    {
                    enumLiteral_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleStreetType2254); 

                            current = grammarAccess.getStreetTypeAccess().getStreetEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getStreetTypeAccess().getStreetEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:1060:6: (enumLiteral_1= 'Road' )
                    {
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:1060:6: (enumLiteral_1= 'Road' )
                    // ../com.opcoach.training.rental.xtext/src-gen/com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.g:1060:8: enumLiteral_1= 'Road'
                    {
                    enumLiteral_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleStreetType2271); 

                            current = grammarAccess.getStreetTypeAccess().getRoadEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getStreetTypeAccess().getRoadEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStreetType"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRentalAgency_in_entryRuleRentalAgency75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRentalAgency85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleRentalAgency122 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRentalAgency143 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRentalAgency155 = new BitSet(new long[]{0x000000000007A000L});
        public static final BitSet FOLLOW_ruleAddress_in_ruleRentalAgency176 = new BitSet(new long[]{0x000000000003A000L});
        public static final BitSet FOLLOW_13_in_ruleRentalAgency190 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRentalAgency202 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_ruleRentalObject_in_ruleRentalAgency223 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleRentalAgency236 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_ruleRentalObject_in_ruleRentalAgency257 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleRentalAgency271 = new BitSet(new long[]{0x0000000000038000L});
        public static final BitSet FOLLOW_16_in_ruleRentalAgency286 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRentalAgency298 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleCustomer_in_ruleRentalAgency319 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleRentalAgency332 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleCustomer_in_ruleRentalAgency353 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleRentalAgency367 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_17_in_ruleRentalAgency382 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRentalAgency394 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleRental_in_ruleRentalAgency415 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleRentalAgency428 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleRental_in_ruleRentalAgency449 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleRentalAgency463 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRentalAgency477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString514 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddress_in_entryRuleAddress636 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddress646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleAddress692 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAddress704 = new BitSet(new long[]{0x0000000000F88000L});
        public static final BitSet FOLLOW_19_in_ruleAddress717 = new BitSet(new long[]{0x0000060000000000L});
        public static final BitSet FOLLOW_ruleStreetType_in_ruleAddress738 = new BitSet(new long[]{0x0000000000F08000L});
        public static final BitSet FOLLOW_20_in_ruleAddress753 = new BitSet(new long[]{0x0000001000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleAddress774 = new BitSet(new long[]{0x0000000000E08000L});
        public static final BitSet FOLLOW_21_in_ruleAddress789 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAddress810 = new BitSet(new long[]{0x0000000000C08000L});
        public static final BitSet FOLLOW_22_in_ruleAddress825 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAddress846 = new BitSet(new long[]{0x0000000000808000L});
        public static final BitSet FOLLOW_23_in_ruleAddress861 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAddress882 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAddress896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRentalObject_in_entryRuleRentalObject932 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRentalObject942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleRentalObject994 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleRentalObject1020 = new BitSet(new long[]{0x0000001000000040L});
        public static final BitSet FOLLOW_ruleELong_in_ruleRentalObject1041 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRentalObject1053 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleRentalObject1065 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRentalObject1086 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRentalObject1098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCustomer_in_entryRuleCustomer1134 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCustomer1144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleCustomer1181 = new BitSet(new long[]{0x0000001000000040L});
        public static final BitSet FOLLOW_ruleELong_in_ruleCustomer1202 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCustomer1214 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleCustomer1226 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCustomer1247 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleCustomer1259 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCustomer1280 = new BitSet(new long[]{0x0000000040048000L});
        public static final BitSet FOLLOW_ruleAddress_in_ruleCustomer1301 = new BitSet(new long[]{0x0000000040008000L});
        public static final BitSet FOLLOW_30_in_ruleCustomer1315 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCustomer1327 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_ruleLicense_in_ruleCustomer1348 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleCustomer1361 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_ruleLicense_in_ruleCustomer1382 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleCustomer1396 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleCustomer1410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRental_in_entryRuleRental1446 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRental1456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleRental1493 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRental1505 = new BitSet(new long[]{0x0000000700000000L});
        public static final BitSet FOLLOW_32_in_ruleRental1518 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleEDate_in_ruleRental1539 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_33_in_ruleRental1554 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleEDate_in_ruleRental1575 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleRental1589 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRental1612 = new BitSet(new long[]{0x0000000800008000L});
        public static final BitSet FOLLOW_35_in_ruleRental1625 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRental1648 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRental1662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1699 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleEInt1749 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleELong_in_entryRuleELong1812 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleELong1823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleELong1862 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleELong1879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLicense_in_entryRuleLicense1926 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLicense1936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleLicense1982 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLicense1994 = new BitSet(new long[]{0x000000C000108000L});
        public static final BitSet FOLLOW_20_in_ruleLicense2007 = new BitSet(new long[]{0x0000001000000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleLicense2028 = new BitSet(new long[]{0x000000C000008000L});
        public static final BitSet FOLLOW_38_in_ruleLicense2043 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_ruleEDate_in_ruleLicense2064 = new BitSet(new long[]{0x0000008000008000L});
        public static final BitSet FOLLOW_39_in_ruleLicense2079 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLicense2102 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleLicense2116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDate_in_entryRuleEDate2153 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDate2164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleEDate2201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleStreetType2254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleStreetType2271 = new BitSet(new long[]{0x0000000000000002L});
    }


}