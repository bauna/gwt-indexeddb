package org.nuvola.indexeddb.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public abstract class IDBDatabase extends EventTarget  {
    public String name;
    public Object version;
    public Object objectStoreNames;
    public Object onabort;
    public Object onclose;
    public Object onerror;
    public Object onversionchange;
    protected IDBDatabase() {}
    public native IDBTransaction transaction(String[] storeNames, String mode);
    public native IDBTransaction transaction(String[] storeNames);
    public native void close();
    public native IDBObjectStore createObjectStore(String name, Object options);
    public native IDBObjectStore createObjectStore(String name);
    public native void deleteObjectStore(String name);
}
