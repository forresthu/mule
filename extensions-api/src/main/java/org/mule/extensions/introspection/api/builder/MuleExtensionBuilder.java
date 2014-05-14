/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.extensions.introspection.api.builder;

import org.mule.extensions.introspection.api.MuleExtension;

public interface MuleExtensionBuilder
{

    MuleExtensionBuilder withName(String name);

    MuleExtensionBuilder withDescription(String description);

    MuleExtensionConfigurationBuilder addConfiguration();

    MuleExtensionOperationBuilder addOperation();

    MuleExtension build();

}
