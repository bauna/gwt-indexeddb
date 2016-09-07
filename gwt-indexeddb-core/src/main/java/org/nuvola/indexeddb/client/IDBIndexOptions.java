package org.nuvola.indexeddb.client;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class IDBIndexOptions {
    @JsProperty
    public boolean unique;

    @JsProperty
    public boolean multiEntry;

    @JsProperty
    public String locale;

    @JsConstructor
    public IDBIndexOptions(boolean unique, boolean multiEntry) {
        this.unique = unique;
        this.multiEntry = multiEntry;
    }
}