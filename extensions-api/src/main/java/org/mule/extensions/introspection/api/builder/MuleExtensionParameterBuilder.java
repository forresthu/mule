package org.mule.extensions.introspection.api.builder;

import org.mule.extensions.introspection.api.MuleExtensionParameter;

public interface MuleExtensionParameterBuilder
{

    MuleExtensionParameterBuilder withName(String name);

    MuleExtensionParameterBuilder withDescription(String description);

    MuleExtensionParameterBuilder setType(Class<?> type);

    MuleExtensionParameterBuilder setRequired(boolean required);

    MuleExtensionParameterBuilder setAcceptsExpressions(boolean acceptsExpressions);

    MuleExtensionParameter build();
}
