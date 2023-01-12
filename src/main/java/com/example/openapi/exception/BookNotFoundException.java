package com.example.openapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class BookNotFoundException extends ResponseStatusException {

    public BookNotFoundException(HttpStatus status) {
        super(status);
    }

    public BookNotFoundException(HttpStatus status, String reason) {
        super(status, reason);
    }

    public BookNotFoundException(HttpStatus status, String reason, Throwable cause) {
        super(status, reason, cause);
    }

    public BookNotFoundException(int rawStatusCode, String reason, Throwable cause) {
        super(rawStatusCode, reason, cause);
    }
}
