/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.javabasico;

import java.util.ArrayList;
import java.util.Collections;
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
          
            Main main=new Main();
            main.ejercicioTres();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
    
    public void ejercicioTres(){
      ArrayList array=new ArrayList();
      for(int i=1;i<=20;i++)
      {
      array.add(i+"");
      
      }
      Collections.reverse(array);
      
      for(Object valor:array){
          System.out.println(valor);
      }
      
    
    }
    
    public void ejercicioCuatro(){
      ArrayList<String> array=new ArrayList();
      for(int i=1;i<=20;i++)
      {
      array.add(i+"");
      
      }
      Collections.reverse(array);
      
      for(String valor:array){
          System.out.println(valor);
      }
      
    
    }
    
}
