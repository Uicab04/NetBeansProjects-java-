/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicat3;

/**
 *
 * @author uicab1
 */
public class Nodo {
    public int dato;
    public Nodo siguiente;//puntero del enlace
    //constructor para insertar al Final
    public Nodo(int d){
        this.dato=d;
    }
    //contructor para incertar inicio
    public Nodo(int d, Nodo n) {
        dato=d;
        siguiente=n;
    }
}
