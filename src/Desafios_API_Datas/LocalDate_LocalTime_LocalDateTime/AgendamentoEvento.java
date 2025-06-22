package Desafios_API_Datas.LocalDate_LocalTime_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;

import Desafios_API_Datas.exception.DateException;
import Desafios_API_Datas.exception.TimeException;

public class AgendamentoEvento {


    public static LocalDate validaData(String input) {
        try {
            return LocalDate.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        } catch (DateTimeParseException e) {
            throw new DateException();
        }
    }

    public static LocalTime validaHorario(String input) {
        try {
            return LocalTime.parse(input , DateTimeFormatter.ofPattern("HH:mm"));
        } catch (DateTimeParseException e) {
            throw new TimeException();
        }
    }

    public static void criaEvento(LocalDateTime dataEvento) {
        System.out.printf("Evento agendado para %s\n",
                dataEvento.format(
                        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT)
                )
        );
    }
}