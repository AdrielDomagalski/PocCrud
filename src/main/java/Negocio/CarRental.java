package Negocio;

import DAO.RentDAO;
import Pojo.Rent;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class CarRental {
    Rent rent = new Rent();
    RentDAO rentDAO = new RentDAO();
    Scanner ler = new Scanner(System.in);

    public void newRent() {
        System.out.println("informe o Id do motorista:");
        rent.setId_driver(ler.nextInt());

        System.out.println("Data Entrega:");
        rent.setDataEntrega(ler.next());

        System.out.println("Data Devolução:");
        rent.setDataDevolucao(ler.next());

        System.out.println("Dias Totais:");
        double dias = ler.nextDouble();
        double precoDias = 5;
        double precoTotal = dias * precoDias;
        rent.setValor_total(precoTotal);

        rentDAO.salvar(rent);
    }
}
