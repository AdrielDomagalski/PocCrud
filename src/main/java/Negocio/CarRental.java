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

    public void newRent() throws ParseException {
        Date dataEntrega, dataDevolucao;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Data Entrega");
        rent.setDataEntrega(ler.next());

        System.out.print("Data Devolução");
        rent.setDataDevolucao(ler.next());

        dataEntrega = df.parse(rent.getDataEntrega());
        dataDevolucao = df.parse(rent.getDataDevolucao());

        long dt = (dataEntrega.getTime() - dataDevolucao.getTime()) + 3600000;

        System.out.print("o carro será alugado por " + dt + " dias");

        rentDAO.salvar(rent);
    }
}
