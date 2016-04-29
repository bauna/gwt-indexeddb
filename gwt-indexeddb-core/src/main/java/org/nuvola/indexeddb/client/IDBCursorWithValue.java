package org.nuvola.indexeddb.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public abstract class IDBCursorWithValue extends IDBCursor  {
    public Object value;
    protected IDBCursorWithValue() {}
}
