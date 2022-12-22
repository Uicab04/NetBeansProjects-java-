/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcoiris;

/**
 *
 * @author UICAB
 */
import javax.swing.JFrame;

public class PruebaDibujoArcoIris
{
    public static void main( String args[] )
    {
        Arcoiris panel = new Arcoiris();
        JFrame aplicacion = new JFrame();
        
        aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        aplicacion.add( panel );
        aplicacion.setSize( 400, 250 );
        aplicacion.setVisible( true );       
    }
}
