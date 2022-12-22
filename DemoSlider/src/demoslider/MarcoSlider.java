/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoslider;
// Fig. 22.3: MarcoSlider.java
// Uso de objetos JSlider para cambiar el tamaño de un óvalo.
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

/**
 *
 * @author uicab1
 */
public class MarcoSlider extends JFrame  
{
    private JSlider diametroJSlider; // control deslizable para seleccionar el diámetro
    private PanelOvalo miPanel;
    private JSlider posicionJSlider2;
 
    // constructor sin argumentos
    public MarcoSlider() 
    {
        super( "Demostracion de JSlider" );
  
        miPanel = new PanelOvalo(); // crea panel para dibujar el círculo
        miPanel.setBackground( Color.BLUE ); // establece el color de fondo en amarillo
 
        // establece objeto JSlider para controlar el valor del diámetro
        diametroJSlider = new JSlider( SwingConstants.HORIZONTAL, 0, 200, 10 );
        diametroJSlider.setMajorTickSpacing( 10 ); // crea una marca cada 10
        diametroJSlider.setPaintTicks( true ); // dibuja las marcas en el control deslizable
        
        
        //nuevo posicion 2
        posicionJSlider2 = new JSlider( SwingConstants.HORIZONTAL, 0, 200, 10 );
        posicionJSlider2.setMajorTickSpacing( 10 ); // crea una marca cada 10
        posicionJSlider2.setPaintTicks( true ); 
        //nuevo posicion 2
        
        // registra el componente que escucha los eventos del objeto JSlider
        diametroJSlider.addChangeListener(

            new ChangeListener() // clase interna anónima
            { 
                // maneja el cambio en el valor del control deslizable
                public void stateChanged( ChangeEvent e )
                {
                    miPanel.establecerDiametro( diametroJSlider.getValue() );
                } // fin del método stateChanged
            } // fin de la clase interna anónima
        ); // fin de la llamada a addChangeListener
        
        
         //nuevo posicion 2
        // registra el componente que escucha los eventos del objeto JSlider
        posicionJSlider2.addChangeListener(

            new ChangeListener() // clase interna anónima
            { 
                // maneja el cambio en el valor del control deslizable
                public void stateChanged( ChangeEvent e )
                {
                    miPanel.establecerPosicion( posicionJSlider2.getValue() );
                } // fin del método stateChanged
            } // fin de la clase interna anónima
        ); // fin de la llamada a addChangeListener
         //nuevo posicion 2
     

        
        add( diametroJSlider, BorderLayout.SOUTH ); // agrega el control deslizable al marco
        add( miPanel, BorderLayout.CENTER ); // agrega el panel al marco
        
        //nuevo posicion 2
        add( posicionJSlider2, BorderLayout.NORTH ); // agrega el control deslizable al marco
        add( miPanel, BorderLayout.CENTER ); // agrega el panel al marco  
        //nuevo posicion 2
        
       } // fin del constructor de MarcoSlider
    } // fin de la clase MarcoSlider













    

