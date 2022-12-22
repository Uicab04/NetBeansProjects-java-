/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasificacion;
import java.util.Scanner;
/**
 *
 * @author uicab1
 */
public class Clasificacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        int x;
        String entrada;
   
       
       Scanner leerDatos = new Scanner (System.in);
       System.out.println("Capturar entrada:");
       entrada = leerDatos.nextLine();
    for (x=0;x<entrada.length();x++){
        if (entrada.matches("(*.*)uicab(*.*)")) {
        System.out.println("SI");
    } else {
         System.out.println("NO");                                                                                
    }
   
        }
         
                 
    }

        
      
           
           
        
        
    
        
        
        
}
    

