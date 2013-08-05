/*
 * Copyright 2013 Jeremie Lagarde.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jboss.forge.parser.spi;

import org.jboss.forge.parser.HTMLParserException;
import org.jboss.forge.parser.html.HTMLDocument;
import org.jboss.forge.parser.html.impl.HTMLDocumentImpl;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * @author Jeremie Lagarde
 * 
 */
public class HTMLParserImpl implements HTMLParserProvider
{

   @Override
   public HTMLDocument parse(String source)
   {
      try
      {
         if (source  == null)
         {
            return null;
         }
         Document doc = Jsoup.parse(source);

         HTMLDocument root = new HTMLDocumentImpl(doc);
         return root;

      }
      catch (Exception e)
      {
         throw new HTMLParserException("Could not import HTML from stream", e);
      }
   }

}
