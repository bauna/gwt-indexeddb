package org.nuvola.indexeddb.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public abstract class IDBFactory {
    protected IDBFactory() {}
    public native IDBOpenDBRequest open(String name, int version);
    public native IDBOpenDBRequest open(String name);
    public native IDBOpenDBRequest deleteDatabase(String name);
    public native short cmp(Object first, Object second);
}
