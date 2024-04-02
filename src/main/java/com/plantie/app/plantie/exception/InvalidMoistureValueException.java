package com.plantie.app.plantie.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidMoistureValueException extends RuntimeException {
    public InvalidMoistureValueException(String message) {
        super(message);
    }
}
