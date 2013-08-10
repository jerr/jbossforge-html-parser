/*
 * Copyright 2013 Jeremie Lagarde.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jboss.forge.parser.html;

import java.util.List;
import java.util.Map;

/**
 * @author Jeremie Lagarde
 * 
 */
public interface HTMLElement extends HTMLNode
{
   List<HTMLNode> getChildren();

   Map<String, String> getAttributes();
}
