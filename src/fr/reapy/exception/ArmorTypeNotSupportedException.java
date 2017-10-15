package fr.reapy.exception;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ArmorTypeNotSupportedException extends Exception {
	
	// Fields

	private static final long serialVersionUID = 1L;

	private static Logger logger = Logger.getLogger(ArmorTypeNotSupportedException.class.getName());
	
	// Constructors
	
	public ArmorTypeNotSupportedException() {
		logger.log(Level.INFO, "Une erreur " + ArmorTypeNotSupportedException.class.getName() + " est levée.");
	}
}