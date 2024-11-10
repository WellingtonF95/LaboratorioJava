package Collections.MegaSena;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

public class SorteadorIterator implements Iterator<Integer> {

    private static final Random RANDOM = new Random();
    private List<Integer> cartela = new ArrayList<>();
    private int quantidadeSorteada;

    @Override
    public boolean hasNext() {
        return quantidadeSorteada < 6;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Não há mais números no sorteador!");
        }
        
        quantidadeSorteada++;
        int numero = RANDOM.nextInt(60);

        if (cartela.contains(numero)) {
            System.out.printf("(%d) -> Número já sorteado. Sorteando outro número...\n", numero);
            numero = RANDOM.nextInt(60);
        }

        cartela.add(numero);
        return numero;
    }
}
