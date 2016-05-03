package org.nuvola.indexeddb.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public abstract class EventTarget {
    public Object result;
    public Object errorCode;
    protected EventTarget() {}
    public native void addEventListener(String type, EventListener callback, boolean capture);
    public native void addEventListener(String type, EventListener callback);
    public native void removeEventListener(String type, EventListener callback, boolean capture);
    public native void removeEventListener(String type, EventListener callback);
    public native boolean dispatchEvent(Event event);
}
