package Collections.MegaSena;

import java.util.Iterator;

public class SorteioMegaSena {

    /*Este pacote é um exemplo de uma implementação customizada de iterable e iterator e que o forEach
    * também é um iterable*/


    public static void main(String[] args) {

        Sorteador sorteador = new Sorteador();

        System.out.println("Com o iterator!");
        Iterator<Integer> iterator = sorteador.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Com o foreach!");
        for (Integer i : sorteador) {
            System.out.println(i);
        }


    }


}
