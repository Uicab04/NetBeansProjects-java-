/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoslider;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author uicab1
 */
public class PanelOvalo extends JPanel 
{
    
    private int diametro = 10; // diámetro predeterminado de 10
    private int posicionx = 10; // diámetro predeterminado de 10
 
  // dibuja un óvalo del diámetro especificado
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g );
       //LOS VALORES CONTROLA LA POSIION DE LA FIGURA EN EL PANEL
        g.fillOval( posicionx, 10, diametro, diametro ); // dibuja un círculo
    } // fin del método paintComponent
  
    // valida y establece el diámetro, después vuelve a pintar
    public void establecerDiametro( int nuevoDiametro )
    {
    // si el diámetro es inválido, usa el valor predeterminado de 10
    diametro = ( nuevoDiametro >= 0 ? nuevoDiametro : 10 );
    repaint(); // vuelve a pintar el panel
    } // fin del método establecerDiametro
    
    //nuevo posicion 2
        // valida y establece el diámetro, después vuelve a pintar
    public void establecerPosicion( int nuevaPosicion )
    {
    // si el diámetro es inválido, usa el valor predeterminado de 10
    posicionx = ( nuevaPosicion >= 0 ? nuevaPosicion : 10 );
    repaint(); // vuelve a pintar el panel
    } // fin del método establecerDiametro
    //nuevo posicion 2
  
    // lo utiliza el administrador de esquemas para determinar el tamaño preferido
    public Dimension getPreferredSize()
    {
    return new Dimension( 200, 200 );
    } // fin del método getPreferredSize
 
    // lo utiliza el administrador de esquemas para determinar el tamaño mínimo
    public Dimension getMinimumSize()
    {
    return getPreferredSize();
    } // fin del método getMinimumSize
     // fin de la clase PanelOvalo        
        
}
