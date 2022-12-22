/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librocalificaciones;

/**
 *
 * @author UICAB
 */
public class LibroCalificaciones
        
{
    private String nombreDelCurso;
    private int calificaciones[][];   

    public LibroCalificaciones( String nombre, int arregloCalif[][] )
    {
        nombreDelCurso = nombre;
        calificaciones = arregloCalif;
    }
    
    public void establecerNombreDelCurso( String nombre )
    {
        nombreDelCurso = nombre;
    }
    
    public String obtenerNombreDelCurso()
    {
        return nombreDelCurso;
    }
    
    public void mostrarMensaje()
    {
        System.out.printf( "Bienvenido al libro de calificaciones para\n%s!\n\n",
           obtenerNombreDelCurso() );
    }
    
    public void procesarCalificaciones()
    {
    
        imprimirCalificaciones();   
    
        System.out.printf( "\n%s $d\n%s %d\n\n ", "La calificación mas baja en el libro de calificaciones es", obtenerMinima(), "La calificación mas alta en el libro de calificaciones es", obtenerMinima() );
    
        imprimirGraficoBarras();
    }

    public int obtenerMinima()
    {
        int califBaja = calificaciones [ 0 ][ 0 ];
    
        for ( int califEstudiantes[] : calificaciones )
        {
            for( int calificacion : califEstudiantes )
            {           
                if ( calificacion < califBaja )
                    califBaja = calificacion;
                
            }
        }    
    
    return califBaja;
    }

    public int obtenerMaxima()
    {    
        int califAlta = calificaciones [ 0 ][ 0 ];
    
    
        for ( int califEstudiantes[] : calificaciones )    
        {
        
        
            for( int calificacion : califEstudiantes )       
            {           
                if ( calificacion > califAlta )
                califAlta = calificacion;
                
            }
        }
    
    return califAlta;
    }

//uicabnahuat


    public double obtenerPromedio( int conjuntoDeCalif[] )
    {
        int total = 0;
        
        for ( int calificacion : conjuntoDeCalif )
            total += calificacion;
    
    return (double) total / conjuntoDeCalif.length;
}

public void imprimirGraficoBarras()
{
    System.out.println( "Distribucion de calificaciones en general:" );
    
    int frecuencia[] = new int[ 11 ];
    for ( int califEstudiantes[] : calificaciones )
    {
        for ( int calificacion : califEstudiantes )
            ++frecuencia[ calificacion /10 ];
    }
    
    for ( int cuenta = 0; cuenta < frecuencia.length; cuenta++ )
    {
        if ( cuenta == 10 )
            System.out.printf ("%5d: ", 100 );
        else
            System.out.printf ("%02d-%02d: ",
                    cuenta * 10, cuenta * 10 + 9 );
        for ( int estrellas = 0; estrellas < frecuencia[ cuenta ]; estrellas++ )
            System.out.print( "*");
        System.out.println();
        
    }
}

public void imprimirCalificaciones()
{
    System.out.println( "las calififcaciones son:\n" );
    System.out.print( "               ");
    
    for ( int prueva = 0; prueva < calificaciones[ 0 ].length; prueva++ )
        System.out.printf( "prueva %d ", prueva + 1 );
    System.out.println ( "promedio" );
    
    for ( int estudiante = 0; estudiante < calificaciones.length; estudiante++ )
    {
        System.out.printf( "Estudiante %d", estudiante + 1);
        for ( int prueva : calificaciones[ estudiante ] )
            System.out.printf( "%8d", prueva );
        
        double promedio = obtenerPromedio ( calificaciones[ estudiante ] );
        System.out.printf( "%9.2f\n", promedio );
    }   
  }
}


