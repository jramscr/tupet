/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesús
 */
public class User {
    public static int current_user_id;
    public static String current_user_email;
    public static String current_user_tipo;
    private Connection connection;
    
    public boolean existsUser(String correo, String password){
        DBConnection baseDatos = new DBConnection().connect();

        try {
            ResultSet registros = baseDatos.read("SELECT * FROM USUARIO");

            if (registros != null) {
                try {
                    while (registros.next()) {
                        if(registros.getString("CORREO").toLowerCase().equals(correo.toLowerCase())
                                && registros.getString("PASSWORD").toLowerCase().equals(password.toLowerCase())){
                            current_user_id = Integer.parseInt(registros.getString("IDUSUARIO"));
                            current_user_email = registros.getString("CORREO");
                            current_user_tipo = registros.getString("IDTIPOUSUARIO");
                            return true;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al ejecutar!");
        }
        return false;
    }
    
    public boolean createUser(String tipo_usuario, String nombre, String apellido,
            String email, String telefono, String direccion, String fotografia, String contrasennia){
            CallableStatement call = null;
        try {
            int index = 0;
            Class.forName("oracle.jdbc.OracleDriver");
            String database_url_listener = "jdbc:oracle:thin:@localhost:1521:oracle";
            connection = DriverManager.getConnection(database_url_listener, "tupet", "tupet");
            
            call = connection.prepareCall(Constants.REGISTRAR_USUARIO);
            //Cargar los parametros de entrada.
            call.setString(++index, tipo_usuario);
            call.setString(++index, nombre);
            call.setString(++index, apellido);
            call.setString(++index, email);
            call.setString(++index, telefono);
            call.setString(++index, direccion);
            call.setString(++index, fotografia);
            call.setString(++index, contrasennia);
            // Registrar los parametros de salida.
            call.registerOutParameter(++index, java.sql.Types.INTEGER);
            //Ejecutamos el procedure.
            call.execute();
            
            int resultado = call.getInt(9);
            
            if (resultado == 1){
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo registrar el usuario!");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            
        } finally {
            SQLTools.close(null, call, connection);
        }
        return false;
    }
}