/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3estructuras;

import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Lopez
 */
public class Elemento implements Comparable<Elemento>{
    private char caracter;
    private int frecuencia;

    public Elemento(){
        
    }

   

    public void setSiguiente(Elemento siguiente) {
      
    }

    public Elemento(char caracter, int frecuencia) {
        this.caracter = caracter;
        this.frecuencia = frecuencia;
        
    }
    

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }
    
    @Override
	public String toString() {
		return this.getCaracter() + "  -  " + this.getFrecuencia();
	}

     @Override
     public int compareTo(Elemento o) {
        String a=new String(String.valueOf(this.getFrecuencia())+this.getFrecuencia());
        String b=new String(String.valueOf(o.getFrecuencia())+o.getCaracter());
        return a.compareTo(b);
    }
        
}
