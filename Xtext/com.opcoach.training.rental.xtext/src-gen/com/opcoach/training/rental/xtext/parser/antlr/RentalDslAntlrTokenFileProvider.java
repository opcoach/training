/*
* generated by Xtext
*/
package com.opcoach.training.rental.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class RentalDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("com/opcoach/training/rental/xtext/parser/antlr/internal/InternalRentalDsl.tokens");
	}
}
