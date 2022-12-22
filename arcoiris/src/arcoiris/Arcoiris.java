/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arcoiris;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Arcoiris extends JPanel
{
    final Color VIOLETA = new Color( 128, 0, 128 );
    final Color INDIGO = new Color( 75, 0, 130 );
    
    private Color colores[] =
       { Color.WHITE, Color.WHITE, VIOLETA, INDIGO, Color.BLUE, 
         Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED };
    
    public void DibujoArcoIris()
    {
        setBackground( Color.WHITE );
    }
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g );
        
        int radio = 10;
        
        int centroX = getWidth() / 2;
        int centroY = getHeight() - 10;
        
        for ( int contador = colores.length; contador > 0; contador-- )
        {
            g.setColor( colores[ contador - 1 ] );
            
            g.fillArc( centroX - contador * radio,
                centroY - contador * radio,
                contador * radio * 2, contador * radio * 2, 0, 180);
        }
    }
}