/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicafactorialrecursivo;

/**
 *
 * @author Rody A
 */
public class PracticaFactorialRecursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PracticaFactorialRecursivo numerofactorial = new PracticaFactorialRecursivo();
       System.out.println("El factorial denumero es: "+numerofactorial.factorialrecursivo(9));
    }
    public int factorialrecursivo (int n) {
        if (n<0){
            return 0;
        }else{
            //Caso base
            if (n==0){
                return 1;
                // (probelma) 5*4*3*2*1
            }else {
                return n * factorialrecursivo (n-1);
            }
        }
    }
}
