package DAO;


import Pojo.Driver;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DriverDAO {
    Conection conn = new Conection();
    private PreparedStatement sqlListar;
    private PreparedStatement sqlCarregar;
    PreparedStatement stmt;

    public boolean salvar(Driver driver) {
        conn.Conexão();

        try {
            stmt = conn.con.prepareStatement("INSERT INTO driver ( nome, data_nascimento, cpf, cnh) VALUES(?,?,?,?);");

            stmt.setString(1, driver.getNome());
            stmt.setString(2, driver.getDataNascimento().toString());
            stmt.setString(3, driver.getCpf());
            stmt.setString(4, driver.getNumeroCNH());
            stmt.executeQuery();
            return true;
        } catch (SQLException ex) {
            return false;
        } finally{

            conn.Desconecta();
        }
    }

    public boolean Deletar(String cnh) {
        conn.Conexão();

        try {
            stmt = conn.con.prepareStatement("DELETE FROM driver  WHERE cnh = ?");

            stmt.setString(1, cnh.toString());
            stmt.executeQuery();
            return true;
        } catch (SQLException ex) {
            return false;
        } finally{

           conn.Desconecta();
        }
    }

    public boolean update(Driver driver){
        conn.Conexão();

        try{
            stmt = conn.con.prepareStatement("UPDATE driver SET nome = ? WHERE cnh = ?");
            stmt.setString(1,driver.getNome());
            stmt.setString(2, driver.getNumeroCNH().toString());
            stmt.executeQuery();

            return true;
        } catch (Exception e) {
            return false;
        } finally {
            conn.Desconecta();
        }
    }

}
