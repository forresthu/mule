package org.mule.extensions.introspection.api;

import java.util.List;

public interface MuleExtensionOperation extends Described
{

    List<MuleExtensionParameter> getParameters();

    List<Class<?>> getInputTypes();

    List<Class<?>> getOutputType();

    /**
     * Returns a new {@link OperationContext}
     * with default parameters set.
     * @return
     */
    OperationContext prepare();

    boolean isAvailableFor(MuleExtensionConfiguration muleExtensionConfiguration);
}
