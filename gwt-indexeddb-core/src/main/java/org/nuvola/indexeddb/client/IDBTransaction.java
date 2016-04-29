package org.nuvola.indexeddb.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public abstract class IDBTransaction extends EventTarget  {
    public Object objectStoreNames;
    public String mode;
    public IDBDatabase db;
    public Object error;
    public Object onabort;
    public Object oncomplete;
    public Object onerror;
    protected IDBTransaction() {}
    public native IDBObjectStore objectStore(String name);
    public native void abort();
}
