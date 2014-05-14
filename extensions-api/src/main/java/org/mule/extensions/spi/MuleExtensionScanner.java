package org.mule.extensions.spi;

import org.mule.extensions.api.MuleExtensionsManager;
import org.mule.extensions.introspection.api.MuleExtension;

import java.util.List;

public interface MuleExtensionScanner
{

    List<MuleExtension> scan();

    int scanAndRegister(MuleExtensionsManager muleExtensionsManager);

}
