/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3estructuras;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Lopez
 */
public class Contadorpalabras {
  ArrayList<Elemento> arreglo = new ArrayList<Elemento>();
  ArrayList<Nodo> arbol = new ArrayList<Nodo>();
  Iterator<Elemento> iterador = arreglo.iterator();
    
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
//            System.out.println("Ver el caracter: "+pair.getKey() );
//            System.out.println( " Ver la frecuencia= " + pair.getValue());
            arreglo.add(new Elemento((char)pair.getKey(),(int) pair.getValue()));
            it.remove();
            
        }
          Collections.sort(arreglo);//ordenar el arreglo
//        mostrar();
        mo();
      
    }//fin del metodo
    int cont=1;
    public void mo(){
        iterador = arreglo.iterator();
        for (int i = 0; i < arreglo.size(); i++) {
            Elemento elementoss = iterador.next();
            if(cont==2){
                    int suma=arreglo.get(i-1).getFrecuencia()+arreglo.get(i).getFrecuencia();
                    System.out.println("La suma e : "+suma + " pri "+ arreglo.get(i-1).getFrecuencia()+" seg "+ arreglo.get(i).getFrecuencia());
                 
                    
                    cont=0;
            }else{
                System.out.println("s "+i + " cont "+ cont);
                cont++;
            }
                   
            
            
        }
    }
    
    public void mostrar(){
        iterador = arreglo.iterator();
        while(iterador.hasNext()){
	Elemento elementoss = iterador.next();
	System.out.println(elementoss.getCaracter() + " --> "+ elementoss.getFrecuencia());
        int suma= elementoss.getFrecuencia()+elementoss.getFrecuencia();
        
        
        }
    }
    
    
   
    
    
   
    
    
   
    
    
}
