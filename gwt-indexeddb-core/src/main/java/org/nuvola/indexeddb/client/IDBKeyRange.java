package org.nuvola.indexeddb.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public abstract class IDBKeyRange {
    public Object lower;
    public Object upper;
    public boolean lowerOpen;
    public boolean upperOpen;
    protected IDBKeyRange() {}
    public static native IDBKeyRange only(Object value);
    public static native IDBKeyRange lowerBound(Object lower, boolean open);
    public native IDBKeyRange lowerBound(Object lower);
    public static native IDBKeyRange upperBound(Object upper, boolean open);
    public native IDBKeyRange upperBound(Object upper);
    public static native IDBKeyRange bound(Object lower, Object upper, boolean lowerOpen, boolean upperOpen);
    public native IDBKeyRange bound(Object lower, Object upper, boolean lowerOpen);
    public native IDBKeyRange bound(Object lower, Object upper);
    public native boolean includes(Object key);
}
