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
public class OrdersException extends Exception {

    /**
     * Creates a new instance of <code>OrdersException</code> without detail
     * message.
     */
    public OrdersException() {
    }

    /**
     * Constructs an instance of <code>OrdersException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public OrdersException(String msg) {
        super(msg);
    }
}
