/*
* generated by Xtext
*/
grammar InternalRentalDsl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package com.opcoach.training.rental.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleRentalAgency
entryRuleRentalAgency returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRentalAgencyRule()); }
	 iv_ruleRentalAgency=ruleRentalAgency 
	 { $current=$iv_ruleRentalAgency.current; } 
	 EOF 
;

// Rule RentalAgency
ruleRentalAgency returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='RentalAgency' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getRentalAgencyAccess().getRentalAgencyKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRentalAgencyAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRentalAgencyRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getRentalAgencyAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRentalAgencyAccess().getAddressAddressParserRuleCall_3_0()); 
	    }
		lv_address_3_0=ruleAddress		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRentalAgencyRule());
	        }
       		set(
       			$current, 
       			"address",
        		lv_address_3_0, 
        		"Address");
	        afterParserOrEnumRuleCall();
	    }

)
)?(	otherlv_4='objectsToRent' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getRentalAgencyAccess().getObjectsToRentKeyword_4_0());
    }
	otherlv_5='{' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getRentalAgencyAccess().getLeftCurlyBracketKeyword_4_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRentalAgencyAccess().getObjectsToRentRentalObjectParserRuleCall_4_2_0()); 
	    }
		lv_objectsToRent_6_0=ruleRentalObject		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRentalAgencyRule());
	        }
       		add(
       			$current, 
       			"objectsToRent",
        		lv_objectsToRent_6_0, 
        		"RentalObject");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_7=',' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getRentalAgencyAccess().getCommaKeyword_4_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRentalAgencyAccess().getObjectsToRentRentalObjectParserRuleCall_4_3_1_0()); 
	    }
		lv_objectsToRent_8_0=ruleRentalObject		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRentalAgencyRule());
	        }
       		add(
       			$current, 
       			"objectsToRent",
        		lv_objectsToRent_8_0, 
        		"RentalObject");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getRentalAgencyAccess().getRightCurlyBracketKeyword_4_4());
    }
)?(	otherlv_10='customers' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getRentalAgencyAccess().getCustomersKeyword_5_0());
    }
	otherlv_11='{' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getRentalAgencyAccess().getLeftCurlyBracketKeyword_5_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRentalAgencyAccess().getCustomersCustomerParserRuleCall_5_2_0()); 
	    }
		lv_customers_12_0=ruleCustomer		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRentalAgencyRule());
	        }
       		add(
       			$current, 
       			"customers",
        		lv_customers_12_0, 
        		"Customer");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_13=',' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getRentalAgencyAccess().getCommaKeyword_5_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRentalAgencyAccess().getCustomersCustomerParserRuleCall_5_3_1_0()); 
	    }
		lv_customers_14_0=ruleCustomer		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRentalAgencyRule());
	        }
       		add(
       			$current, 
       			"customers",
        		lv_customers_14_0, 
        		"Customer");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_15='}' 
    {
    	newLeafNode(otherlv_15, grammarAccess.getRentalAgencyAccess().getRightCurlyBracketKeyword_5_4());
    }
)?(	otherlv_16='rentals' 
    {
    	newLeafNode(otherlv_16, grammarAccess.getRentalAgencyAccess().getRentalsKeyword_6_0());
    }
	otherlv_17='{' 
    {
    	newLeafNode(otherlv_17, grammarAccess.getRentalAgencyAccess().getLeftCurlyBracketKeyword_6_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRentalAgencyAccess().getRentalsRentalParserRuleCall_6_2_0()); 
	    }
		lv_rentals_18_0=ruleRental		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRentalAgencyRule());
	        }
       		add(
       			$current, 
       			"rentals",
        		lv_rentals_18_0, 
        		"Rental");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_19=',' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getRentalAgencyAccess().getCommaKeyword_6_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRentalAgencyAccess().getRentalsRentalParserRuleCall_6_3_1_0()); 
	    }
		lv_rentals_20_0=ruleRental		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRentalAgencyRule());
	        }
       		add(
       			$current, 
       			"rentals",
        		lv_rentals_20_0, 
        		"Rental");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_21='}' 
    {
    	newLeafNode(otherlv_21, grammarAccess.getRentalAgencyAccess().getRightCurlyBracketKeyword_6_4());
    }
)?	otherlv_22='}' 
    {
    	newLeafNode(otherlv_22, grammarAccess.getRentalAgencyAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleEString
entryRuleEString returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringRule()); } 
	 iv_ruleEString=ruleEString 
	 { $current=$iv_ruleEString.current.getText(); }  
	 EOF 
;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
    }

    |    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuleAddress
entryRuleAddress returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAddressRule()); }
	 iv_ruleAddress=ruleAddress 
	 { $current=$iv_ruleAddress.current; } 
	 EOF 
;

// Rule Address
ruleAddress returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getAddressAccess().getAddressAction_0(),
            $current);
    }
)	otherlv_1='Address' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAddressAccess().getAddressKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAddressAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='streetType' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getAddressAccess().getStreetTypeKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAddressAccess().getStreetTypeStreetTypeEnumRuleCall_3_1_0()); 
	    }
		lv_streetType_4_0=ruleStreetType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAddressRule());
	        }
       		set(
       			$current, 
       			"streetType",
        		lv_streetType_4_0, 
        		"StreetType");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_5='number' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getAddressAccess().getNumberKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAddressAccess().getNumberEIntParserRuleCall_4_1_0()); 
	    }
		lv_number_6_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAddressRule());
	        }
       		set(
       			$current, 
       			"number",
        		lv_number_6_0, 
        		"EInt");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_7='zipCode' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getAddressAccess().getZipCodeKeyword_5_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAddressAccess().getZipCodeEStringParserRuleCall_5_1_0()); 
	    }
		lv_zipCode_8_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAddressRule());
	        }
       		set(
       			$current, 
       			"zipCode",
        		lv_zipCode_8_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_9='city' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getAddressAccess().getCityKeyword_6_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAddressAccess().getCityEStringParserRuleCall_6_1_0()); 
	    }
		lv_city_10_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAddressRule());
	        }
       		set(
       			$current, 
       			"city",
        		lv_city_10_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_11='streetName' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getAddressAccess().getStreetNameKeyword_7_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAddressAccess().getStreetNameEStringParserRuleCall_7_1_0()); 
	    }
		lv_streetName_12_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAddressRule());
	        }
       		set(
       			$current, 
       			"streetName",
        		lv_streetName_12_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_13='}' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getAddressAccess().getRightCurlyBracketKeyword_8());
    }
)
;





// Entry rule entryRuleRentalObject
entryRuleRentalObject returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRentalObjectRule()); }
	 iv_ruleRentalObject=ruleRentalObject 
	 { $current=$iv_ruleRentalObject.current; } 
	 EOF 
;

// Rule RentalObject
ruleRentalObject returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getRentalObjectAccess().getRentalObjectAction_0(),
            $current);
    }
)(
(
		lv_dispo_1_0=	'dispo' 
    {
        newLeafNode(lv_dispo_1_0, grammarAccess.getRentalObjectAccess().getDispoDispoKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRentalObjectRule());
	        }
       		setWithLastConsumed($current, "dispo", true, "dispo");
	    }

)
)?	otherlv_2='RentalObject' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getRentalObjectAccess().getRentalObjectKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRentalObjectAccess().getIDELongParserRuleCall_3_0()); 
	    }
		lv_ID_3_0=ruleELong		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRentalObjectRule());
	        }
       		set(
       			$current, 
       			"ID",
        		lv_ID_3_0, 
        		"ELong");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getRentalObjectAccess().getLeftCurlyBracketKeyword_4());
    }
	otherlv_5='name' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getRentalObjectAccess().getNameKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRentalObjectAccess().getNameEStringParserRuleCall_6_0()); 
	    }
		lv_name_6_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRentalObjectRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_6_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getRentalObjectAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleCustomer
entryRuleCustomer returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCustomerRule()); }
	 iv_ruleCustomer=ruleCustomer 
	 { $current=$iv_ruleCustomer.current; } 
	 EOF 
;

// Rule Customer
ruleCustomer returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Customer' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getCustomerAccess().getCustomerKeyword_0());
    }
	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getCustomerAccess().getLeftCurlyBracketKeyword_1());
    }
	otherlv_2='firstName' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getCustomerAccess().getFirstNameKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCustomerAccess().getFirstNameEStringParserRuleCall_3_0()); 
	    }
		lv_firstName_3_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCustomerRule());
	        }
       		set(
       			$current, 
       			"firstName",
        		lv_firstName_3_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4='lastName' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getCustomerAccess().getLastNameKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCustomerAccess().getLastNameEStringParserRuleCall_5_0()); 
	    }
		lv_lastName_5_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCustomerRule());
	        }
       		set(
       			$current, 
       			"lastName",
        		lv_lastName_5_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getCustomerAccess().getAddressAddressParserRuleCall_6_0()); 
	    }
		lv_address_6_0=ruleAddress		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCustomerRule());
	        }
       		set(
       			$current, 
       			"address",
        		lv_address_6_0, 
        		"Address");
	        afterParserOrEnumRuleCall();
	    }

)
)?(	otherlv_7='licenses' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getCustomerAccess().getLicensesKeyword_7_0());
    }
	otherlv_8='{' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getCustomerAccess().getLeftCurlyBracketKeyword_7_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCustomerAccess().getLicensesLicenseParserRuleCall_7_2_0()); 
	    }
		lv_licenses_9_0=ruleLicense		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCustomerRule());
	        }
       		add(
       			$current, 
       			"licenses",
        		lv_licenses_9_0, 
        		"License");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_10=',' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getCustomerAccess().getCommaKeyword_7_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getCustomerAccess().getLicensesLicenseParserRuleCall_7_3_1_0()); 
	    }
		lv_licenses_11_0=ruleLicense		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getCustomerRule());
	        }
       		add(
       			$current, 
       			"licenses",
        		lv_licenses_11_0, 
        		"License");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_12='}' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getCustomerAccess().getRightCurlyBracketKeyword_7_4());
    }
)?	otherlv_13='}' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getCustomerAccess().getRightCurlyBracketKeyword_8());
    }
)
;





// Entry rule entryRuleRental
entryRuleRental returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRentalRule()); }
	 iv_ruleRental=ruleRental 
	 { $current=$iv_ruleRental.current; } 
	 EOF 
;

// Rule Rental
ruleRental returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Rental' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getRentalAccess().getRentalKeyword_0());
    }
	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getRentalAccess().getLeftCurlyBracketKeyword_1());
    }
(	otherlv_2='startDate' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getRentalAccess().getStartDateKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRentalAccess().getStartDateEDateParserRuleCall_2_1_0()); 
	    }
		lv_startDate_3_0=ruleEDate		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRentalRule());
	        }
       		set(
       			$current, 
       			"startDate",
        		lv_startDate_3_0, 
        		"EDate");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_4='endDate' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getRentalAccess().getEndDateKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRentalAccess().getEndDateEDateParserRuleCall_3_1_0()); 
	    }
		lv_endDate_5_0=ruleEDate		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRentalRule());
	        }
       		set(
       			$current, 
       			"endDate",
        		lv_endDate_5_0, 
        		"EDate");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_6='customer' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getRentalAccess().getCustomerKeyword_4());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getRentalRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getRentalAccess().getCustomerCustomerCrossReference_5_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_8='rentedObject' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getRentalAccess().getRentedObjectKeyword_6_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getRentalRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getRentalAccess().getRentedObjectRentalObjectCrossReference_6_1_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_10='}' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getRentalAccess().getRightCurlyBracketKeyword_7());
    }
)
;





// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEIntRule()); } 
	 iv_ruleEInt=ruleEInt 
	 { $current=$iv_ruleEInt.current.getText(); }  
	 EOF 
;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
    }
)?    this_INT_1=RULE_INT    {
		$current.merge(this_INT_1);
    }

    { 
    newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuleELong
entryRuleELong returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getELongRule()); } 
	 iv_ruleELong=ruleELong 
	 { $current=$iv_ruleELong.current.getText(); }  
	 EOF 
;

// Rule ELong
ruleELong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getELongAccess().getHyphenMinusKeyword_0()); 
    }
)?    this_INT_1=RULE_INT    {
		$current.merge(this_INT_1);
    }

    { 
    newLeafNode(this_INT_1, grammarAccess.getELongAccess().getINTTerminalRuleCall_1()); 
    }
)
    ;







// Entry rule entryRuleLicense
entryRuleLicense returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLicenseRule()); }
	 iv_ruleLicense=ruleLicense 
	 { $current=$iv_ruleLicense.current; } 
	 EOF 
;

// Rule License
ruleLicense returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getLicenseAccess().getLicenseAction_0(),
            $current);
    }
)	otherlv_1='License' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getLicenseAccess().getLicenseKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getLicenseAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='number' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getLicenseAccess().getNumberKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getLicenseAccess().getNumberEIntParserRuleCall_3_1_0()); 
	    }
		lv_number_4_0=ruleEInt		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLicenseRule());
	        }
       		set(
       			$current, 
       			"number",
        		lv_number_4_0, 
        		"EInt");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_5='validityDate' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getLicenseAccess().getValidityDateKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getLicenseAccess().getValidityDateEDateParserRuleCall_4_1_0()); 
	    }
		lv_validityDate_6_0=ruleEDate		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLicenseRule());
	        }
       		set(
       			$current, 
       			"validityDate",
        		lv_validityDate_6_0, 
        		"EDate");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_7='EReference0' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getLicenseAccess().getEReference0Keyword_5_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getLicenseRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getLicenseAccess().getEReference0CustomerCrossReference_5_1_0()); 
	    }
		ruleEString		{ 
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getLicenseAccess().getRightCurlyBracketKeyword_6());
    }
)
;





// Entry rule entryRuleEDate
entryRuleEDate returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEDateRule()); } 
	 iv_ruleEDate=ruleEDate 
	 { $current=$iv_ruleEDate.current.getText(); }  
	 EOF 
;

// Rule EDate
ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

	kw='EDate' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEDateAccess().getEDateKeyword()); 
    }

    ;





// Rule StreetType
ruleStreetType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='Street' 
	{
        $current = grammarAccess.getStreetTypeAccess().getStreetEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getStreetTypeAccess().getStreetEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='Road' 
	{
        $current = grammarAccess.getStreetTypeAccess().getRoadEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getStreetTypeAccess().getRoadEnumLiteralDeclaration_1()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


