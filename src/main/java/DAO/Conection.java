package DAO;

import java.sql.*;

public class Conection {
    public PreparedStatement stm;
    public ResultSet rs;
    private String driver = "com.mysql.jdbc.Driver";
    private String caminho = "jdbc:mysql://localhost:3306/projetocrud";
    private String usuario = "root";
    private String senha = "";
    public Connection con;

    public void  Conexão()
    {
        System.setProperty("jdbc.Drivers", driver);
        try {
            System.setProperty("jdbc.Drivers", driver);
            con = DriverManager.getConnection(caminho, usuario, senha);
        } catch (SQLException ex) {
            System.out.println("erro: " + ex);
        }
    }

    public void Desconecta(){
        try {
            con.close();
        } catch (SQLException ex) {
            System.out.println("erro: " + ex);
        }
    }
}

