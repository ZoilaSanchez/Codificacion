/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalLogica;


import pruebasalgoritomoscom.*;
import Arbol.Nodoarbol;
import Arbol.Nodolista;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JFileChooser;

/**
 *
 * @author Lopez
 */
public class contador {
  cronometro reloj=new cronometro();
  
  /**
 *se crea una lista de nodos
 */
  ArrayList<Character> letras =new ArrayList<>();//cadena ingresada
  ArrayList<Character> repetir =new ArrayList<>();//letras repedidas
  ArrayList<Nodolista> arreglo = new ArrayList<Nodolista>();//este tiene frecuencias y simbolos
  Iterator<Nodolista> iterador = arreglo.iterator();
  ArrayList<Elemento> cadenas = new ArrayList<Elemento>();
    private String or;//Esto nos va a servir para cuando querramos comprimir
    ArrayList<ElementoAGuardar> misDatos;

     ArrayList<ElementoAGuardar> dat ;
    public void verificarcantidad(String original){
        or = original;
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
        char [] valores = new char[arreglo.size()];
        int [] frecuencia = new int[arreglo.size()];
        for(int i = 0; i < arreglo.size(); i++){
            valores[i] = arreglo.get(i).getNodo().getC();
            frecuencia[i] = arreglo.get(i).getNodo().getF();
        }
        Huffman guardo = new Huffman();
        
        guardo.Convertir(valores, frecuencia);
        misDatos = guardo.getArreglo();
       
        CargarYLeerArchivos guardos = new CargarYLeerArchivos("data.das");
        guardos.escribir(misDatos);
        
       dat = guardos.leer();
        System.out.println("Simbolo " + dat.get(2).getFormaComprimida());
        
        //System.out.println("Plox " + misDatos.get(2).getFormaComprimida());
         // ordenar el arreglo

    }//fin del metodo
    
    public void GuardarComprimido(String ruta) throws FileNotFoundException{
        //RandomAccessFile guardar = new RandomAccessFile(ruta+".fer", "rw");
        String cadenaRLE = "";//Ya que si no nos deja concatenar al principio
        for(int i = 0; i < or.length(); i++){ //recorro cada letra   
            for(int j = 0; j < misDatos.size(); j ++){//comparo para obtener los valores en 0 y 1
                if(or.charAt(i) == misDatos.get(j).getSimbolo()){
                    cadenaRLE = cadenaRLE + misDatos.get(j).getFormaComprimida();
                }
            }
        }
        System.out.println("Cadena a guardar " + cadenaRLE);
        ArrayList<String> parts = new ArrayList<String>();//Aqui hare la compresion
        int len = cadenaRLE.length();
        for (int i=0; i<len; i+=8)
        {//Voy seperandolo en substrings                   en cantidades de 8 bits
            parts.add(cadenaRLE.substring(i, Math.min(len, i + 8)));
        }
        //System.out.println("El arreglo es " + parts);
        ArrayList<Integer> cadenaAsciiNumero = new ArrayList<Integer>();
        for(int i = 0; i < parts.size(); i++){
            cadenaAsciiNumero.add(Integer.parseInt(parts.get(i), 2));//Convierto de base 2 a entero
        }
        System.out.println(cadenaAsciiNumero);
        String textoGuardo = "";
        for(int i = 0; i < cadenaAsciiNumero.size(); i++){
            char ch = (char) cadenaAsciiNumero.get(i).intValue();
            textoGuardo = textoGuardo + ch;
            System.out.println(ch);
        }
        System.out.println("tEXTO a guardar " + textoGuardo);
    }
     Huffman c;
     
     
}
