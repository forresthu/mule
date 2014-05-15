/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.extensions.internal;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import org.mule.extensions.introspection.api.MuleExtension;
import org.mule.extensions.introspection.api.MuleExtensionBuilder;
import org.mule.extensions.introspection.api.MuleExtensionConfiguration;

import org.junit.Test;

public class WSConsumerDeclarationTestCase
{

    private static final String WS_CONSUMER = "WSConsumer";
    private static final String GENERIC_CONSUMER_FOR_SOAP_WEB_SERVICES = "Generic Consumer for SOAP Web Services";
    private static final String VERSION = "3.5";
    private static final String WSDL_LOCATION = "wsdlLocation";
    private static final String URI_TO_FIND_THE_WSDL = "URI to find the WSDL";
    private static final String SERVICE = "service";
    private static final String SERVICE_NAME = "Service Name";
    private static final String PORT = "port";
    private static final String SERVICE_PORT = "Service Port";
    private static final String ADDRESS = "address";
    private static final String SERVICE_ADDRESS = "Service address";
    private static final String CONSUMER = "consumer";
    private static final String GO_GET_THEM_TIGER = "Go get them tiger";
    private static final String OPERATION = "operation";
    private static final String THE_OPERATION_TO_USE = "The operation to use";
    private static final String MTOM_ENABLED = "mtomEnabled";
    private static final String WHETER_OR_NOT_USE_MTOM_FOR_ATTACHMENTS = "Wheter or not use MTOM for attachments";

    @Test
    public void declare() throws Exception
    {
        MuleExtensionBuilder builder = new DefaultMuleExtensionBuilder();
        MuleExtension extension = builder.setName(WS_CONSUMER)
                .setDescription(GENERIC_CONSUMER_FOR_SOAP_WEB_SERVICES)
                .setVersion(VERSION)
                .addConfiguration(
                        builder.newConfiguration()
                                .addParameter(builder.newParameter()
                                                      .setName(WSDL_LOCATION)
                                                      .setDescription(URI_TO_FIND_THE_WSDL)
                                                      .setRequired(true)
                                                      .setType(String.class)
                                )
                                .addParameter(builder.newParameter()
                                                      .setName(SERVICE)
                                                      .setDescription(SERVICE_NAME)
                                                      .setRequired(true)
                                                      .setType(String.class)
                                )
                                .addParameter(builder.newParameter()
                                                      .setName(PORT)
                                                      .setDescription(SERVICE_PORT)
                                                      .setRequired(true)
                                                      .setType(String.class)
                                )
                                .addParameter(builder.newParameter()
                                                      .setName(ADDRESS)
                                                      .setDescription(SERVICE_ADDRESS)
                                                      .setRequired(true)
                                                      .setType(String.class)
                                )
                )
                .addOperation(builder.newOperation()
                                      .setName(CONSUMER)
                                      .setDescription(GO_GET_THEM_TIGER)
                                      .setInputTypes(String.class)
                                      .setOutputTypes(String.class)
                                      .addParameter(builder.newParameter()
                                                            .setName(OPERATION)
                                                            .setDescription(THE_OPERATION_TO_USE)
                                                            .setRequired(true)
                                                            .setType(String.class)
                                      )
                                      .addParameter(builder.newParameter()
                                                            .setName(MTOM_ENABLED)
                                                            .setDescription(WHETER_OR_NOT_USE_MTOM_FOR_ATTACHMENTS)
                                                            .setRequired(false)
                                                            .setDefaultValue(true)
                                                            .setType(Boolean.class)
                                      )
                )
                .build();

        assertExtension(extension);
        MuleExtensionConfiguration configuration = extension.getConfiguration(MuleExtensionConfiguration.DEFAULT_NAME);
        extractConfiguration(configuration);


    }

    private void assertExtension(MuleExtension extension)
    {
        assertEquals(WS_CONSUMER, extension.getName());
        assertEquals(GENERIC_CONSUMER_FOR_SOAP_WEB_SERVICES, extension.getDescription());
        assertEquals(VERSION, extension.getVersion());
        assertEquals(1, extension.getConfigurations().size());
    }

    private void extractConfiguration(MuleExtensionConfiguration configuration)
    {
        assertNotNull(configuration);
        assertEquals(MuleExtensionConfiguration.DEFAULT_NAME, configuration.getName());
        assertEquals(MuleExtensionConfiguration.DEFAULT_DESCRIPTION, configuration.getDescription());
        assertEquals(4, configuration.getParameters().size());
    }


}
