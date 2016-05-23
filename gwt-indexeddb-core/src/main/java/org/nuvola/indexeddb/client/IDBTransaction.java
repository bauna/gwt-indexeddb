package org.nuvola.indexeddb.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public abstract class IDBTransaction extends EventTarget  {
    public Object objectStoreNames;
    public String mode;
    public IDBDatabase db;
    public Object error;
    public EventHandler<Event> onabort;
    public EventHandler<Event> oncomplete;
    public EventHandler<Event> onerror;
    protected IDBTransaction() {}
    public native IDBObjectStore objectStore(String name);
    public native void abort();
}
