package fr.reapy.exception;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ElementNotSupportedException extends Exception {

	// Fields

	private static final long serialVersionUID = 1L;

	private static Logger logger = Logger.getLogger(ElementNotSupportedException.class.getName());

	// Constructor

	public ElementNotSupportedException() {
		logger.log(Level.INFO, "Une erreur " + ElementNotSupportedException.class.getName() + " est levée.");
	}
}