package org.nuvola.indexeddb.client;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public abstract class IDBCursor {
    public String direction;
    public Object key;
    public Object primaryKey;
    public Object value;
    protected IDBCursor() {}
    public native void advance(int count);

    @JsMethod(name="continue")
    public native void continue0(Object key);

    @JsMethod(name="continue")
    public native void continue0();
    public native void continuePrimaryKey(Object key, Object primaryKey);
    public native IDBRequest update(Object value);
    public native IDBRequest delete();
}
