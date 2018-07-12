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
public class ListaSimple {
    
    private Nodo root;
    private Nodo nodoAct;

    public ListaSimple(Nodo nodo) {
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
    
    public void insertarNodo(Nodo nodo){
       nodo.setNext(null);
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
}
