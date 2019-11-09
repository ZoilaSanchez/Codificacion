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
public class arbol {
    private Nodo raiz;
    private int valores;

    public Nodo getRaiz() {
        return raiz;
    }
   
    public arbol() {
       raiz=null;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }  

    public int getInsercion() {
        return insercion;
    }

    
    
    int insercion=0;
    public Nodo raiz(Nodo w,Nodo HI,Nodo HD,int f){
       if(w==null){
           Nodo a=new Nodo();
           a.setV(f);
           a.setHD(HD);
           a.setHI(HI);
           w=a;
       }
       return w;
   }
   public Nodo insertar(Nodo w,char cadena){
       if(w==null){
           Nodo a=new Nodo();

           a.setCadena(cadena);
           a.setHD(null);
           a.setHI(null);
           w=a;
           insercion++;
       }
       else{
           if(cadena=='0'){
               w.setHD(insertar(w.getHD(),cadena));
           }
           else if(cadena=='1'){
           w.setHI(insertar(w.getHI(),cadena));
       }     
       }
       return w;
   }
   
   public void ver (Nodo x){
       System.out.println("HI "+x.getHI());
        System.out.println("HD "+x.getHD());
   }
   public Nodo insert(Nodo w,int frecuencia){
       if(w==null){
           Nodo a=new Nodo();
           a.setV(frecuencia);
           a.setHD(null);
           a.setHI(null);
           w=a;
       }
       return w;
   }
public void esvacia(){
    if(raiz==null){
        System.out.println("Arbol vacio");
    }else{
         System.out.println("Arbol lleno");
    }
}
   public void raiz(){    
       
         if(raiz!=null){
             System.out.println("La raiz es: "+raiz.getV());
         }
         else{
              System.out.println("Esta vacia");
         }
   }
 
     public  void Preorden()
    {
        Preordenaux(raiz);
    }
     
    private void Preordenaux(Nodo nodo)
    {
        if(nodo == null){
        return;
        }
        System.out.print(nodo.getV() + " ");   
        Preordenaux(nodo.getHI());   
        Preordenaux(nodo.getHD());     
    }
    public  void Inorden()
    {
        Inordenaux(raiz);
    }
     
    public void Inordenaux( Nodo nodo)
    {
        if(nodo == null){
          
        return;
        }
        System.out.print(" frecuencia: "+nodo.getV()); 
        System.out.println(" caracter: "+nodo.getC());
//       System.out.println(" caracter: "+nodo.getC() + " frecencia: " + nodo.getV() + " binario "+nodo.getCadena());
        Inordenaux(nodo.getHI());
        Inordenaux(nodo.getHD());
    }

    public  void Posorden()
    {
        Posordenaux(raiz);       
    }
     
    private void Posordenaux(Nodo nodo)
    {
        if(nodo == null){
        return;
        }
        Posordenaux(nodo.getHI());
        Posordenaux(nodo.getHD());
        System.out.print(nodo.getV() + " ");
    }  

   
}
