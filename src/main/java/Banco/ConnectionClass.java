package Banco;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates 
 * and open the template in the editor.
 */
/**
 *
 * @author Lemontech
 */
public class ConnectionClass {

    public static Connection obterConexao()
            throws ClassNotFoundException, SQLException {
        Connection conn = null;

        // Passo 1: Registrar driver JDBC
        Class.forName("com.mysql.jdbc.Driver");
         
        // Passo 2: Obter a conexao
        conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.2:3306/sistemagestao",
               "root",
                "");
        return conn;

    }
}
