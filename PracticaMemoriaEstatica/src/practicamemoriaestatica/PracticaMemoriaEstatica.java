4/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamemoriaestatica;

/**
 *
 * @author uicab1
 */
import java.util.Arrays;
import javax.swing.JOptionPane;
public class PracticaMemoriaEstatica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeros[] = new int[5];
        int numerotes[] = new int[numeros.length];
        String palabras[]= new String[5];
        int i;
        for (i=0;i<5;i++) {
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog
            (null,"Ingresa los elementos del índice " + i));
        }
        //dTOS COMO LOS INGRESADOS
        System.out.println("Los datos sin ordenados son:");
        for (i=0;i<5;i++){
            System.out.print("[" + numeros[i] + "]");
        }
        System.out.println("\nLos datos ordenados son:");
        Arrays.sort(numeros); //aqui ordenamos los numeros
        for(i=0;i<5;i++){
            System.out.print("[" + numeros[i] + "]");
        }
        
        //rellenando al arreglo palabras 
        Arrays.fill(palabras, "Bienvenido a la fiesta");
        System.out.println("Elementos del arreglo del arreglo palabra");
        for(i=0;i<5;i++){
            System.out.print("[" + palabras[i] + "]");
        }
        
        //Copiando los elementos del arreglo numeros a numerotes
        System.arraycopy(numeros, 0, numerotes, 0, numeros.length);
        System.out.println("Elementos del arreglo numerotes");
        for(i=0;i<5;i++){
            System.out.print("[" + numerotes[i] + "]");
        }               
    }
    
}
