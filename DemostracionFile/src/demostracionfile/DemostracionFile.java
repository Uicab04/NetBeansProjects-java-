/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//le vamos a poner la ruta de cualquier archivo en la lap y nos dara los datos de ese archivo
package demostracionfile;

import java.io.File; 

public class DemostracionFile 
{ 
    public void analizarRuta( String ruta ) 
    { 
        File nombre = new File( ruta ); 
        if ( nombre.exists() ) // si existe el nombre, muestra información sobre él 
        { 
            System.out.printf( 
                "%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s", 
                nombre.getName(), " existe", 
                ( nombre.isFile() ? "es un archivo" : "no es un archivo" ), 
                ( nombre.isDirectory() ? "es un directorio" :  
                "no es un directorio" ), 
                ( nombre.isAbsolute() ? "es ruta absoluta" :  
                "no es ruta absoluta" ), "Ultima modiﬁcacion: ", 
                nombre.lastModified(), "Tamanio: ", nombre.length(),  
                "Ruta: ", nombre.getPath(), "Ruta absoluta: ", 
                nombre.getAbsolutePath(), "Padre: ", nombre.getParent() ); 
           
            if ( nombre.isDirectory() ) 
            { 
                String directorio[] = nombre.list();
                System.out.println( "\n\nContenido del directorio:\n" ); 
                
                for ( String nombreDirectorio : directorio ) 
                 System.out.printf( "%s\n", nombreDirectorio ); 
            } 
        } 
        { 
        System.out.printf( "%s %s", ruta, "no existe." ); 
        } 
    }
} 


