package com.entertainment;

public class InvalidBrandException extends Exception {

    public InvalidBrandException() {
        super();
    }

    public InvalidBrandException(String message) {
        super(message);
    }

    public InvalidBrandException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidBrandException(Throwable cause) {
        super(cause);
    }
}
