/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasalgoritomoscom;

import FinalLogica.contador;
import java.io.FileNotFoundException;
import txt.Menú;

/**
 *
 * @author Lopez
 */
public class Pruebasalgoritomoscom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
       
        Menú x=new Menú();
        x.setVisible(true);
        contador yosi = new contador();
        yosi.verificarcantidad("Prohibido");
        yosi.GuardarComprimido();
        yosi.txt();
        yosi.enviar_generadortxt();
        
        //clase Contador es la clase de zoili que permitia ver cuantas frecuencias hay de cada letra
        //clase Huffman lee el array de frecuencias de simbolos y los pasa a 0 y 1 y crea un arreglo de este
        //clase CargarYLeerArchivos guarda como una clase el array obtenido de huffman y lo guarda en "data.das"
        //desde cargarYLeerArchivos podemos leer la clase que se a guardado hay una prueba ahi
        
        
            
        
        
    }
    
}
