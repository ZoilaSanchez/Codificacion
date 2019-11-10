/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol;

import pruebasalgoritomoscom.Nodo;

/**
 *
 * @author Lopez
 */
public class Nodoarbol {
    private char c;
    private int f;
    private char simbolo;
    private Nodoarbol HI,HD;

    public Nodoarbol(char c, int f, Nodoarbol HI, Nodoarbol HD) {
        this.c = c;
        this.f = f;
        this.HI = HI;
        this.HD = HD;
        this.simbolo=simbolo;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public Nodoarbol getHI() {
        return HI;
    }

    public void setHI(Nodoarbol HI) {
        this.HI = HI;
    }

    public Nodoarbol getHD() {
        return HD;
    }

    public void setHD(Nodoarbol HD) {
        this.HD = HD;
    }
    
    
  public void buscar( char z,Nodoarbol nodo)
    {
        Nodoarbol c = null;
        if(nodo == null){
            return ;
        }
        if(nodo.c==z){
            System.out.println(nodo.f);
        System.out.print(" frecuencia: "+nodo.f); 
        System.out.println(" caracter: "+nodo.c);
            c= nodo;
            /*return ;*/
        }
        buscar(z,nodo.getHI());
        buscar(z,nodo.getHD());
       
    }
    
    
    public void Inordenaux( Nodoarbol nodo)
    {
        if(nodo == null){
        return;
        }
        Inordenaux(nodo.getHI());
        System.out.print(" frecuencia: "+nodo.f); 
        System.out.println(" caracter: "+nodo.c);
        Inordenaux(nodo.getHD());
    }
    
}
