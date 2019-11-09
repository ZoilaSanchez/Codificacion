/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3estructuras;

/**
 *
 * @author Estefany
 */
public class Nodo {
    
    private Nodo HD,HI;
    private int frecu;
    private char caracter;
    private Elemento nuevo;

   

    public Nodo getHD() {
        return HD;
    }

    public void setHD(Nodo HD) {
        this.HD = HD;
    }

    public Nodo getHI() {
        return HI;
    }

    public void setHI(Nodo HI) {
        this.HI = HI;
    }

    public int getFrecu() {
        return frecu;
    }

    public void setFrecu(int frecu) {
        this.frecu = frecu;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public Elemento getNuevo() {
        return nuevo;
    }

    public void setNuevo(Elemento nuevo) {
        this.nuevo = nuevo;
    }

    
}
