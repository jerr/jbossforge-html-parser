/*
 * Copyright 2013 Jeremie Lagarde.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jboss.forge.parser.html.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jboss.forge.parser.html.HTMLElement;
import org.jboss.forge.parser.html.HTMLNode;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

/**
 * @author Jeremie Lagarde
 * 
 */
public class HTMLElementImpl<T extends Element> extends HTMLNodeImpl<T> implements HTMLElement
{
   private List<HTMLNode> children;
   private Map<String, String> attributes;

   HTMLElementImpl(T target, HTMLElement parent)
   {
      super(target, parent);
   }

   @Override
   public String getName()
   {
      return target.nodeName();
   }

   @Override
   public List<HTMLNode> getChildren()
   {
      if (children != null)
         return children;

      children = new ArrayList<HTMLNode>();

      for (Node node : target.childNodes())
      {
         HTMLNode htmlNode = null;
         if (node instanceof Comment)
         {
            htmlNode = new HTMLCommentImpl((Comment) node, this);
         }
         else if (node instanceof Element)
         {
            htmlNode = new HTMLElementImpl<Element>((Element) node, this);
         }
         children.add(htmlNode);
      }

      return children;
   }

   @Override
   public Map<String, String> getAttributes()
   {
      if (attributes != null)
         return attributes;

      attributes = new HashMap<String, String>();
      for (Attribute attribute : target.attributes())
      {
         attributes.put(attribute.getKey(), attribute.getValue());
      }
      return attributes;
   }

}
