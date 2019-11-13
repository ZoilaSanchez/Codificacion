/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasalgoritomoscom;

import FinalLogica.contador;
import java.io.FileNotFoundException;

/**
 *
 * @author Lopez
 */
public class Pruebasalgoritomoscom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Contadorpalabras contador= new Contadorpalabras();
        contador yosi = new contador();
        yosi.verificarcantidad("aaabbc");
        yosi.GuardarComprimido("HOla");
        //clase Contador es la clase de zoili que permitia ver cuantas frecuencias hay de cada letra
        //clase Huffman lee el array de frecuencias de simbolos y los pasa a 0 y 1 y crea un arreglo de este
        //clase CargarYLeerArchivos guarda como una clase el array obtenido de huffman y lo guarda en "data.das"
        //desde cargarYLeerArchivos podemos leer la clase que se a guardado hay una prueba ahi
        
      
//        contador1 contador=new contador1();
//        contador.verificarcantidad("acdbb");
//       
//        contador.continuar();
////         contador.letras();
//         System.out.println("");
//        contador.imprimirArbol();
//         contador.recorridos();
//        contador.impirmir();
    }
    
}
