/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.sql.ResultSet;

/**
 *
 * @author Jesús
 */
public class User {
    public int current_user_row;
        

    public int find_user_row(String correo, String password){
        DBConnection baseDatos = new DBConnection().connect();

        try {
            ResultSet resultados = baseDatos.read("SELECT CORREO, PASSWORD FROM USUARIO");

            if (resultados != null) {
                try {
                    System.out.println("CORREO");
                    System.out.println("--------------------------------------------------");
                    while (resultados.next()) {
                        if(resultados.getString("CORREO").toLowerCase() == correo.toLowerCase()
                                && resultados.getString(password).toLowerCase() == password.toLowerCase()){
                            current_user_row = resultados.getRow();
                            System.out.println(""+resultados.getString("CORREO")+"---"+resultados.getString("PASSWORD"));
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un problema al ejecutar!");
        }
        return current_user_row;
    }
}