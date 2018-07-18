/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.javabasico;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.io.BufferedInputStream;
/**
 *
 * @author jjimen7
 */
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
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
            //main.leerArchivo2();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
    
    
    public void leerArchivo(){
        
       File file = new File("ListaArray.java");
        System.out.println("Nombre del Archivo:"+file.getName());
        System.out.println("Path relativo:"+file.getPath());
        System.out.println("Path absoluto:"+file.getAbsolutePath());
        System.out.println("Directorio padre"+file.getParent());
        System.out.println((file.exists())?"Existe":"No existe");
        System.out.println("Ultima Modificacion:  "+file.lastModified());
        System.out.println((file.canWrite())?"es de escritura":"no es de escritura");
        System.out.println((file.canRead())?"es de lectura":"no es de lectura");
        System.out.println((file.isFile())?"archivo normal":"no normal");
        System.out.println("Tamaño:"+file.length()+" Bytes");
    }
    
    public void leerArchivo2() throws FileNotFoundException, IOException{
        PrintStream out=null,console=null;
    try{
    console=System.out;
    BufferedInputStream in = new BufferedInputStream(new FileInputStream("ListaArray.java"));
    
    out= new PrintStream(new BufferedOutputStream(new FileOutputStream("test.out")));
    
    System.setIn(in);
    System.setOut(out);
    System.setErr(out);
    
    BufferedReader br= new  BufferedReader(new InputStreamReader(System.in));
    
    String s;
    while((s=br.readLine())!=null){
        System.out.println(s);
    
    }
    }finally{
    if(out!=null)
      out.close();
    }
    System.setOut(console);
    }
    
    
}
