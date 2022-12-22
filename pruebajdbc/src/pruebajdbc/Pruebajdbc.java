/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebajdbc;

import java.sql.Statement;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author uicab1
 */
public class Pruebajdbc {

    /**
     * @param args the command line arguments
     */
    String user = "Admin";
    String password = "manu";
    String url = "jdbc:mysql://localhost:3306/esquema_practica1";
    String driver = "com.mysql.cj.jdbc.Driver";
    Statement sx;
    Connection cx;
    
    public Connection conectar() throws SQLException{
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion exitosa");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pruebajdbc.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se puede conectar");
        }
        
        return cx;
    }
    
    public void desconectar(){
        try {
            cx.close();
        } catch (SQLException ex) {
            Logger.getLogger(Pruebajdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
    }           
    //invocar las funciones de concexion
    public static void main(String[] args) {
        // TODO code application logic here
        //llamar los metodos que isimos
        Pruebajdbc conexion = new Pruebajdbc();
        try {
            conexion.conectar();
            //cuando se ejecute el primero que es conexion.conectar() que hace la concexion
            //despues ara la consulta siguiente:
            conexion.consultaSucursal();
            //llamar la otra cosulta donde actualiza la base de datos
            conexion.actualizarStatusPersonal(0,3);
            
        } catch (SQLException ex) {
            Logger.getLogger(Pruebajdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void consultaSucursal(){
        try {
            Statement st = cx.createStatement();
            ResultSet rs = st.executeQuery("SELECT nombre_sucursal, direccion, colonia FROM tc_sucursal WHERE id_sucursal=5");
            String []datos = new String[3];
            
            //recorrer la variable rs que es donde se almacena la consulta
            while(rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
            }
            
            System.out.println("El nombre de la sucursal es "+datos[0]);
            System.out.println("La direccion es "+datos[1]);
            System.out.println("La colonia es "+datos[2]);
                    
        } catch (SQLException ex) {
            Logger.getLogger(Pruebajdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public void actualizarStatusPersonal(int status, int idPersona){
        try {
            Statement st = cx.createStatement();
            st.executeUpdate("UPDATE tc_personal SET activo="+status+" WHERE id_persona="+idPersona);
            System.out.println("El estatus de la persona con id "+idPersona+" cambio a "+status);
        } catch (SQLException ex) { 
            Logger.getLogger(Pruebajdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
