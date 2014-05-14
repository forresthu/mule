/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.extensions.internal;

import org.mule.extensions.api.exception.NoSuchConfigurationException;
import org.mule.extensions.api.exception.NoSuchOperationException;
import org.mule.extensions.introspection.api.MuleExtensionConfiguration;
import org.mule.extensions.introspection.api.MuleExtension;
import org.mule.extensions.introspection.api.MuleExtensionOperation;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import java.util.List;
import java.util.Map;

public final class ImmutableMuleExtension extends AbstractImmutableDescribed implements MuleExtension
{

    private final Map<String, MuleExtensionConfiguration> configurations;
    private final Map<String, MuleExtensionOperation> operations;

    public ImmutableMuleExtension(String name, String description, List<MuleExtensionConfiguration> configurations, List<MuleExtensionOperation> operations)
    {
        super(name, description);
        this.configurations = ImmutableMap.copyOf(configurations);
        this.operations = ImmutableMap.copyOf(operations);
    }

    @Override
    public List<MuleExtensionConfiguration> getConfigurations()
    {
        return ImmutableList.copyOf(configurations.values());
    }

    @Override
    public MuleExtensionConfiguration getConfiguration(String name) throws NoSuchConfigurationException
    {
        MuleExtensionConfiguration muleExtensionConfiguration = configurations.get(name);
        if (muleExtensionConfiguration == null)
        {
            throw new NoSuchConfigurationException(this, name);
        }

        return muleExtensionConfiguration;
    }

    @Override
    public List<MuleExtensionOperation> getOperations()
    {
        return ImmutableList.copyOf(operations.values());
    }

    @Override
    public MuleExtensionOperation getOperation(String name) throws NoSuchOperationException
    {
        MuleExtensionOperation muleExtensionOperation = operations.get(name);
        if (muleExtensionOperation == null)
        {
            throw new NoSuchOperationException(this, name);
        }

        return muleExtensionOperation;
    }
}
