package org.nuvola.indexeddb.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.json.client.JSONArray;
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

    public static JSONArray asJSONArray(Object o) {
        return o == null ? new JSONArray() : new JSONArray(cast(o));
    }

    public static native <T> T getProp(Object o, String propertyName) /*-{
        return o[propertyName];
    }-*/;

    public static native String getString(Object o, String propertyName) /*-{
        return "" + o[propertyName];
    }-*/;

    public static native double getNum(Object o, String propertyName) /*-{
        return o[propertyName] || 0;
    }-*/;

    public static native String getISODate(Object o, String propertyName) /*-{
        var date = o[propertyName] || 0;

        return new Date(date).toISOString();
    }-*/;

    public static native <T extends JavaScriptObject> T keys(JavaScriptObject object) /*-{
        var data = [];
        for (var item in object) {
          if (Object.prototype.hasOwnProperty.call(object, item)) {
            var key = @elemental.js.util.JsMapFromStringTo::keyForProperty(Ljava/lang/String;)(item);
            data.push(key);
          }
        }
        return data;
    }-*/;
}
