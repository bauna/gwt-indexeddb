package org.nuvola.indexeddb.client;

import jsinterop.annotations.JsType;

@JsType
public class IDBDatabaseOptionalParameters {
    public boolean autoIncrement;
    public String keyPath;

    public IDBDatabaseOptionalParameters(String keyPath, boolean autoIncrement) {
        this.keyPath = keyPath;
        this.autoIncrement = autoIncrement;
    }
}