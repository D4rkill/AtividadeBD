package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
    // Nó 1
    public Connection conectarBD() {
        // Nó 2
        Connection conn = null;
        try {
            // Nó 3
            Class.forName("com.mysql.Driver.Manager").newInstance();
            // Nó 4
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            // Nó 5
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            // Nó 6
        }
        // Nó 7
        return conn;
    }

    public String nome = "";
    public boolean result = false;

    // Nó 8
    public boolean verificarUsuario(String login, String senha) {
        // Nó 9
        String sql = "";
        // Nó 10
        Connection conn = conectarBD();
        // Instrução SQL
        // Nó 11
        sql += "select nome from usuarios ";
        // Nó 12
        sql += "where login = " + "'" + login + "'";
        // Nó 13
        sql += " and senha = " + "'" + senha + "'";
        try {
            // Nó 14
            Statement st = conn.createStatement();
            // Nó 15
            ResultSet rs = st.executeQuery(sql);
            // Nó 16
            if (rs.next()) {
                // Nó 17
                result = true;
                // Nó 18
                nome = rs.getString("nome");
            }
        } catch (Exception e) {
            // Nó 19
        }
        // Nó 20
        return result;
    }
}

// Fim da classe
