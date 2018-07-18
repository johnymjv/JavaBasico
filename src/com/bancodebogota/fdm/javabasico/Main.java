/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.javabasico;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;

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
            //main.ejercicioSeis();
            main.leerArchivo();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
    
    
    public void leerArchivo(){
        
       File file = new File("C:\\sincronizar\\Curso Java Banco\\JavaBasico\\JavaBasico\\README.md");
        System.out.println("Nombre del Archivo:"+file.getName());
        System.out.println("Path relativo:"+file.getPath());
        System.out.println("Path absoluto:"+file.getAbsolutePath());
        System.out.println("Directorio padre"+file.getParent());
        System.out.println(file.exists()?"Existe":"No existe");
    
    }
    
    public void ejercicioSeis(){
     
        Map<Integer ,String > mapa=new HashMap<Integer,String>();
      
      for(int i=1;i<=100;i++){
          
          mapa.put(i,new StringBuilder(i+"").reverse().toString() );
          
      }
      
      
        System.out.println(mapa.values());  
      
          
      
      
        mapa.values().stream().sorted(Comparator.reverseOrder()).forEach(e->System.out.println(e));
     
      
    
    }
}
