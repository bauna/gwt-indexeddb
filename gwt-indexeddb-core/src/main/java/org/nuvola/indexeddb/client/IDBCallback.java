package org.nuvola.indexeddb.client;

import jsinterop.annotations.JsFunction;

@JsFunction
@FunctionalInterface
public interface IDBCallback {
    public void onEvent(IDBEvent pEvent);
}
