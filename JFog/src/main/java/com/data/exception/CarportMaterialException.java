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
public class CarportMaterialException extends Exception {

    /**
     * Creates a new instance of <code>CarportMaterialException</code> without
     * detail message.
     */
    public CarportMaterialException() {
    }

    /**
     * Constructs an instance of <code>CarportMaterialException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public CarportMaterialException(String msg) {
        super(msg);
    }
}
