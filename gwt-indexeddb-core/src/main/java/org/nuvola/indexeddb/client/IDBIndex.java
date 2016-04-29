package org.nuvola.indexeddb.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public abstract class IDBIndex {
    public String name;
    public IDBObjectStore objectStore;
    public Object keyPath;
    public boolean multiEntry;
    public boolean unique;
    protected IDBIndex() {}
    public native IDBRequest get(Object query);
    public native IDBRequest getKey(Object query);
    public native IDBRequest getAll(Object query, int count);
    public native IDBRequest getAll(Object query);
    public native IDBRequest getAll();
    public native IDBRequest getAllKeys(Object query, int count);
    public native IDBRequest getAllKeys(Object query);
    public native IDBRequest getAllKeys();
    public native IDBRequest count(Object query);
    public native IDBRequest count();
    public native IDBRequest openCursor(Object query, String direction);
    public native IDBRequest openCursor(Object query);
    public native IDBRequest openCursor();
    public native IDBRequest openKeyCursor(Object query, String direction);
    public native IDBRequest openKeyCursor(Object query);
    public native IDBRequest openKeyCursor();
}
