package org.mule.extensions.introspection.api;

public interface MuleExtensionParameterBuilder extends Builder<MuleExtensionParameter>
{

    MuleExtensionParameterBuilder setName(String name);

    MuleExtensionParameterBuilder setDescription(String description);

    MuleExtensionParameterBuilder setType(Class<?> type);

    MuleExtensionParameterBuilder setRequired(boolean required);

    MuleExtensionParameterBuilder setAcceptsExpressions(boolean acceptsExpressions);

    MuleExtensionParameterBuilder setDefaultValue(Object defaultValue);

}
