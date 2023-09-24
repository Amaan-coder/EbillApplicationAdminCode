package com.example.ebill.exception;

public class ValidationFailedException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private int status;

    public ValidationFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValidationFailedException(String message, int status) {
        super(message);
        this.status = status;
    }

    public ValidationFailedException(String message) {
        super(message);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }

    public int getStatus() {
        return status;
    }
}