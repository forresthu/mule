/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.extensions.internal.builder;

import org.mule.extensions.internal.ImmutableMuleExtension;
import org.mule.extensions.introspection.api.MuleExtension;
import org.mule.extensions.introspection.api.MuleExtensionConfiguration;
import org.mule.extensions.introspection.api.MuleExtensionOperation;
import org.mule.extensions.introspection.api.builder.MuleExtensionBuilder;
import org.mule.extensions.introspection.api.builder.MuleExtensionConfigurationBuilder;
import org.mule.extensions.introspection.api.builder.MuleExtensionOperationBuilder;
import org.mule.util.Preconditions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DefaultMuleExtensionBuilder implements MuleExtensionBuilder
{

    private String name;
    private String description;
    private List<MuleExtensionConfigurationBuilder> configurationBuilders = new LinkedList<MuleExtensionConfigurationBuilder>();
    private List<MuleExtensionOperationBuilder> operationBuilders = new LinkedList<MuleExtensionOperationBuilder>();

    public static DefaultMuleExtensionBuilder newBuilder()
    {
        return new DefaultMuleExtensionBuilder();
    }

    private DefaultMuleExtensionBuilder()
    {
    }

    @Override
    public MuleExtensionBuilder withName(String name)
    {
        this.name = name;
        return this;
    }

    @Override
    public MuleExtensionBuilder withDescription(String description)
    {
        this.description = description;
        return this;
    }

    @Override
    public MuleExtensionConfigurationBuilder addConfiguration()
    {
        MuleExtensionConfigurationBuilder configurationBuilder = new DefaultMuleExtensionConfigurationBuilder();
        configurationBuilders.add(configurationBuilder);

        return configurationBuilder;
    }

    @Override
    public MuleExtensionOperationBuilder addOperation()
    {
        MuleExtensionOperationBuilder operationBuilder = new DefaultMuleExtensionOperationBuilder();
        operationBuilders.add(operationBuilder);

        return operationBuilder;
    }

    @Override
    public MuleExtension build()
    {
        return new ImmutableMuleExtension(name, des)
    }

    private List<MuleExtensionConfiguration> buildConfigurations()
    {
        Preconditions.checkState(!configurationBuilders.isEmpty(), "Must provide at least one configuration");
        List<MuleExtensionConfiguration> configurations = new ArrayList<MuleExtensionConfiguration>(configurationBuilders.size());

        for (MuleExtensionConfigurationBuilder builder : configurationBuilders)
        {
            configurations.add(builder.build());
        }

        return configurations;
    }

    private List<MuleExtensionOperation> buildOperations()
    {
        Preconditions.checkState(!operationBuilders.isEmpty(), "Must provide at least one operation");

        List<MuleExtensionOperation> operations = new ArrayList<MuleExtensionOperation>(operationBuilders.size());

        for (MuleExtensionOperationBuilder builder : operationBuilders)
        {
            operations.add(builder.build());
        }

        return operations;
    }
}
