package com.example;

/**
 * This is a class.
 *
 * @author manzano
 * @version $Id: $
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }
  /**
   * <p>greet.</p>
   *
   * @param someone a {@link java.lang.String} object.
   * @return a {@link java.lang.String} object.
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
