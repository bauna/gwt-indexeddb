package org.nuvola.indexeddb.client;

public enum IDBTransactionMode {
    READONLY,
    READWRITE,
    VERSIONCHANGE;

    public String asString() {
        return name().toLowerCase();
    }

    @Override
    public String toString() {
        return asString();
    }
}
