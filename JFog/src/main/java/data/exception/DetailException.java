/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.exception;

/**
 *
 * @author KH
 */
public class DetailException extends Exception {

    /**
     * Creates a new instance of <code>DetailException</code> without detail
     * message.
     */
    public DetailException() {
    }

    /**
     * Constructs an instance of <code>DetailException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public DetailException(String msg) {
        super(msg);
    }
}
