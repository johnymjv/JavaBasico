/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.javabasico;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.lang.*;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 *
 * @author jjimen7
 * @param <T>
 */
public class ListaArray<T> implements Iterable<T> {
    private int TAMANO = 4;
    private T[] values;
    private final static int INCREMENTO = 2;
    private int posicion;
    
    
    // Constructor that takes a "raw" array and stores it
    @SuppressWarnings("unchecked")
    public ListaArray() {

        this.values = (T[]) new Object[TAMANO];
        this.posicion = 0;
       
    }
    
    public void insertar(T objeto) {

        if ((posicion) == (this.TAMANO / INCREMENTO)) {
            this.values = Arrays.copyOf(values, this.TAMANO * INCREMENTO);
            this.TAMANO = this.TAMANO * INCREMENTO;
        }
        this.values[this.posicion] = objeto;

        System.out.println("Insertado: " + objeto.toString() + " - POSICION: " + this.posicion + " - TAMAÑO: " + this.TAMANO);
        ++this.posicion;

    }
    
    public void imprimir() {

        for (int i = 0; i < this.posicion; i++) {
            System.out.println(this.values[i].toString());
        }

    }
    public int getTAMANO() {
        return TAMANO;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator(); //To change body of generated methods, choose Tools | Templates.
    }



public class MyIterator implements Iterator<T>{

    private int posicionRecorrido=0;             

    @Override
    public boolean hasNext() {
        if(posicionRecorrido<posicion)
            return true;    
      
        
        return false;
    }

    @Override
    public T next() {
       T valor= values[posicionRecorrido];
       ++this.posicionRecorrido;
        return valor;
    }

    @Override
    public void remove() {
        Iterator.super.remove(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void forEachRemaining(Consumer<? super T> action) {
        Iterator.super.forEachRemaining(action); //To change body of generated methods, choose Tools | Templates.
    }

}
}