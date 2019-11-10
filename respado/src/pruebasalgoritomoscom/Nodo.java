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
public class Nodo implements Comparable<Nodo> {
      private Nodo HD,HI;
    private int v;
    private char c;
    private char cadena;

    public Nodo( int v, char c,char cadena) {
        this.v = v;
        this.c = c;
        this.cadena=cadena;
    }

    public char getCadena() {
        return cadena;
    }

    public void setCadena(char cadena) {
        this.cadena = cadena;
    }

    Nodo() {
        //To change body of generated methods, choose Tools | Templates.
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

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

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }
    @Override
	public String toString() {
		return this.getC()+ "  -  " + this.getV();
	}
        @Override
     public int compareTo(Nodo o) {
        String a=new String(String.valueOf(this.getV())+this.getV());
        String b=new String(String.valueOf(o.getV())+o.getC());
        return a.compareTo(b);
    }
}
