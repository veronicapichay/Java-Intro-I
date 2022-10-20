package com.hr;

public class WorkException extends Exception {

    public WorkException() {
    }

    public WorkException(String message) {
        super(message);
    }

    public WorkException(String message, Throwable cause) { //reason message and underlying cause - Option 4
        super(message, cause);
    }

    public WorkException(Throwable cause) {
        super(cause);
    }
}
