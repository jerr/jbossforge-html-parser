/*
 * Copyright 2013 Jeremie Lagarde.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jboss.forge.parser.html.impl;

import org.jboss.forge.parser.html.HTMLDocument;
import org.jsoup.nodes.Document;

/**
 * @author Jeremie Lagarde
 * 
 */
public class HTMLDocumentImpl extends HTMLElementImpl<Document> implements HTMLDocument
{

   public HTMLDocumentImpl(Document target)
   {
      super(target);
   }

   @Override
   public String getTitle()
   {
      return target.title();
   }
}
