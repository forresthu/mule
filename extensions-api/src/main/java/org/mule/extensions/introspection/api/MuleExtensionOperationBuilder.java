package org.mule.extensions.introspection.api;

public interface MuleExtensionOperationBuilder extends Builder<MuleExtensionOperation>
{

    MuleExtensionOperationBuilder setName(String name);

    MuleExtensionOperationBuilder setDescription(String description);

    MuleExtensionOperationBuilder setInputTypes(Class<?>... inputTypes);

    MuleExtensionOperationBuilder setOutputTypes(Class<?>... outputTypes);

    MuleExtensionOperationBuilder addParameter(MuleExtensionParameterBuilder parameter);

    MuleExtensionOperationBuilder addOwnerConfiguration(String name);

}
