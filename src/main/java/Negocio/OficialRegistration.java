package Negocio;


import DAO.EmployeeDAO;
import Pojo.Employee;

import java.text.ParseException;
import java.util.Scanner;

public class OficialRegistration {
    Employee employee = new Employee();
    EmployeeDAO employeeDAO = new EmployeeDAO();
    Scanner ler = new Scanner(System.in);

    public void executeRegistration() throws ParseException {
        System.out.println("Nome:");
        employee.setNome(ler.next());

        System.out.println("cpf:");
        employee.setCpf(ler.next());

        System.out.println("Data Nascimento:");
        employee.setDataNascimento(ler.next());

        System.out.println("Matricula:");
        employee.setMatricula(ler.next());

        employeeDAO.salvar(employee);
    }
}
