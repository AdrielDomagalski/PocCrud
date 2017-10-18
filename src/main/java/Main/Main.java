package Main;

import Negocio.OficialRegistration;
import Negocio.driverRegistration;
import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner ler = new Scanner(System.in);
        OficialRegistration oficialRegistration = new OficialRegistration();
        driverRegistration driverRegistration = new driverRegistration();

        System.out.println("Menu");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Cadastro Funcionario");
        System.out.println("2 - Cadastro Motorista");
        System.out.println("3 - Realizar Aluguel");
        System.out.println("Opção: ");

        int opcao = ler.nextInt();

        switch(opcao){
            case 1:
                oficialRegistration.executeRegistration();
                break;
            case 2:
                driverRegistration.executaRegistration();
                break;
            case 3:

                break;
            case 5:
                System.out.println("Até Logo...");
                break;
            default:
                System.out.println("Por favor, digite uma opção válida");
                break;
        }

    }
}