/*
 * Copyright 2013 Jeremie Lagarde.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jboss.forge.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

import org.jboss.forge.parser.html.HTMLDocument;
import org.jboss.forge.parser.spi.HTMLParserProvider;

/**
 * @author Jeremie Lagarde
 * 
 */
public class HTMLParser
{
   public static ServiceLoader<HTMLParserProvider> loader = ServiceLoader.load(HTMLParserProvider.class);
   private static List<HTMLParserProvider> parsers;

   private static HTMLParserProvider getParser()
   {
      if (parsers == null)
      {
         parsers = new ArrayList<HTMLParserProvider>();
         for (HTMLParserProvider p : loader)
         {
            parsers.add(p);
         }
      }
      if (parsers.size() == 0)
      {
         throw new IllegalStateException("No instances of [" + HTMLParserProvider.class.getName()
                  + "] were found on the classpath.");
      }
      return parsers.get(0);
   }

   public static HTMLDocument parse(String source)
   {
      return getParser().parse(source);
   }
}
