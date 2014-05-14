package org.mule.extensions.introspection.api.builder;

import org.mule.extensions.introspection.api.MuleExtensionConfiguration;

public interface MuleExtensionConfigurationBuilder
{

    MuleExtensionConfigurationBuilder withName(String name);

    MuleExtensionConfigurationBuilder withDescription(String description);

    MuleExtensionParameterBuilder addParameter();

    MuleExtensionConfiguration build();
}
