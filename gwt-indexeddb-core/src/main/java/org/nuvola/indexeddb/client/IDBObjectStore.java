package org.nuvola.indexeddb.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public abstract class IDBObjectStore {
    public String name;
    public Object keyPath;
    public Object indexNames;
    public IDBTransaction transaction;
    public boolean autoIncrement;
    protected IDBObjectStore() {}
    public native IDBRequest put(Object value, Object key);
    public native IDBRequest put(Object value);
    public native IDBRequest add(Object value, Object key);
    public native IDBRequest add(Object value);
    public native IDBRequest delete(Object query);
    public native IDBRequest clear();
    public native IDBRequest get(Object query);
    public native IDBRequest getKey(Object query);
    public native IDBRequest getAll(Object query, int count);
    public native IDBRequest getAll(Object query);
//    public native IDBRequest getAll();
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
    public native IDBIndex index(String name);
    public native IDBIndex createIndex(String name, Object keyPath, Object options);
    public native IDBIndex createIndex(String name, Object keyPath);
    public native void deleteIndex(String indexName);
}
