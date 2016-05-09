package org.nuvola.indexeddb.client;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsType;

@JsType
public class IDBIndexOptions {
    public boolean unique;
    public boolean multiEntry;
    public String locale;

    @JsConstructor
    public IDBIndexOptions(boolean unique, boolean multiEntry) {
        this.unique = unique;
        this.multiEntry = multiEntry;
    }
}