package com.zzy.resourcemanagementsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DuplicateNameException extends RuntimeException {

    public DuplicateNameException(String message) {
        super(message);
    }

    public DuplicateNameException(String messgae, Throwable cause) {
        super(messgae, cause);
    }
}
