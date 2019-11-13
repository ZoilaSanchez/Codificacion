/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalLogica;

import java.io.Serializable;

/**
 *
 * @author ferna
 */
public class ElementoAGuardar implements Serializable{
    private char simbolo;
    private String formaComprimida;

    public ElementoAGuardar(char simbolo, String formaComprimida) {
        this.simbolo = simbolo;
        this.formaComprimida = formaComprimida;
    }

    public String getFormaComprimida() {
        return formaComprimida;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    public void setFormaComprimida(String formaComprimida) {
        this.formaComprimida = formaComprimida;
    }

    public char getSimbolo() {
        return simbolo;
    }
    
}
