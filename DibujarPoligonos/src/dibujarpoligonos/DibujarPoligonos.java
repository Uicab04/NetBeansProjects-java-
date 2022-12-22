/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import javax.swing.JFrame;

public class DibujarPoligonos
{
// ejecuta la aplicación
    public static void main( String args[] )
    {
 // crea marco para objeto PoligonosJPanel
 JFrame marco = new JFrame( "Dibujo de poligonos" );
 marco.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 PoligonosJPanel poligonosJPanel = new PoligonosJPanel();
 marco.add( poligonosJPanel ); // agrega poligonosJPanel al marco
 marco.setSize( 280, 270 ); // establece el tamaño del marco
 marco.setVisible( true ); // muestra el marco
    } // fin de main
} // fin de la clase DibujarPoligonos