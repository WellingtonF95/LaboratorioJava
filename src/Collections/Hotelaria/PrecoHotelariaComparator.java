package Collections.Hotelaria;

import java.util.Comparator;

public class PrecoHotelariaComparator implements Comparator<Hotel> {

    /*Ao criar uma nova classe que implementa a interface Comparator, é possível personalizar a logica de ordenação
    * para que o nivel de ordenação fique por escopo de propriedade por cada objeto e não por escopo de classe, fazendo
    * com que toda instancia da classe fique "amarrada" as propriedades que foram sobrescritas no equals e no compareTo
    * */

    @Override
    public int compare(Hotel o1, Hotel o2) {
        return Double.compare(o1.getPrecoDiaria(), o2.getPrecoDiaria());
    }
}
