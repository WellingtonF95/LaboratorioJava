package Desafios_API_Datas.Chrono_Field_Chrono_Unit;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Desafios_API_Datas.exception.InvalidDateException;

public class CalculadoraParcelasPrincipal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LocalDate dataParcela = null;
        boolean wasError = true;
        int qtdParcelas = 0;

        do {
            try {
                System.out.print("Data da primeira parcela: ");
                String primeiraParcela = scan.nextLine();

                dataParcela = CalculadoraParcelas.formataData(primeiraParcela);
                wasError = false;
            } catch (InvalidDateException e) {
                System.out.println("Formato de data inválido!");
            }
        } while (wasError);

        do {
            System.out.print("Quantidade de parcelas: ");
            qtdParcelas = scan.nextInt();

            if (qtdParcelas < 1) {
                System.out.println("Quantidade deve ser maior que zero");
            } else {
                break;
            }
        } while (true);

        for (int i = 0; i < qtdParcelas; i++) {
            System.out.printf(
                    "Parcela #%s - %s\n",
                    i + 1,
                    dataParcela.plusMonths(i).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
            );
        }

    }

}
