package fr.reapy.exception;

import java.util.logging.Level;
import java.util.logging.Logger;

public class EmptyListException extends Exception {

	// Fields

	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = Logger.getLogger(EmptyListException.class.getName());

	// Constructor

	public EmptyListException() {
		LOGGER.log(Level.INFO, "Une erreur " + EmptyListException.class.getName() + " est levée.");
	}
}