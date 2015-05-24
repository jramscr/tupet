/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesús
 */
public class Login {
    public static int current_user_id;
    public static String current_user_email;
    public static String current_user_tipo;
    
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
}