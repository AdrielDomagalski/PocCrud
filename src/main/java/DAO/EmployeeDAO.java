package DAO;



import Pojo.Employee;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAO {
    Conection conn = new Conection();
    private PreparedStatement sqlListar;
    private PreparedStatement sqlCarregar;
    PreparedStatement stmt;

    public boolean salvar(Employee employee) {
        conn.Conexão();

        try {
            stmt = conn.con.prepareStatement("INSERT INTO employee ( nome, data_nascimento, cpf, matricula) VALUES(?,?,?,?);");

            stmt.setString(1, employee.getNome());
            stmt.setString(2, employee.getDataNascimento().toString());
            stmt.setString(3, employee.getCpf());
            stmt.setString(4, employee.getMatricula());
            stmt.executeQuery();
            return true;
        } catch (SQLException ex) {
            return false;
        } finally{

            conn.Desconecta();
        }
    }

    public boolean Deletar(String matric) {
        conn.Conexão();

        try {
            stmt = conn.con.prepareStatement("DELETE FROM employee  WHERE matricula = ?");

            stmt.setString(1, matric.toString());
            stmt.executeQuery();
            return true;
        } catch (SQLException ex) {
            return false;
        } finally{

            conn.Desconecta();
        }
    }

    public boolean update(Employee employee){
        conn.Conexão();

        try{
            stmt = conn.con.prepareStatement("UPDATE employee SET nome = ?, matricula = ? WHERE matricula = ?");
            stmt.setString(1,employee.getNome());
            stmt.setString(2, employee.getMatricula());
            stmt.executeQuery();

            return true;
        } catch (Exception e) {
            return false;
        } finally {
            conn.Desconecta();
        }
    }
}
