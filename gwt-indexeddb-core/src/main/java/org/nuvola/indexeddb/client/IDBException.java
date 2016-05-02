package org.nuvola.indexeddb.client;

import com.google.gwt.core.client.JavaScriptException;

@SuppressWarnings("serial")
public class IDBException extends Exception {
    public static final int NO_ERR = 0;
    public static final int UNKNOWN_ERR = 1;
    public static final int NON_TRANSIENT_ERR = 2;
    public static final int NOT_FOUND_ERR = 3;
    public static final int CONSTRAINT_ERR = 4;
    public static final int DATA_ERR = 5;
    public static final int NOT_ALLOWED_ERR = 6;
    public static final int TRANSACTION_INACTIVE_ERR = 7;
    public static final int ABORT_ERR = 8;
    public static final int READ_ONLY_ERR = 9;
    public static final int TIMEOUT_ERR = 10;
    public static final int QUOTA_ERR = 11;

    private int m_code;

    public IDBException(JavaScriptException pException) {
        super(pException.getDescription(), pException);
        if (!pException.isThrownSet()) {
            m_code = UNKNOWN_ERR;
        } else {
            try {
                m_code = getErrorCode(pException.getThrown());
            } catch (Throwable th) {
                m_code = UNKNOWN_ERR;
            }
        }
    }

    private IDBException() {
    }

    private native int getErrorCode(Object pJSO) /*-{
        return pJSO.code;
    }-*/;

    public IDBException(int pCode, String pMessage) {
        super(pMessage);
        m_code = pCode;
    }

    public final int getCode() {
        return m_code;
    }
}
