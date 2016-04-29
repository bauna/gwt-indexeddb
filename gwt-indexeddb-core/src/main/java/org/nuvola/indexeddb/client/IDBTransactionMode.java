package org.nuvola.indexeddb.client;

public interface IDBTransactionMode {
    public static String READONLY = "readonly";
    public static String READWRITE = "readwrite";
    public static String VERSIONCHANGE = "versionchange";
}
