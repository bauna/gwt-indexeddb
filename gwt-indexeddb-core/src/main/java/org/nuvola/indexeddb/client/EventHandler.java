package org.nuvola.indexeddb.client;

import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface EventHandler<T extends Event> {
    void execute(T event);
}
