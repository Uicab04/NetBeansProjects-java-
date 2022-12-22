/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicat3;
import javax.swing.JOptionPane;
/**
 *
 * @author uicab1
 */
public class PracticaT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Lista listita=new Lista();
        int opcion=0, el;
        do {
            try{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. agregar un elemento al inicio de la Lista\n2 Mostrar los datos de la lista\n"
                                + "3.Salir","Menu de opciones",3));
                switch(opcion){
                    case 1:
                        try{
                            el=Integer.parseInt(JOptionPane.showInputDialog(null,"Igresa el Elemento:",
                                     "Insertado al Inicio",3));
                            listita.agregarAlInicio(el);
                        }catch(NumberFormatException n){
                           JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
                        }
                        break;
                    case 2:
                        listita.mostrarLista();
                        break;
                    case 3:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorecta ");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
            }
        }while(opcion!=3);
    }
    
}
