/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.javabasico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
            main.ejercicioCinco();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
    
    public void ejercicioCinco(){
      ArrayList<String> array=new ArrayList();
      for(int i=1;i<=20;i++)
      {
      array.add(i+"");
      
      }
      
      array.stream().sorted(Comparator.reverseOrder()).filter(e->Integer.valueOf(e)>10).forEach(e->System.out.println(e));
      
     
      
    
    }
}
