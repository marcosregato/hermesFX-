package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class ConnetcionDB{

    private static String status = "Não conectado...";

    public static Connection criarConexao()
            throws InstantiationException,
            IllegalAccessException,
            ClassNotFoundException, SQLException {

        Connection connection = null;

        String serverName = "localhost:3306";
        String mydatabase = "hermesDB";
        String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
        String username = "root";
        String password = "marcos123";

        connection = DriverManager.getConnection(url, username, password);
        Class.forName("com.mysql.jdbc.Driver").newInstance();

        //Testa a conexão com o banco
        if (connection != null) {
            status = ("STATUS: Conectado com sucesso!");
        } else {
            status = ("STATUS: Não foi possivel realizar conexão");
        }
        return connection;
    }

    public static ResultSet executarSelect(Connection conn, String sql) throws SQLException{
        Statement query = conn.createStatement();
        return query.executeQuery(sql);
    }

}