package com.opcoach.training.rental.xtext.tests;

import com.google.inject.Inject;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class TestGrammar {
  @Inject
  private /* ParserHelper<RentalAgency> */Object _parserHelper;
  
  @Inject
  private ValidationTestHelper _validationTestHelper;
  
  /* @Test
   */public void testIsFat() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method parse is undefined for the type TestGrammar"
      + "\nThe method or field ERROR_ID is undefined for the type TestGrammar"
      + "\nassertError cannot be resolved");
  }
}
