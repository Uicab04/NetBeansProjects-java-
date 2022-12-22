/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaarreglo;

/**
 *
 * @author UICAB
 */
public class SumaArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int arreglo[] = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        int total = 0;
        
    //mientras que contador empieza con sero se suma al total y pasa sumando el tortal con el sigiente digito asignado a contador que es 1
    //por lo tanto 0+1 que es lo mismo que sumemos 87+68 y asi con cada numero dentro del arreglo
        for ( int contador = 0; contador <arreglo.length; contador++ )
            total += arreglo[ contador ];
        System.out.printf( "total de los elementos del arreglo: %d\n", total );
        // TODO code application logic here
    }
    
}
