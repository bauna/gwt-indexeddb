package org.nuvola.indexeddb.client;

import jsinterop.annotations.JsType;

@JsType
public class IDBIndexOptions {
    public boolean unique;
    public String multiEntry;
    public String locale;

    public IDBIndexOptions(boolean unique) {
        this.unique = unique;
    }

    public IDBIndexOptions(boolean unique, String multiEntry) {
        this.unique = unique;
        this.multiEntry = multiEntry;
    }

    public IDBIndexOptions(boolean unique, String multiEntry, String locale) {
        this.unique = unique;
        this.multiEntry = multiEntry;
        this.locale = locale;
    }
}