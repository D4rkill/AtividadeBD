package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
    // Método 1 
    public Connection conectarBD() {
        // Nó 1
        Connection conn = null;
        try {
            // Nó 2
            Class.forName("com.mysql.Driver.Manager").newInstance();
            // Nó 3
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            // Nó 4
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            // Nó 5
        }
        // Nó 6
        return conn;
    }

    public String nome = "";
    public boolean result = false;
    
    // Método 2
    public boolean verificarUsuario(String login, String senha) {
        // Nó 1
        String sql = "";
        // Nó 2
        Connection conn = conectarBD();
        // Instrução SQL
        // Nó 3
        sql += "select nome from usuarios ";
        // Nó 4
        sql += "where login = " + "'" + login + "'";
        // Nó 5
        sql += " and senha = " + "'" + senha + "'";
        try {
            // Nó 6
            Statement st = conn.createStatement();
            // Nó 7
            ResultSet rs = st.executeQuery(sql);
            // Nó 8
            if (rs.next()) {
                // Nó 9
                result = true;
                // Nó 10
                nome = rs.getString("nome");
            }
        } catch (Exception e) {
            // Nó 11
        }
        // Nó 12
        return result;
    }
}

// Fim da classe
