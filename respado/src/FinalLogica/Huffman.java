/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalLogica;
import java.util.PriorityQueue; 
import java.util.Scanner; 
import java.util.Comparator; 
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import pruebasalgoritomoscom.Generartxt;

class HuffmanNode { 
    int data; 
    char c; 
  
    HuffmanNode left; 
    HuffmanNode right; 
} 

class MyComparator implements Comparator<HuffmanNode> { 
    public int compare(HuffmanNode x, HuffmanNode y) 
    { 
  
        return x.data - y.data; 
    } 
} 
  
public class Huffman { 
    private ArrayList<ElementoAGuardar> arreglo = new ArrayList<ElementoAGuardar>();

    public  ArrayList<ElementoAGuardar> getArreglo() 
    { 
        return arreglo;
    } 
    String pdf="";

    public String getPdf() {
        return pdf;
    }
    
    public void printCode(HuffmanNode root, String s) {

        if (root.left == null&& root.right== null&& Character.isLetter(root.c)) {
            
            // aqui se colcoan los valores con sus signifcados
            
            //generar ppdf
           
            pdf="";
            pdf+="\t"+root.c +"\t"+" : "+"\t"+s + " ";
            
            System.out.println(pdf);
            
            ElementoAGuardar guardo = new ElementoAGuardar(root.c, s);
            arreglo.add(guardo);
            return;
        }

        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    } 
    
    //generar txt
    Generartxt x=new Generartxt();
   
    public void generartxt(JFileChooser sel){
       if(sel.showDialog(null,"Guardar")==JFileChooser.APPROVE_OPTION){
           x.setArchivo(sel.getSelectedFile());
           if(x.getArchivo().getName().endsWith("txt")){
               String documento=pdf;//mostrar
                String mensaje=x.guardar(x.getArchivo(), documento);
                if(mensaje!=null){
                    JOptionPane.showMessageDialog(null,mensaje);
                }
           }
       }
        
    }  
    
    
    // main function 
    public void Convertir(char charArray [], int charfreq[] ) 
    { 
  
        Scanner s = new Scanner(System.in); 
  
        // number of characters. 
//        int n = 6; 
//        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' }; 
//        int[] charfreq = { 5, 9, 12, 13, 16, 45 }; 
        int n = charArray.length;

        PriorityQueue<HuffmanNode> q 
            = new PriorityQueue<HuffmanNode>(n, new MyComparator()); 
  
        for (int i = 0; i < n; i++) { 
  

            HuffmanNode hn = new HuffmanNode(); 
  
            hn.c = charArray[i]; 
            hn.data = charfreq[i]; 
  
            hn.left = null; 
            hn.right = null; 

            q.add(hn); 
        } 
  
        // create a root node 
        HuffmanNode root = null; 

        while (q.size() > 1) { 
 
            HuffmanNode x = q.peek(); 
            q.poll(); 
            HuffmanNode y = q.peek(); 
            q.poll(); 
  
            HuffmanNode f = new HuffmanNode(); 

            f.data = x.data + y.data; 
            f.c = '-'; 
            f.left = x; 
            f.right = y; 
            root = f; 
            q.add(f); 
        } 
        printCode(root, ""); ;
    } 
} 
  
