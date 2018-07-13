/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.javabasico;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 *
 * @author jjimen7
 */
public class ListaSimple<T> implements Iterator{
    
    private Nodo root;
    private Nodo nodoAct;
    private Nodo nodoActualRecorrido;

    public ListaSimple(T objeto) {
        Nodo nodo=new Nodo(objeto);
        this.root = nodo;
        this.nodoAct = nodo;
    }

    public Nodo getRoot() {
        return root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }

    public Nodo getNodoAct() {
        return nodoAct;
    }

    public void setNodoAct(Nodo nodoAct) {
        this.nodoAct = nodoAct;
    }
    
    public void insertarNodo(T objeto) {
        
        
        Nodo nodo=new Nodo(objeto);
       
       this.nodoAct.setNext(nodo);
       this.nodoAct=nodo;
       
    }
    
    public void listar(){
    Nodo nodo=this.root;
        System.out.println(nodo);
    while(nodo.getNext()!=null){
        nodo=nodo.getNext();
        System.out.println(nodo);
    }
    
    }

    @Override
    public boolean hasNext() {
        if(this.nodoActualRecorrido.getNext()!=null)
        return true;
        this.nodoActualRecorrido=this.root;
      return false;  
    }

    @Override
    public Object next() {
        this.nodoActualRecorrido=nodoActualRecorrido.getNext();
        return this.nodoActualRecorrido.getValue();
    }

    @Override
    public void remove() {
        Iterator.super.remove(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void forEachRemaining(Consumer action) {
        Iterator.super.forEachRemaining(action); //To change body of generated methods, choose Tools | Templates.
    }
}
