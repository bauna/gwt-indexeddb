package org.nuvola.indexeddb.client;

public class JsInteropHelper {
    public static native void initIndexDb() /*-{
        $wnd.indexedDB = $wnd.indexedDB || $wnd.mozIndexedDB || $wnd.webkitIndexedDB;
    }-*/;

    public static native IDBFactory getIndexedDB() /*-{
        return $wnd.indexedDB;
    }-*/;

    public static native int castInt(Object num) /*-{
        return num;
    }-*/;

    public static native double castDouble(Object num) /*-{
        return num;
    }-*/;
}
