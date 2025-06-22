package Desafios_API_Datas.Chrono_Field_Chrono_Unit;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import Desafios_API_Datas.exception.InvalidDateException;

public class CalculadoraParcelas {

    public static LocalDate formataData(String parcela) throws InvalidDateException {
        try {
            return LocalDate.parse(parcela, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        } catch (DateTimeParseException e) {
            throw new InvalidDateException();
        }
    }

    public static boolean menorQueUm(int qtdParcelas) {
        return qtdParcelas < 1;
    }



}
