package org.nuvola.indexeddb.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class Event {
    public static short NONE; // = 0
    public static short CAPTURING_PHASE; // = 1
    public static short AT_TARGET; // = 2
    public static short BUBBLING_PHASE; // = 3
    public String type;
    public EventTarget target;
    public EventTarget currentTarget;
    public short eventPhase;
    public boolean bubbles;
    public boolean cancelable;
    public boolean defaultPrevented;
    public boolean isTrusted;
    public Object timeStamp;
    public Event(String type, Object eventInitDict) {}
    public Event(String type) {}
    protected Event() {}
    public native void stopPropagation();
    public native void stopImmediatePropagation();
    public native void preventDefault();
    public native void initEvent(String type, boolean bubbles, boolean cancelable);
}
