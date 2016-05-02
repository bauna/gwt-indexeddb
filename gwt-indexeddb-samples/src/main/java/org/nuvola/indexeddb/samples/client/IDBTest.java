package org.nuvola.indexeddb.samples.client;

import org.nuvola.indexeddb.client.IDBDatabase;

import com.google.gwt.core.client.EntryPoint;

@SuppressWarnings("unused")
public class IDBTest implements EntryPoint {
    private IDBDatabase database;

    @Override
    public void onModuleLoad() {
        openDatabaseConnection("test_db", 5);
    }

    private void openDatabaseConnection(final String databaseName, int version) {
//        IDBDatabase.open(databaseName, version, new ConnectionCallback() {
//            @Override
//            public void onFailure(Throwable throwable) {
//                Window.alert("Can't open connection to database");
//            }
//
//            @Override
//            public void onUpgradeNeeded(IDBDatabase idbDatabase) {
//                database = idbDatabase;
//                initialzeStructure(idbDatabase);
//            }
//
//            @Override
//            public void onSuccess(IDBDatabase idbDatabase) {
//                database = idbDatabase;
//                insertData();
//            }
//        });
    }

    private void initialzeStructure(IDBDatabase idbDatabase) {
//        try {
//            // Create user object store
//            IDBDatabaseOptionalParameters parameters = IDBDatabaseOptionalParameters.create("id", true);
//            idbDatabase.createObjectStore("users", parameters);
//        } catch (IDBException e) {
//            Window.alert(e.getMessage());
//        }
    }

    private void insertData() {
//        try {
//            IDBTransaction tx = database.transaction(new String[] {"users"});
//            // TODO Use GWT-Jackson to Serialze Data ...
//        } catch (IDBException e) {
//            Window.alert(e.getMessage());
//        }
    }
}
