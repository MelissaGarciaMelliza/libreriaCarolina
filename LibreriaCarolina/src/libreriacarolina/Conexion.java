/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriacarolina;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author linke
 */
public class Conexion {
 private static String us = "root";
    private static String pas = "";
    private static String bd = "libreria";
    private static String url = "jdbc:mysql://localhost:3306/"+bd;

    public static String getUs() {
        return us;
    }

    public static String getPas() {
        return pas;
    }

    public static String getBd() {
        return bd;
    }
    Connection Conexion = null;

    public Connection conexion() {
      
        try {
            Class.forName("org.gjt.mm.mysql.Driver");//.newInstance();
            Conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/libreria", "root", "");
            System.out.println("CONEXION EXITOSA");
            //conectar=DriverManager.getConnection("jdbc:mysql://192.168.1.5:3306/personas","luis","");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion de la base de datos");
        } catch (ClassNotFoundException ex) {
        }
        return Conexion;
        
    }
}

