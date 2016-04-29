package org.nuvola.indexeddb.client;

import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface EventListener {
    void handleEvent(Event event);
}
