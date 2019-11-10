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
public class cronometro {
  private  int mili=0;
  private  int seg=0;
  private  int min=0;
  private  int hor=0;
  private  boolean estado=true;
    
    public void parar(){
        estado=false;
    }
    public void reiniciar(){
        estado=true;
         mili=0;
         seg=0;
         min=0;
         hor=0;
        
    }
    public void iniciar(){
        estado=true;
        Thread hilo=new Thread(){
           public void inici(){
             for(;;){//no deje de imprimir  significan los ;;
                 if(estado==true){
                     try {
                         sleep(1); //corra cada segundo
                         if(mili>=1000){
                             mili=0;
                             seg++;
                         }
                         if(seg>=60){
                             mili=0;
                             seg=0;
                             min++;
                         }
                         if(min>=60){
                             mili=0;
                             seg=0;
                             min=0;
                             hor++;
                         }
                         
                         System.out.println(" HOra "+ hor+" min "+ min+" seg "+seg +" mili "+ mili);
                         mili++;
                     } catch (Exception e) {
                     }
                 }else{
                       break;      
                 }
                            
                 }
                      
             } 
             
        };
        hilo.start();
    }
}
