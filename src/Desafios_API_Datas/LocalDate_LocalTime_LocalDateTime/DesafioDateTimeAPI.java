package Desafios_API_Datas.LocalDate_LocalTime_LocalDateTime;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

import Desafios_API_Datas.exception.DateException;
import Desafios_API_Datas.exception.TimeException;

public class DesafioDateTimeAPI {

    public static void main(String[] args) throws ParseException {

        Scanner scan = new Scanner(System.in);
        boolean erro = true;
        String input;
        LocalDate data = null;
        LocalTime hora = null;

        do {
            try {
                System.out.println("Digite a data do evento: ");
                input = scan.nextLine();
                data = AgendamentoEvento.validaData(input);

                erro = false;
            } catch (DateException e) {
                System.out.println("Dados inválidos. Tente novamente!");
            }
        } while (erro);

        do {
            try {
                System.out.println("Digite o horário do evento: ");
                input = scan.nextLine();
                hora = AgendamentoEvento.validaHorario(input);

                erro = false;
            } catch (TimeException e) {
                erro = true;
                System.out.println("Dados inválidos. Tente novamente!");
            }
        } while (erro);

        LocalDateTime dataEvento = LocalDateTime.of(data, hora);
        AgendamentoEvento.criaEvento(dataEvento);

    }

}
