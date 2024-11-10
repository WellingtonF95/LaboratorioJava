package Collections.Hotelaria;

import java.util.ArrayList;

public class CadastroHotel {

    /*Ao utilizar o ArrayList, é sempre uma boa pratica utilizar Generics ao invés de utilizar o ArrayList de forma pura.
    * Fazendo o uso do Generics é assegurado que a instancia do ArrayList que foi declarada não receba outro tipo parametrizado,
    * a não ser o próprio tipo que foi declarado no operador diamante <>. No caso abaixo, do tipo Hotel*/

    private final ArrayList hoteisSemGenerics = new ArrayList(); //Sem Generics
    private final ArrayList<Hotel> hoteis = new ArrayList<>(); //Com Generics

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

    public ArrayList<Hotel> obterHoteis() {
        return hoteis;
    }

    public static void imprimirHoteisComForTradicional(ArrayList<Hotel> hoteis) {
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            System.out.printf("%s (%s) -> %.2f\n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }
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
       ArrayList<Hotel> listaHoteis = obterHoteis();
        for (int i = 0; i < listaHoteis.size(); i++) {
            hoteis.removeAll(listaHoteis);
        }
    }

    public void removerTodosHoteisComClear() {
        hoteis.clear();
    }

}
