package Collections.Hotelaria;

import java.util.*;


public class CadastroHotel {

    /*Ao utilizar o ArrayList, é sempre uma boa pratica utilizar Generics ao invés de utilizar o ArrayList de forma pura.
    * Fazendo o uso do Generics é assegurado que a instancia do ArrayList que foi declarada não receba outro tipo parametrizado,
    * a não ser o próprio tipo que foi declarado no operador diamante <>. No caso abaixo, do tipo Hotel*/

    private final ArrayList hoteisSemGenerics = new ArrayList(); //Sem Generics
    private final List<Hotel> hoteis = new ArrayList<>();//Com Generics

    public void adicionarHoteis(String nome, String cidade, double precoDiaria) {
        Hotel hotel = new Hotel(nome, cidade, precoDiaria);

        //Metodo contains() verifica se o objeto já foi adicinado no ArrayList - Essa condição para funcionar, os metodos equals() e
        //hashCode() devem ser implementados
        if (hoteis.contains(hotel)) {
            throw new HotelJaExistenteException("Hotel já foi adicionado!");
        }

        hoteis.add(hotel);
    }

    public void adicionarHoteisRepetidos(String nome, String cidade, double precoDiaria) {
        hoteis.add(new Hotel(nome, cidade, precoDiaria));
    }

    public List<Hotel> obterHoteis() {
        return hoteis;
    }

    public Hotel[] obterHoteisTransformandoEmArray() {
        return hoteis.toArray(new Hotel[0]);
    }

    public void ordenarHoteis() {
        Collections.sort(hoteis);
    }

    public void ordenarHoteisPorPrecoDiaria() {
        /*Usa implementação personalizada para ordenar por preço, sem alterar a implementação com Comparable
         que faz a ordenação por nome do hotel, combinando também outras ordenações por ordem de chamada
         1º ordena por preço diaria;
         2º ordena por nome do hotel.
         */
        hoteis.sort(new PrecoHotelariaComparator()
                .thenComparing(Comparator.naturalOrder()));
    }

    public static void imprimirHoteisComForTradicional(List<Hotel> hoteis) {
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            System.out.printf("%s (%s) -> %.2f\n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }
    }

    public static void imprimirHoteisComIterator(List<Hotel> hoteis) {
        Iterator<Hotel> hotelIterator = hoteis.iterator();
        System.out.println("Imprimindo hoteis com o Iterator!");
        while (hotelIterator.hasNext()) {
            Hotel hotel = hotelIterator.next();
            System.out.printf("%s (%s) -> %.2f\n",
                    hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }
    }

    public static void imprimirHoteisComListIteratorDoPrimeiroAoUltimo(List<Hotel> hoteis) {
        ListIterator<Hotel> hotelListIterator = hoteis.listIterator();
        System.out.println("Imprimindo hoteis com o List Iterator do primeiro ao ultimo!");
        while (hotelListIterator.hasNext()) {
            Hotel hotel = hotelListIterator.next();
            System.out.printf("%s (%s) -> %.2f\n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }
        System.out.println("--FIM--");
    }

    public static void imprimirHoteisComListIteratorDoUltimoAoPrimeiro(List<Hotel> hoteis) {
        ListIterator<Hotel> hotelListIterator = hoteis.listIterator(hoteis.size());
        System.out.println("Imprimindo hoteis com o List Iterator do ultimo ao primeiro!");
        while (hotelListIterator.hasPrevious()) {
            Hotel hotel = hotelListIterator.previous();
            System.out.printf("%s (%s) -> %.2f\n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }
        System.out.println("--FIM--");
    }

    public static void imprimirHoteisComForeach(List<Hotel> hoteis) {
        System.out.println("Imprimindo hoteis com o ForEach");
        for (Hotel hotel: hoteis) {
            System.out.printf("%s (%s) -> %.2f\n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }
        System.out.println("--FIM--");
    }

    public void removerHoteisPorCidade(String cidade) {
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            if (hotel.getCidade().equals(cidade)) {
                hoteis.remove(i);
                i--;
            }
        }
    }

    public void removerHoteis() {
        List<Hotel> listaHoteis = obterHoteis();
        for (int i = 0; i < listaHoteis.size(); i++) {
            hoteis.removeAll(listaHoteis);
        }
    }

    public void removerTodosHoteisComClear() {
        hoteis.clear();
    }

}
