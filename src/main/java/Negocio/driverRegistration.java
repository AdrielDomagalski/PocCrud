package Negocio;

import DAO.DriverDAO;
import Pojo.Driver;

import java.text.ParseException;
import java.util.Scanner;

public class driverRegistration {
    Driver driver = new Driver();
    DriverDAO driverDAO = new DriverDAO();
    Scanner ler = new Scanner(System.in);

    public void executaRegistration() throws ParseException {
        System.out.println("Nome:");
        driver.setNome(ler.next());

        System.out.println("cpf:");
        driver.setCpf(ler.next());

        System.out.println("Data Nascimento:");
        driver.setDataNascimento(ler.next());

        System.out.println("Cnh:");
        driver.setNumeroCNH(ler.next());

        driverDAO.salvar(driver);
    }
}
