/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.javabasico;

import java.util.Iterator;

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
        try {

            ListaSimple<String> lista = new ListaSimple("1");

            for (int i = 2; i <= 10; i++) {
                lista.insertarNodo(i + "");
            }

            for (String valor : lista) {
                System.out.println(valor);
            }

            // lista.listar();
            ListaArray<String> listaArray = new ListaArray();
            for (int i = 0; i < 18; i++) {
                listaArray.insertar(i + "");
            }

            for (String valor : listaArray) {
                System.out.println(valor);

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
