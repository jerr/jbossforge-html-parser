/*
 * Copyright 2013 Jeremie Lagarde.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jboss.forge.parser.html.impl;

import org.jboss.forge.parser.html.HTMLComment;
import org.jboss.forge.parser.html.HTMLElement;
import org.jsoup.nodes.Comment;

/**
 * @author Jeremie Lagarde
 * 
 */
public class HTMLCommentImpl extends HTMLNodeImpl<Comment> implements HTMLComment
{

   HTMLCommentImpl(Comment target, HTMLElement parent)
   {
      super(target, parent);
   }

}
