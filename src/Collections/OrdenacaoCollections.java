package Collections;

import java.util.*;

public class OrdenacaoCollections {

    public static void main(String[] args) {


        /*Ordenação com numeros inteiros*/

        List<Integer> numeros = new ArrayList<>();
        Random RANDOM = new Random();

        for (int i = 0; i < 10; i++) {
            int num = RANDOM.nextInt(100);

            if (!numeros.contains(num))
                numeros.add(RANDOM.nextInt(100));
        }

        /*Ordena de forma natural -> ascendente: do menor para o maior*/
        Collections.sort(numeros);
        System.out.printf("Ascendente -> %s\n", numeros);

        /*Ordena de forma reversa -> decrescente: do maior para o menor*/
        Collections.sort(numeros, Comparator.reverseOrder());
        System.out.printf("Reverso -> %s\n", numeros);


        /*Ordenação com numeros com ponto flutuante*/

        List<Double> numerosQuebrados = new ArrayList<>();
        Random RANDOM2 = new Random();

        for (int i = 0; i < 10; i++) {
            double numQ = RANDOM2.nextDouble(100);

            if (!numerosQuebrados.contains(numQ))
                numerosQuebrados.add(RANDOM2.nextDouble(100));
        }

        /*Ordena de forma natural -> ascendente: do menor para o maior*/
        Collections.sort(numerosQuebrados);
        System.out.printf("Ascendente -> %s\n", numerosQuebrados);

        /*Ordena de forma reversa -> decrescente: do maior para o menor*/
        Collections.sort(numerosQuebrados, Comparator.reverseOrder());
        System.out.printf("Reverso -> %s\n", numerosQuebrados);

        /*Ordenação com Strings*/

        List<String> chamada = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String nome = scan.next();
            chamada.add(nome);
        }

        Collections.sort(chamada);
        System.out.printf("Lista de chamada em ordem alfabetica -> %s\n", chamada);

        /*Usando o comparator ao chamar a propria lista*/

        chamada.sort(Comparator.reverseOrder());
        System.out.printf("Lista de chamada em ordem reversa -> %s\n", chamada);
    }
}
