package exception;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EmptySetException extends Exception {

	private static final long serialVersionUID = 1L;
	
	// Fields
	
	private static Logger logger = Logger.getLogger(EmptySetException.class.getName());
	
	// Constructor
	
	public EmptySetException() {
		EmptySetException.logger.log(Level.INFO, "Une erreur EmptySetException est levée.");
	}

}