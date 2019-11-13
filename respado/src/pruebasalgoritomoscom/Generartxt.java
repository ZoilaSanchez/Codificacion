/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasalgoritomoscom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Lopez
 */
public class Generartxt {
    File archivo;
    FileOutputStream salida;
    FileInputStream entrada;
    
   
    public String abrir(File archivo){
        String mensaje=null;
        try {
            entrada=new FileInputStream(archivo);
            int asccii;
            
            while ((asccii=entrada.read())!=-1) {                
                char caracter=(char) asccii;
               mensaje+=caracter;
            }
        } catch (Exception e) {
        }
       return mensaje;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setSalida(FileOutputStream salida) {
        this.salida = salida;
    }

    public void setEntrada(FileInputStream entrada) {
        this.entrada = entrada;
    }

    public File getArchivo() {
        return archivo;
    }

    public FileOutputStream getSalida() {
        return salida;
    }

    public FileInputStream getEntrada() {
        return entrada;
    }
    public String guardar(File archivo,String documento){
        String mensaje="";
        try {
            salida=new FileOutputStream(archivo);
            byte[] texto= documento.getBytes();
            salida.write(texto);
            mensaje="Guardado";
            
        } catch (Exception e) {
        }
        return mensaje;
    }
}
