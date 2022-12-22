/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;
import java.util.Scanner;
/**
 *
 * @author UICAB
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
 {
 Scanner entrada = new Scanner ( System.in );
 int numero1;
 int numero2;
 int suma;
 int numero3;
 int multiplicacion;
 
 System.out.print( "Escribir el primer entero; ");
 numero1 = entrada.nextInt();
 
 System.out.print( "Escribir el segundo entero; ");
 numero2 = entrada.nextInt();
 
 System.out.print( "Escribir el tercer entero; ");
 numero3 = entrada.nextInt();
 
 suma = numero1 + numero2;
 multiplicacion = suma * numero3; 
 
System.out.printf( "La suma es %d\n", suma );
System.out.printf( "La multiplicacion es %d\n", multiplicacion );
        // TODO code application logic here
    }
    
}
