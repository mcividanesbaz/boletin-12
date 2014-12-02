
package boletin.pkg12;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;


public class Garaxe {
   int numeroCoches;
   final int plazas=5;
   String matricula;
   double prezo;
   double cartosRecibidos;
   double cartosDevoltos;
   double tempo;
   Calendar entrada,salida=Calendar.getInstance();
   public Garaxe(){}
   
   public void podoAparcar(){
      numeroCoches = (int) (Math.random()*5+1);
       if(numeroCoches<plazas){
       JOptionPane.showMessageDialog(null,"plazas disponibles"+(plazas-numeroCoches));    
       entrada= Calendar.getInstance();

      matricula= JOptionPane.showInputDialog("introduzca la matricula");

       salida= Calendar.getInstance();
        JOptionPane.showMessageDialog(null,"acepta para sacar el coche");
        
       tempo=(salida.getTimeInMillis()-entrada.getTimeInMillis())/1000;
       
      if(tempo<3){
      prezo=0;
      }else if(tempo==3){
      prezo=0.40;
      }else{
       prezo=(0.40+((0.20/3)*tempo));      
      }  
      JOptionPane.showMessageDialog(null,"el precio a pagar es"+prezo);
     do{  
     String entregado= JOptionPane.showInputDialog("introduzca: "+prezo+" euros");
     cartosRecibidos= Double.parseDouble(entregado);
      if(cartosRecibidos<prezo){
        JOptionPane.showMessageDialog(null,"te faltan: "+(prezo-cartosRecibidos)+"euros");
      }else if(cartosRecibidos>prezo){
          cartosDevoltos=cartosRecibidos-prezo;
         JOptionPane.showMessageDialog(null,"su vuelta es: "+cartosDevoltos+"euros");
     }else
          JOptionPane.showMessageDialog(null,"correcto");
     } while(cartosRecibidos<prezo);    
            JOptionPane.showMessageDialog(null,"FACTURA \n MATRICULA COCHE: "+matricula+"\n TIEMPO: "+tempo+"\n PRECIO: "+prezo+"\n CARTOS RECIBIDOS: "+cartosRecibidos+"\n CARTOS DEVOLTOS: "+cartosDevoltos+"\n \n GRACIAS POR USAR NUESTRO APARCAMIENTO ");

     }else
            JOptionPane.showMessageDialog(null,"EL GARAGE ESTA COMPLETO \n Gracias por su visita");
    
               }   
          
  
   }


      
     
     



    


