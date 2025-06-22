package Desafio_Date_Legado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DesafioDateLegado {

    public static void main(String[] args) throws ParseException {

        // Receber a data do usuario em string
        // Converter data em string para date no formato: dd/MM/yyyy
        // Transformar date em calendar
        // Imprimir a data no console, alterando o valor do mes


        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a data da primeira parcela: ");
        String inputDataCompra = scan.nextLine();

        System.out.println("Digite o numero de parcelas: ");
        int parcelas = scan.nextInt();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dataCompra = simpleDateFormat.parse(inputDataCompra);

        Calendar calendar = Calendar.getInstance();
        int dia;

        for (int i = 1; i <= parcelas; i++) {
            calendar.setTime(dataCompra);

            dia = calendar.get(Calendar.DAY_OF_MONTH);

            if (dia > 30) {
                dia = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
                calendar.set(Calendar.DAY_OF_MONTH, dia);
            }

            calendar.add(Calendar.MONTH, i - 1);

            System.out.printf("Parcela #%d, Vencimento: %s\n", i, simpleDateFormat.format(calendar.getTime()));
        }
    }
}
