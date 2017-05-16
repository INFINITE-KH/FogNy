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
public class CarportPartException extends Exception {

    /**
     * Creates a new instance of <code>CarportPartException</code> without
     * detail message.
     */
    public CarportPartException() {
    }

    /**
     * Constructs an instance of <code>CarportPartException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public CarportPartException(String msg) {
        super(msg);
    }
}
