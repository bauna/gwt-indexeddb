package org.nuvola.indexeddb.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class EventSource extends EventTarget  {
    public static short CONNECTING; // = 0
    public static short OPEN; // = 1
    public static short CLOSED; // = 2
    public String url;
    public boolean withCredentials;
    public short readyState;
    public Object onopen;
    public Object onmessage;
    public Object onerror;
    public EventSource(String url, Object eventSourceInitDict) {}
    public EventSource(String url) {}
    protected EventSource() {}
    public native void close();
    public native void addEventListener(String type, EventListener callback, boolean capture);
    public native void addEventListener(String type, EventListener callback);
    public native void removeEventListener(String type, EventListener callback, boolean capture);
    public native void removeEventListener(String type, EventListener callback);
    public native boolean dispatchEvent(Event event);
}
