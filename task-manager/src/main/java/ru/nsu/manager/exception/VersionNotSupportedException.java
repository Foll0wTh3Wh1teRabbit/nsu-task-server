package ru.nsu.manager.exception;

public class VersionNotSupportedException extends RuntimeException {
    public VersionNotSupportedException(String message) {
        super(message);
    }
}
