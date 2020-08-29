package com.altimetrik.brs.exception;

/**
 * .
 * 
 * @author: Manoj Kumar.
 * @version: 1.0.
*/
public class InvalidCredentialException extends RuntimeException {

  /** Generated serial version UUID. **/
  private static final long serialVersionUID = -2272276648721684739L;
  
  public InvalidCredentialException(final Exception e) {
    super(e);
  } // End of constructor.

  public InvalidCredentialException(final String message) {
    super(message);
  } // End of constructor overloading.
} // End of GenericException.