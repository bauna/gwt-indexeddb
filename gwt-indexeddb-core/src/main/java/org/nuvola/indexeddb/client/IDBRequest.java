package org.nuvola.indexeddb.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public abstract class IDBRequest extends EventTarget  {
    public Object result;
    public Object error;
    public IDBTransaction transaction;
    public String readyState;
    public EventHandler<Event> onsuccess;
    public EventHandler<Event> onerror;
    protected IDBRequest() {}
}
