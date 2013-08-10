/*
 * Copyright 2013 Jeremie Lagarde.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jboss.forge.parser.html.impl;

import org.jboss.forge.parser.html.HTMLElement;
import org.jboss.forge.parser.html.HTMLNode;
import org.jsoup.nodes.Node;

/**
 * @author Jeremie Lagarde
 * 
 */
public class HTMLNodeImpl<T extends Node> implements HTMLNode
{
   private final HTMLElement parent;

   protected T target;

   HTMLNodeImpl(T target, HTMLElement parent)
   {
      this.target = target;
      this.parent = parent;
   }

   @Override
   public String getName()
   {
      return target.nodeName();
   }

}
