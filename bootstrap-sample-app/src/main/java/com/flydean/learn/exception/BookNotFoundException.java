package com.flydean.learn.exception;

/**
 * @author wayne
 * @version BookNotFoundException,  2020/1/10 11:24 下午
 */
public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(){

    }
    public BookNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    // ...
}
