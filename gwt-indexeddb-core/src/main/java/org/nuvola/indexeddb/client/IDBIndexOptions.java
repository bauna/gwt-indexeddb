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
}