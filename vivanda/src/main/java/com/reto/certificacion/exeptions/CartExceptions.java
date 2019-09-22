package com.reto.certificacion.exeptions;

public class CartExceptions extends  AssertionError {

    public CartExceptions()
    {
        super("product not found");

    }

    public CartExceptions(String message)
    {
        super(message);
    }

}

