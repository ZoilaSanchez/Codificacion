/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasalgoritomoscom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Lopez
 */
public class Contadorpalabras {
    ArrayList<Elemento> arreglo = new ArrayList<Elemento>();
  Iterator<Elemento> iterador = arreglo.iterator();
 Elemento x= new Elemento();
    arbol z= new arbol();
    public void verificarcantidad(String original){
        String cadena = original.replace(" ", ""); //eliminar espacios
        char [] Arraycadena ;
        char caracter;
        int contador =0;
        //map mapeo ordenando de la a a la z
        Map<Character, Integer> numChars = new HashMap<Character, Integer>();
        for (int i = 0; i < cadena.length(); ++i){
                 char charAt = cadena.charAt(i);
            if (!numChars.containsKey(charAt)){//si es nuevo el caracter
                 numChars.put(charAt, 1); //crea unnuevo contador
            }else{ //solo aumenta el contador
        numChars.put(charAt, numChars.get(charAt) + 1);
            }
       }//fin del for
       
        Iterator it = numChars.entrySet().iterator();//siver para extraer los caracteres
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            arbol p=new arbol();
            p.esvacia();
           
            algoritmo(null,(char) pair.getKey(),(int) pair.getValue());
            
        }
        
         Collections.sort(arreglo); // ordenar el arreglo

    }//fin del metodo
    public void algoritmo(Nodo a,char c,int f){
        arreglo.add(new Elemento(a,c, f)); 
       
    }
 
    public void continuar(){
        
        System.out.println("El arreglo es: "+arreglo);
        for (int i = 0; i < arreglo.size(); i++) {
            
            if((i+1)<arreglo.size()){
                int F1=arreglo.get(i).getF();
                int F2=arreglo.get(i+1).getF();
                int total=F1+F2;
               //arbol es el nuevo arbol
               //raiz=total
                //HI=f1
                //HD=f2
                
             arbol arboles =new arbol();
             Nodo x=new Nodo();
             x.setV(total);
             
             Nodo p=new Nodo();
             p.setV(arreglo.get(i).getF());
             p.setC(arreglo.get(i).getC());
             
             Nodo t=new Nodo();
             t.setV(arreglo.get(i+1).getF());
             t.setC(arreglo.get(i+1).getC());
                //0 es izquierda y 1 es derecha
            x.setHD(p);
             x.setHI(t);
             arboles.setRaiz(x);
                
                //ingresar el arbol a la lista
                arreglo.add(new Elemento(arboles.getRaiz(),
                        arboles.getRaiz().getC(), total));
                
                Collections.sort(arreglo);//metodo para ordenar
                arreglo.remove(i);
                arreglo.remove(i);
                   arboles.Inorden();
                z=arboles;
                continuar();
               
            } 
        }   
    }
    
    public void imprimir(){
        iterador= arreglo.iterator();
        while(iterador.hasNext()){
            Elemento elementos = iterador.next();
            System.out.println("HD: "+ elementos.getTel().getHD().getC()+" rrec "+elementos.getTel().getHD().getV());
       
            System.out.println("HI: "+ elementos.getTel().getHI().getC()+" rrec "+elementos.getTel().getHI().getV());
        }
        
    }
}
