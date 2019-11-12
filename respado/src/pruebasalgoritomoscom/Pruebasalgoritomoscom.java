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
public class Pruebasalgoritomoscom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contadorpalabras contador= new Contadorpalabras();
//        contador1 contador=new contador1();
        contador.verificarcantidad("acdbb");
       
        contador.continuar();
//         contador.letras();
         System.out.println("");
        contador.imprimirArbol();
         contador.recorridos();
        contador.impirmir();
    }
    
}
