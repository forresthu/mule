package org.mule.extensions.introspection.api;

import java.util.concurrent.Future;

public interface OperationExecutor
{

    <T> Future<T> execute(Object extensionInstance, OperationContext operationContext);

}
