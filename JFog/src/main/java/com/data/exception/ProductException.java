/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.data.exception;

/**
 *
 * @author KH
 */
public class ProductException extends Exception {

    /**
     * Creates a new instance of <code>ProductException</code> without detail
     * message.
     */
    public ProductException() {
    }

    /**
     * Constructs an instance of <code>ProductException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ProductException(String msg) {
        super(msg);
    }
}
