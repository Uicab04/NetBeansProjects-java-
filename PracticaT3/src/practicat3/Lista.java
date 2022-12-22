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
public class Lista {
    protected Nodo inicio, fin; //punteros para saber cual es el inicio y fin
    public Lista(){
        inicio=null;
        fin= null;
    }
    //metodo para agregar un nodo al inicio de la lista
    public void agregarAlInicio(int elemento){
        //creando al nodo
        inicio=new Nodo(elemento, inicio);
        if(fin==null){
            fin=inicio;
        }
    }
    //metodo para mostrar lso datos
    public void mostrarLista(){
        Nodo recorrer=inicio;
        System.out.println("");
        while(recorrer!=null){
            System.out.print("["+recorrer.dato+"]--->");
            recorrer=recorrer.siguiente;  
        }
    }
}
