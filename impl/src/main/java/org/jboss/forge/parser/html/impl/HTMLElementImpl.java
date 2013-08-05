package org.jboss.forge.parser.html.impl;

import org.jsoup.nodes.Node;

public class HTMLElementImpl<T extends Node>
{
   protected T target;

   public HTMLElementImpl(T target)
   {
      this.target = target;
   }
}
