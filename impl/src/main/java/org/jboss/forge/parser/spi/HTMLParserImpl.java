/*
 * Copyright 2013 Jeremie Lagarde.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jboss.forge.parser.spi;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;

import javax.rmi.CORBA.Util;

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
   public HTMLDocument parse(final File file)
   {
      try
      {
         if (file == null)
         {
            return null;
         }
         Document doc = Jsoup.parse(file,null);
         return createHTMLDocument(doc);
      }
      catch (Exception e)
      {
         throw new HTMLParserException("Could not import HTML from file : " + file.getPath(), e);
      }
   }

   @Override
   public HTMLDocument parse(String source)
   {
      try
      {
         if (source == null)
         {
            return null;
         }
         Document doc = Jsoup.parse(source);
         return createHTMLDocument(doc);
      }
      catch (Exception e)
      {
         throw new HTMLParserException("Could not import HTML from string", e);
      }
   }

   private HTMLDocument createHTMLDocument(Document doc)
   {
      return new HTMLDocumentImpl(doc);
   }
}
