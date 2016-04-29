package org.nuvola.indexeddb.client;

import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class IDBDatabase extends JavaScriptObject {
    protected IDBDatabase() {
    }

    public final native String name() /*-{
        return this.name;
    }-*/;

    public final native String version() /*-{
        return this.version;
    }-*/;

    public final List<String> getObjectStoreNames() {
        return IDBUtils.toList(getObjectStoreNames0());
    }

    private native JsArrayString getObjectStoreNames0() /*-{
        return this.objectStoreNames;
    }-*/;

    public final native void onError(IDBCallback pCallback) /*-{
        this.onerror = function (evt) {
            @org.nuvola.indexeddb.client.IDBUtils::fireCallback(Lorg/nuvola/indexeddb/client/IDBCallback;Lorg/nuvola/indexeddb/client/IDBEvent;)(pCallback, evt);
        };
    }-*/;

    public final native void onAbort(IDBCallback pCallback) /*-{
        this.onabort = function (evt) {
            @org.nuvola.indexeddb.client.IDBUtils::fireCallback(Lorg/nuvola/indexeddb/client/IDBCallback;Lorg/nuvola/indexeddb/client/IDBEvent;)(pCallback, evt);
        };
    }-*/;

    public final native void onVersionChange(IDBCallback pCallback) /*-{
        this.onversionchange = function (evt) {
            @org.nuvola.indexeddb.client.IDBUtils::fireCallback(Lorg/nuvola/indexeddb/client/IDBCallback;Lorg/nuvola/indexeddb/client/IDBEvent;)(pCallback, evt);
        };
    }-*/;

    public final native void close() /*-{
        this.close();
    }-*/;

    private native IDBTransaction transaction0(JsArrayString pStoreNames, String pMode) throws JavaScriptException /*-{
        return this.transaction(pStoreNames, pMode);
    }-*/;

    public final IDBTransaction transaction(String[] pStoreNames, String pMode) throws IDBException {
        try {
            return transaction0(IDBUtils.toJsArray(pStoreNames), pMode);
        } catch (JavaScriptException jex) {
            throw new IDBException(jex);
        }
    }

    public final IDBTransaction transaction(String[] pStoreNames) throws IDBException {
        return transaction(pStoreNames, IDBTransaction.READ_WRITE);
    }

    private native IDBObjectStore createObjectStore0(String pName) throws JavaScriptException /*-{
        return this.createObjectStore(pName);
    }-*/;

    private native IDBObjectStore createObjectStore0(String pName, IDBDatabaseOptionalParameters pParams) throws JavaScriptException /*-{
        return this.createObjectStore(pName, pParams);
    }-*/;

    public final IDBObjectStore createObjectStore(String pName) throws IDBException {
        try {
            return this.createObjectStore0(pName);
        } catch (JavaScriptException jex) {
            throw new IDBException(jex);
        }
    }

    public final IDBObjectStore createObjectStore(String pName, IDBDatabaseOptionalParameters pParams) throws IDBException {
        try {
            return this.createObjectStore0(pName, pParams);
        } catch (JavaScriptException jex) {
            throw new IDBException(jex);
        }
    }

    private native void deleteObjectStore0(String pName) throws JavaScriptException /*-{
        this.deleteObjectStore(pName);
    }-*/;

    public final void deleteObjectStore(String pName) throws IDBException {
        try {
            this.deleteObjectStore0(pName);
        } catch (JavaScriptException jex) {
            throw new IDBException(jex);
        }
    }

    public static void open(String pName, final ConnectionCallback pCallback) {
        open(pName, 1, pCallback);
    }

    public static void open(String pName, int version, final ConnectionCallback pCallback) {
        final IDBOpenDBRequest ir = IDBFactory.open(pName, version);
        ir.onError(new IDBCallback() {
            @Override
            public void onEvent(IDBEvent pEvent) {
                GWT.log("Error:" + pEvent);
                pCallback.onFailure(new IDBException(IDBException.UNKNOWN_ERR, pEvent.toString()));
            }
        });
        ir.onSuccess(new IDBCallback() {
            @Override
            public void onEvent(IDBEvent pEvent) {
                try {
                    pCallback.onSuccess((IDBDatabase) ir.result().cast());
                } catch (IDBException ex) {
                    pCallback.onFailure(ex);
                }
            }
        });
        ir.onUpgradeNeeded(new IDBCallback() {
            @Override
            public void onEvent(IDBEvent pEvent) {
                try {
                    pCallback.onUpgradeNeeded((IDBDatabase) ir.result().cast());
                } catch (IDBException ex) {
                    pCallback.onFailure(ex);
                }
            }
        });
    }

    public static void deleteDatabase(String pName, final AsyncCallback<IDBEvent> pCallback) {
        final IDBOpenDBRequest ir = IDBFactory.deleteDatabase(pName);
        ir.onError(new IDBCallback() {
            @Override
            public void onEvent(IDBEvent pEvent) {
                GWT.log("Error:" + pEvent);
                pCallback.onFailure(new IDBException(IDBException.UNKNOWN_ERR, pEvent.toString()));
            }
        });
        ir.onBlocked(new IDBCallback() {
            @Override
            public void onEvent(IDBEvent pEvent) {
                GWT.log("Blocked:" + pEvent);
                pCallback.onFailure(new IDBException(IDBException.UNKNOWN_ERR, pEvent.toString()));
            }
        });
        ir.onSuccess(new IDBCallback() {
            @Override
            public void onEvent(IDBEvent pEvent) {
                pCallback.onSuccess(pEvent);
            }
        });
    }

}
