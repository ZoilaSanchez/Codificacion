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
    private int valor;
    
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
    
    
  public void buscar( char z,Nodoarbol nodo) //aqui estoy tratando de ver si son 1 o ceros
    {
        Nodoarbol c = null;
        if(nodo == null || nodo.c==z){
            return ;
        }
        System.out.println(nodo.c);
        buscar(z,nodo.getHI());
        buscar(z,nodo.getHD());
       
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
    public void Inordenaux( Nodoarbol nodo, int valor)
    {
        if(nodo == null){
        return;
        }
        nodo.setValor(valor);
        System.out.print(" frecuencia: "+nodo.f); 
        System.out.println(" caracter: "+nodo.c);
        Inordenaux(nodo.getHI(), valor*0);
        Inordenaux(nodo.getHD(),(valor*0 +1));
    }
    
    public void Prueba( Nodoarbol nodo){
        if(nodo == null){
        return;
        }
        System.out.print(" frecuencia : "+nodo.f); 
        System.out.println(" caracter: "+nodo.c);
        System.out.println("Numero a valer es " + nodo.getValor());
        Prueba(nodo.getHI());
        Prueba(nodo.getHD());
    }
}
