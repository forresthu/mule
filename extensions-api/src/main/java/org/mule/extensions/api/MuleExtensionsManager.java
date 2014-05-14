package org.mule.extensions.api;

import org.mule.extensions.introspection.api.MuleExtension;

import java.util.Iterator;

public interface MuleExtensionsManager
{

    void register(MuleExtension extension);

    Iterator<MuleExtension> getExtensions();

}
