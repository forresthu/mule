package org.mule.extensions.introspection.api.builder;

import org.mule.extensions.introspection.api.MuleExtensionOperation;

public interface MuleExtensionOperationBuilder
{

    MuleExtensionOperationBuilder withName(String name);

    MuleExtensionOperationBuilder withDescription(String description);

    MuleExtensionOperationBuilder withInputType(Class<?> inputType);

    MuleExtensionOperationBuilder withOutputType(Class<?> outputType);

    MuleExtensionParameterBuilder addParameter();

    MuleExtensionOperation build();
}
