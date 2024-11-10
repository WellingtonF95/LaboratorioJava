package Collections.MegaSena;

import java.util.Iterator;

public class Sorteador implements Iterable<Integer> {

    @Override
    public Iterator<Integer> iterator() {
        System.out.println("CHAMANDO O ITERATOR...");
        return new SorteadorIterator();
    }
}
