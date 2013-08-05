/*
 * Copyright 2013 Jeremie Lagarde.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jboss.forge.parser.spi;

import static org.junit.Assert.*;

import org.jboss.forge.parser.HTMLParser;
import org.jboss.forge.parser.html.HTMLDocument;
import org.junit.Test;

/**
 * @author Jeremie Lagarde
 * 
 */
public class HTMLParserProviderTest
{
   private static final String SOURCE =  "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">"
            + "<HTML>"
            + "   <HEAD>"
            + "      <TITLE>My HTML document</TITLE>"
            + "   </HEAD>"
            + "   <BODY>"
            + "      <P>Hello world!"
            + "   </BODY>"
            + "</HTML>";

   @Test
   public void testParse()
   {
      HTMLDocument document = HTMLParser.parse(SOURCE);
      assertNotNull(document);
      assertEquals("My HTML document", document.getTitle());
   }

}
