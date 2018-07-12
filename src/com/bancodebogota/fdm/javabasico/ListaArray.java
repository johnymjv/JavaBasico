/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.javabasico;

import java.util.Arrays;

/**
 *
 * @author jjimen7
 */
public class ListaArray {
    
    private int TAMANO=4;    
    private Object[] values;
    
    
    private final static int INCREMENTO=2;
    private int posicion;

    public ListaArray() {
        this.values=new Object[this.TAMANO];
        this.posicion=0;
    }
    
    public void insertar(Object objeto) throws Exception{
    if(objeto instanceof String){
    if((posicion)==(this.TAMANO/INCREMENTO)){        
         this.values= Arrays.copyOf(values,this.TAMANO*INCREMENTO);
          this.TAMANO=this.TAMANO*INCREMENTO;
    }
     this.values[this.posicion]=objeto;
      
        System.out.println("Insertado: "+objeto.toString()+" - POSICION: "+this.posicion+" - TAMAÑO: "+this.TAMANO);
         ++this.posicion; 
    }else
        throw new Exception("Tipo no permitido");
    }
    
    public void imprimir(){
    
        for (int i = 0; i < this.posicion; i++) {
            System.out.println(this.values[i].toString());
        }
    
    }

    public int getTAMANO() {
        return TAMANO;
    }
            
    
}
