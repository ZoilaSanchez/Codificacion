/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasalgoritomoscom;

/**
 *
 * @author Lopez
 */
public class Elemento implements Comparable<Elemento>  {
      private Nodo tel;    
    private char c;
    int f;
    private Elemento siguiente;
    
    public Elemento(){//Esto es si queremos crear un elemento sin pasarle datos
    
    }
    
    public Elemento(Nodo dato,char c, int f){
        this.tel = dato;
        this.c=c;
        this.f=f;          
    }

    public Nodo getTel() {
        return tel;
    }

    public void setTel(Nodo tel) {
        this.tel = tel;
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

    public Elemento getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Elemento siguiente) {
        this.siguiente = siguiente;
    }

 @Override
	public String toString() {
		return this.getC()+ "  -  " + this.getF();
	}
@Override
     public int compareTo(Elemento o) {
        String a=new String(String.valueOf(this.getF())+this.getF());
        String b=new String(String.valueOf(o.getF())+o.getC());
        return a.compareTo(b);
    }

    
}
