package exception;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EmptyListException extends Exception {

	private static final long serialVersionUID = 1L;
	
	// Fields
	
	private static Logger logger = Logger.getLogger(EmptyListException.class.getName());
	
	// Constructor
	
	public EmptyListException() {
		EmptyListException.logger.log(Level.INFO, "Une erreur EmptySetException est levée.");
	}
}