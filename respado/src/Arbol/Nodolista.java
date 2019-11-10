/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol;

import pruebasalgoritomoscom.Elemento;
import pruebasalgoritomoscom.arbol;

/**
 *
 * @author Lopez
 */
public class Nodolista implements Comparable<Nodolista> {
    private Nodoarbol nodo;

    public Nodolista(Nodoarbol nodo) {
        this.nodo = nodo;
    }

    public Nodoarbol getNodo() {
        return nodo;
    }

    public void setNodo(Nodoarbol nodo) {
        this.nodo = nodo;
    }
    public void mostar(){
        
    }
    
    @Override
	public String toString() {
               
		return this.nodo.getC()+ "  -  " + this.nodo.getF();
	}
@Override
     public int compareTo(Nodolista o) {
        String a=new String(String.valueOf(this.nodo.getF())+this.nodo.getC());
        String b=new String(String.valueOf(o.nodo.getF())+o.nodo.getC());
        return a.compareTo(b);
    }

}
