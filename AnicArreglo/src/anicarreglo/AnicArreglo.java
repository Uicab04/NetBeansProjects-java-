/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anicarreglo;

/**
 *
 * @author UICAB
 */
public class AnicArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       int arreglo[];
       arreglo = new int[ 10 ];
       System.out.printf("%s%8s\n", "indice", "valor" );
       for ( int contador = 0; contador < arreglo.length; contador++ )
           System.out.printf( "%5d%8d\n", contador, arreglo[ contador ] );
    }
    
}
