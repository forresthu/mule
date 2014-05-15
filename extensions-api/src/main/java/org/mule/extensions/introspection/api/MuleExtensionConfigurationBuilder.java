package org.mule.extensions.introspection.api;

public interface MuleExtensionConfigurationBuilder extends Builder<MuleExtensionConfiguration>
{

    MuleExtensionConfigurationBuilder setName(String name);

    MuleExtensionConfigurationBuilder setDescription(String description);

    MuleExtensionConfigurationBuilder addParameter(MuleExtensionParameterBuilder parameter);

}
