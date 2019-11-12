/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol;



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
        System.out.print(" frecuencia : "+nodo.f +" "); 
        System.out.print(" caracter: "+nodo.c+" ");
        System.out.println(" codigo: " + nodo.getValor());
        Prueba(nodo.getHI());
        Prueba(nodo.getHD());
    }
    String x="";
    public void bus(char v, Nodoarbol nodo){
        x="";
        buss(v, nodo);
        
    }
    
    public void buss (char v, Nodoarbol nodo){
        if(nodo!= null){
        if(v==nodo.getC()){
            return; 
        }           
        x+=nodo.getValor();//contateno
       buss(v,nodo.getHI());
       buss(v,nodo.getHD()); 
        }          
    }

    public String getX() {
        return x;
    }
}
