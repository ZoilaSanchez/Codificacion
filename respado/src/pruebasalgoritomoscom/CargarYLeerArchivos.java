/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasalgoritomoscom;
import FinalLogica.ElementoAGuardar;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/**
 *
 * @author ferna
 */
public class CargarYLeerArchivos {
    private String ruta_archivo;
    private ArrayList<ElementoAGuardar> datos = new ArrayList<ElementoAGuardar>();
    public CargarYLeerArchivos(String ruta){
        this.ruta_archivo = ruta;
    }
    
    public void escribir(ArrayList<ElementoAGuardar> arreglo)
    {
        try {
            //Se crea un Stream para guardar archivo
            ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream( this.ruta_archivo ));
            //Se escribe el objeto en archivo
            file.writeObject(arreglo);
            //se cierra archivo
            file.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public ArrayList<ElementoAGuardar> leer()
    {
        try {
            //Stream para leer archivo
            ObjectInputStream file = new ObjectInputStream(new FileInputStream( this.ruta_archivo ));
            //Se lee el objeto de archivo y este debe convertirse al tipo de clase que corresponde
            datos = (ArrayList<ElementoAGuardar>) file.readObject();
            //se cierra archivo
            file.close();
            //Se utilizan metodos de la clase asi como variables guardados en el objeto 
        } catch (ClassNotFoundException ex) {
             System.out.println(ex);
        } catch (IOException ex) {
             System.out.println(ex);
       }
       return datos;
    }
}
