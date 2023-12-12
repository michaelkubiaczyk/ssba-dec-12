package org.company.application.simplespringbootapp;
import org.owasp.encoder.Encode; 

public class InfoPage {
	// TODO: add more stuff here.
	public static String showInfo( String email ) {

		if ( email == null ) {
			return "No email configured.";
		} else {
			return "Current email is: " + Encode.forHtml(email);
		}		
	}
	
	private static class sanitizers {
		public static String sanitize( String input ) {
			// FIXME: not sanitizing, just checking presence of '@' symbol
			if ( input.indexOf('@') < 0 ) {
				return "";
			}
			return input;
		}
	}
}
