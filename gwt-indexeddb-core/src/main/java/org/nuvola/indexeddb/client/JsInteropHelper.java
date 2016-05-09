package org.nuvola.indexeddb.client;

import com.google.gwt.json.client.JSONObject;

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

    public static native Object castInt(int num) /*-{
        return num;
    }-*/;

    public static native double castDouble(Object num) /*-{
        return num;
    }-*/;

    /**
     * Utility method to cast objects in production.
     * Useful for casting native implementations to interfaces like JsInterop
     */
    public static native <T> T cast(Object o) /*-{
      return o;
    }-*/;

    public static JSONObject asJSONObject(Object o) {
        return o == null ? new JSONObject() : new JSONObject(cast(o));
    }
}
