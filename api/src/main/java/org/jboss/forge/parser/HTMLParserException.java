/*
 * Copyright 2013 Jeremie Lagarde.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jboss.forge.parser;

/**
 * @author Jeremie Lagarde
 * 
 */
@SuppressWarnings("serial")
public class HTMLParserException extends RuntimeException
{

   public HTMLParserException()
   {
      super();
   }

   public HTMLParserException(final String message, final Throwable e)
   {
      super(message, e);
   }

   public HTMLParserException(final String message)
   {
      super(message);
   }

   public HTMLParserException(final Throwable e)
   {
      super(e);
   }

}
