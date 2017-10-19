package DAO;

import Pojo.Employee;
import Pojo.Rent;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RentDAO {
    Conection conn = new Conection();
    PreparedStatement stmt;

    public boolean salvar(Rent rent) {
        conn.Conexão();

        try {
            stmt = conn.con.prepareStatement("INSERT INTO rent (data_entrada, data_devolucao) VALUES(?,?);");

            stmt.setString(1, rent.getDataEntrega());
            stmt.setString(2, rent.getDataDevolucao());
            stmt.executeQuery();
            return true;
        } catch (SQLException ex) {
            return false;
        } finally{

            conn.Desconecta();
        }
    }

    public boolean Deletar(int id) {
        conn.Conexão();

        try {
            stmt = conn.con.prepareStatement("DELETE FROM rent WHERE id = ?");

            stmt.setString(1, String.valueOf(id));
            stmt.executeQuery();
            return true;
        } catch (SQLException ex) {
            return false;
        } finally{

            conn.Desconecta();
        }
    }

    public boolean update(Rent rent){
        conn.Conexão();

        try{
            stmt = conn.con.prepareStatement("UPDATE rent SET data_devolucao = ? WHERE id = ?");
            stmt.setString(1,rent.getDataDevolucao());
            //stmt.setString(2, rent.getId());
            stmt.executeQuery();

            return true;
        } catch (Exception e) {
            return false;
        } finally {
            conn.Desconecta();
        }
    }
}
