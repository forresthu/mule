/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.extensions.introspection.api;

import java.util.Set;

public interface MuleExtensionConfiguration extends Described
{

    Set<MuleExtensionParameter> getParameters();

    /**
     * Returns an instance with the default values
     * @return
     */
    MuleExtensionConfiguration getDefault();

}
