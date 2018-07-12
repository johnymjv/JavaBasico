/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.javabasico;

/**
 *
 * @author jjimen7
 */
public class Nodo {
  
    private Object value;
    private Nodo next;

    public void setValue(Object value) {
        this.value = value;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public Nodo getNext() {
        return next;
    }

    public Nodo(Object value) {
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return this.value.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
