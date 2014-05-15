package org.mule.extensions.introspection.api;

import org.mule.extensions.api.exception.NoSuchConfigurationException;
import org.mule.extensions.api.exception.NoSuchOperationException;

import java.util.List;

public interface MuleExtension extends Described
{

    String getVersion();

    List<MuleExtensionConfiguration> getConfigurations();

    MuleExtensionConfiguration getConfiguration(String name) throws NoSuchConfigurationException;

    List<MuleExtensionOperation> getOperations();

    MuleExtensionOperation getOperation(String name) throws NoSuchOperationException;

}
