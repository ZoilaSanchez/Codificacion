/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasalgoritomoscom;


import Arbol.Nodoarbol;
import Arbol.Nodolista;
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
  cronometro reloj=new cronometro();
  
  /**
 *se crea una lista de nodos
 */
  ArrayList<Character> letras =new ArrayList<>();//cadena ingresada
  ArrayList<Character> repetir =new ArrayList<>();//letras repedidas
  ArrayList<Nodolista> arreglo = new ArrayList<Nodolista>();
  Iterator<Nodolista> iterador = arreglo.iterator();
  ArrayList<Elemento> cadenas = new ArrayList<Elemento>();
 

    public void verificarcantidad(String original){
        reloj.iniciar();
        //個々
        String cadena = original.replace(" ", "個"); //eliminar espacios
        char [] Arraycadena ;
        char caracter;
        int contador =0;
        //map mapeo ordenando de la a a la z
        Map<Character, Integer> numChars = new HashMap<Character, Integer>();
        for (int i = 0; i < cadena.length(); ++i){
                 char charAt = cadena.charAt(i);
                 letras.add((char)cadena.charAt(i));
            if (!numChars.containsKey(charAt)){//si es nuevo el caracter
                 numChars.put(charAt, 1); //crea unnuevo contador
            }else{ //solo aumenta el contador
        numChars.put(charAt, numChars.get(charAt) + 1);
            }
       }//fin del for
       
        Iterator it = numChars.entrySet().iterator();//siver para extraer los caracteres
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            Nodoarbol nodito=new Nodoarbol((char)pair.getKey(),(int) pair.getValue(), null,null);
            arreglo.add(new Nodolista(nodito));
//            System.out.println(arreglo);
            repetir.add((char)pair.getKey());
            Collections.sort(arreglo); 
            
                    
            
        }
        System.out.println("Este ordena "+arreglo);
         // ordenar el arreglo

    }//fin del metodo
    
 
    public void continuar(){
        
//        System.out.println("El arreglo es: "+arreglo);
        for (int i = 0; i < arreglo.size(); i++) {
            if(arreglo.size()==1){
                reloj.parar();
                break;
            }
            if((i+1)<arreglo.size()){
                int F1=arreglo.get(i).getNodo().getF();
                int F2=arreglo.get(i+1).getNodo().getF();; 
//                System.out.println("Frecencia : "+ F1 + " CA: " + arreglo.get(i).getNodo().getC());
//                 System.out.println("Frecencia : "+ F2 + " CA: " + arreglo.get(i+1).getNodo().getC());
               //arbol es el nuevo arbol
               //raiz=total
                //HI=f1
                //HD=f2
                Nodoarbol x=new Nodoarbol(' ',(F1+F2), arreglo.get(i).getNodo(),arreglo.get(i+1).getNodo());
                arreglo.add(new Nodolista(x));
                
                
                
                arreglo.remove(i);
                arreglo.remove(i);
                Collections.sort(arreglo);
                System.out.println("Este "+arreglo);
                continuar();
            } 
        } 
        
    }
    
    public void imprimirArbol(){
        System.out.println("Grupo de letras: "+letras);
         arreglo.get(0).getNodo().Inordenaux(arreglo.get(0).getNodo(), 0);
         System.out.println("");
         System.out.println("prueba de encriptar ");
         arreglo.get(0).getNodo().Prueba(arreglo.get(0).getNodo());
//         Nodoarbol c = arreglo.get(0).getNodo().buscar('a', arreglo.get(0).getNodo());      
    }
    public void letras(ArrayList x){
        Iterator iter = x.iterator();
        while (iter.hasNext())
                System.out.print(iter.next()+" ");
        
    }
    public void impirmir(){
                for (int i = 0; i < cadenas.size(); i++) {
              
                    System.out.println("caracter: "+ cadenas.get(i).getX() +" Cadena: "+cadenas.get(i).getZ());
                       
                               
        }
        
    }
    public void recorridos(){

        for (int i = 0; i < repetir.size(); i++) {
        arreglo.get(0).getNodo().bus(repetir.get(i), arreglo.get(0).getNodo());
        System.out.println(arreglo.get(0).getNodo().getX());
        String sSubCadena=arreglo.get(0).getNodo().getX();
        
//        String sSubCadena = cadena.substring(1,cadena.length());//cadena eliminando el priemro 0
      
//        cadenas.add(new Elemento(repetir.get(i), sSubCadena));
       
        }
       
        
    }
    
}
