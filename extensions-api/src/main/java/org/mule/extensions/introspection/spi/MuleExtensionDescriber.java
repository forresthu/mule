package org.mule.extensions.introspection.spi;

import org.mule.extensions.introspection.api.MuleExtensionBuilder;

public interface MuleExtensionDescriber
{

    void describe(MuleExtensionBuilder builder);
}
