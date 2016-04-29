package org.nuvola.indexeddb.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class IDBVersionChangeEvent extends Event  {
    public Object oldVersion;
    public Object newVersion;
    public IDBVersionChangeEvent(String type, Object eventInitDict) {}
    public IDBVersionChangeEvent(String type) {}
    protected IDBVersionChangeEvent() {}
}
