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
public class arbol {
    private Nodo raiz;

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }  
   public Nodo insertar(Nodo w,int v){
       if(w==null){
           Nodo a=new Nodo();
           a.setFrecu(v);
           a.setHD(null);
           a.setHI(null);
           w=a;
       }
       else{
           if(v>=w.getFrecu()){
               w.setHD(insertar(w.getHD(),v));
           }
           else if(v<w.getFrecu()){
           w.setHI(insertar(w.getHI(),v));
       }     
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
             System.out.println("La raiz es: "+raiz.getFrecu());
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
        System.out.print(nodo.getFrecu() + " ");   
        Preordenaux(nodo.getHI());   
        Preordenaux(nodo.getHD());     
    }
    public  void Inorden()
    {
        Inordenaux(raiz);
    }
     
    private void Inordenaux( Nodo nodo)
    {
        if(nodo == null){
        return;
        }
        Inordenaux(nodo.getHI());
        System.out.print(nodo.getFrecu() + " ");
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
        System.out.print(nodo.getFrecu() + " ");
    }    
}
