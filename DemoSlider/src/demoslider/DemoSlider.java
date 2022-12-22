/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoslider;

import javax.swing.JFrame;
/**
 *
 * @author uicab1
 */
public class DemoSlider {

    /**
     * @param args the command line arguments
     */

  
    public static void main(String[] args) 
    {
        // TODO code application logic here

        MarcoSlider marcoSlider = new MarcoSlider(); 
        marcoSlider.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoSlider.setSize( 220, 270 ); // establece el tamaño del marco
        marcoSlider.setVisible( true ); // muestra el marco
        
     
    } // fin de main
} // fin de la clase DemoSlider
    
    

