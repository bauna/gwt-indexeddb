package org.nuvola.indexeddb.client;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsIgnore;
import jsinterop.annotations.JsType;

@JsType
public class IDBDatabaseOptionalParameters {
    public boolean autoIncrement;
    public String keyPath;

    @JsConstructor
    public IDBDatabaseOptionalParameters(String keyPath, boolean autoIncrement) {
        this.keyPath = keyPath;
        this.autoIncrement = autoIncrement;
    }

    @JsIgnore
    public IDBDatabaseOptionalParameters(String keyPath) {
        this(keyPath, false);
    }
}