/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicarreglo;

/**
 *
 * @author UICAB
 */
public class InicArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int arreglo1[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        int arreglo2[][] = { { 1, 2 }, { 3 }, { 4, 5, 6 } };
        
        System.out.println( "Los valores en arreglo1 por filas son" );
        imprimirArreglo( arreglo1 );
        
        System.out.println( "\nLos valores en arreglo2 por filas son" );
        imprimirArreglo( arreglo2 );
        // TODO code application logic here
    }
    
    public static void imprimirArreglo( int arreglo[][] )
    {
        for ( int fila = 0; fila < arreglo.length; fila++ )
        {
            for ( int columna = 0; columna < arreglo[ fila ].length; columna++ )
                System.out.printf( "%d ", arreglo[ fila ][ columna ] );
            
            System.out.println();
        }
    }
    
}
