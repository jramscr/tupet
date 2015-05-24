/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
    private Connection connection;
    
    public Connection getConnection(){
        return connection;
    }
    
    public void setConnection(Connection entry_connection) {
        this.connection = entry_connection;
    }
    
    public DBConnection connect(){
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String database_url_listener = "jdbc:oracle:thin:@localhost:1521:oracle";
            
            connection = DriverManager.getConnection(database_url_listener, "tupet", "tupet");
            
            if (connection != null) {
                System.out.println("La conexion fue establecida exitosamente.");
            } else {
                System.out.println("Conexion fallida.");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            
        } return this;
    }
    
    public boolean create(String sql){
        try {
            Statement sql_sentence;

            sql_sentence = getConnection().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);

            sql_sentence.executeUpdate(sql);

            getConnection().commit();

            sql_sentence.close();

        } catch (SQLException e) {
            e.printStackTrace();

            System.out.print("ERROR SQL");

            return false;

        } return true;
    }
    
    public ResultSet read(String sql){
        ResultSet connection_result = null;
        
        try {
            Statement sql_sentence;
            
            sql_sentence = getConnection().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            
            connection_result = sql_sentence.executeQuery(sql);
            
        } catch (Exception e) {
            e.printStackTrace();
            
            return null;
        } return connection_result;
    }
    
//Fin de la Clase Funcionalidad
}
