package org.nuvola.indexeddb.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public abstract class IDBOpenDBRequest extends IDBRequest {
    public EventHandler<Event> onblocked;
    public EventHandler<IDBVersionChangeEvent> onupgradeneeded;

    protected IDBOpenDBRequest() {}
}
