/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostracionfile;

/**
 *
 * @author uicab1
 */
import java.util.Scanner; 
public class PruebaDemostracionFile 
{ 
public static void main( String args[] ) 
{ 
Scanner entrada = new Scanner( System.in ); 
DemostracionFile aplicacion = new DemostracionFile(); 
System.out.print( "Escriba aqui el nombre del archivo o directorio: " ); 
aplicacion.analizarRuta( entrada.nextLine() ); 

}   
}
