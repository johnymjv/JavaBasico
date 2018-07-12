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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Nodo nodo=new Nodo("1");
        ListaSimple lista=new ListaSimple(nodo);
                
        nodo=new Nodo("2");
        lista.insertarNodo(nodo);
        
        nodo=new Nodo("3");
        lista.insertarNodo(nodo);
        
        nodo=new Nodo("4");
        lista.insertarNodo(nodo);
        
        nodo=new Nodo("5");
        lista.insertarNodo(nodo);
        
        nodo=new Nodo("6");
        lista.insertarNodo(nodo);
        
        nodo=new Nodo("7");
        lista.insertarNodo(nodo);
        
        nodo=new Nodo("8");
        lista.insertarNodo(nodo);
        
        nodo=new Nodo("9");
        lista.insertarNodo(nodo);
        
        nodo=new Nodo("10");
        lista.insertarNodo(nodo);
        
        lista.listar();
        
        ListaArray listaArray=new ListaArray();
        listaArray.insertar("1");
        listaArray.insertar("2");        
        listaArray.insertar("3");
        listaArray.insertar("4");
        listaArray.insertar("5");        
        listaArray.insertar("6");
        listaArray.insertar("7");
        listaArray.insertar("8");        
        listaArray.insertar("9");
        listaArray.insertar("10");
        listaArray.insertar("11");        
        listaArray.insertar("12");
        listaArray.insertar("13");
        listaArray.insertar("14");        
        listaArray.insertar("15");
        listaArray.insertar("16");
        listaArray.insertar("17");        
        listaArray.insertar("18");
        
        
        
    }
    
}
