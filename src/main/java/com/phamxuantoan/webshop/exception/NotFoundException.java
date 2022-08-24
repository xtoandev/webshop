package com.phamxuantoan.webshop.exception;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String mess){
        super(mess);
    }
}
