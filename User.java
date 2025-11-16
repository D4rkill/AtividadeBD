package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
    // Método 1 - Realiza a conexão com o banco de dados
    public Connection conectarBD() {
        // Nó 1 - Declara a variável de conexão
        Connection conn = null;
        // Nó 2 - Tentativa de abrir a conexão
        try {
            // Nó 3 - Carrega o driver do MySQL e cria a conexão
            Class.forName("com.mysql.Driver.Manager").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        } // Nó 4 - Disparado ao ocorrer erro na conexão
        catch (Exception e) {
            // Nó 5 - Tratamento de erro
        }
        // Nó 6 - Retorna a conexão
        return conn;
    }

    public String nome = "";
    public boolean result = false;

    // Método 2 - Verifica se o usuário existe no banco de dados
    public boolean verificarUsuario(String login, String senha) {
        // Nó 1 - Monta o comando SQL e conecta ao banco
        String sql = "";
        Connection conn = conectarBD();
        // Estrutura da consulta do SQL
        sql += "select nome from usuarios ";
        sql += "where login = " + "'" + login + "'";
        sql += " and senha = " + "'" + senha + "'";
        // Nó 2 - Tenta executar a consulta
        try {
            // Nó 3 - Cria o Statement e executa o SQL
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            // Nó 4 - Verifica se encontrou algum registro
            if (rs.next()) {
                // Nó 5 - Salva nome e ajusta o resultado
                result = true;
                nome = rs.getString("nome");
            }
        } // Nó 6 - Disparado ao ocorrer erro na consulta
        catch (Exception e) {
            // Nó 7 - Tratamento de erro
        }
        // Nó 8 - Retorna se o usuário foi encontrado
        return result;
    }
}

// Fim da classe
