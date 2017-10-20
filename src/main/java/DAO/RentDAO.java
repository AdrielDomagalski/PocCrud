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
            stmt = conn.con.prepareStatement("INSERT INTO rent (id_driver, data_entrada, data_devolucao, valor_total) VALUES(?,?,?,?)");

            stmt.setInt(1, rent.getId_driver());
            stmt.setString(2, rent.getDataEntrega());
            stmt.setString(3,rent.getDataDevolucao() );
            stmt.setDouble(4, rent.getValor_total());
            stmt.execute();
            System.out.println("Aluguel efetuado com sucesso");
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
            //stmt.setInt(2, rent.getId());
            stmt.executeQuery();

            return true;
        } catch (Exception e) {
            return false;
        } finally {
            conn.Desconecta();
        }
    }
}
