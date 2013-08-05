/*
 * Copyright 2013 Jeremie Lagarde.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jboss.forge.parser.spi;

import org.jboss.forge.parser.html.HTMLDocument;

/**
 * @author Jeremie Lagarde
 * 
 */
public interface HTMLParserProvider
{
   HTMLDocument parse(final String source);
}
