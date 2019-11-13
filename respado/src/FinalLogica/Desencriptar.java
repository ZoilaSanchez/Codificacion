/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalLogica;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import pruebasalgoritomoscom.CargarYLeerArchivos;

/**
 *
 * @author ferna
 */
public class Desencriptar {
    private String ruta1;
    private String ruta2;
    private ArrayList<ElementoAGuardar> datosAlmacenados = new ArrayList<ElementoAGuardar>();
    private String Adesencriptar;
    public Desencriptar(String path1, String path2){//path1 es del valor de las claves, path2 es el txt comprimido
        ruta1 = path1;
        ruta2 = path2;
        this.generarValoresClave();
    }
    public void generarValoresClave(){
       CargarYLeerArchivos guardos = new CargarYLeerArchivos(ruta1); 
       datosAlmacenados = guardos.leer();
    }
    public String jalarDatos() throws FileNotFoundException{
        String data = ""; 
        try { 
            data = new String(Files.readAllBytes(Paths.get(ruta2))); } 
        catch (IOException e) {
            e.printStackTrace(); }

        return data;
    }
    
}
