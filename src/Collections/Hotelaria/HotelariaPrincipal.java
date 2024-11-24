package Collections.Hotelaria;

import java.util.*;

import static Collections.Hotelaria.CadastroHotel.imprimirHoteisComForTradicional;
import static Collections.Hotelaria.CadastroHotel.imprimirHoteisComForeach;
import static Collections.Hotelaria.CadastroHotel.imprimirHoteisComListIteratorDoPrimeiroAoUltimo;
import static Collections.Hotelaria.CadastroHotel.imprimirHoteisComListIteratorDoUltimoAoPrimeiro;

public class HotelariaPrincipal {

    public static void main(String[] args) {

        CadastroHotel cadastro = new CadastroHotel();
        cadastro.adicionarHoteisRepetidos("IBIS", "Faria Lima/SP", 200);
        cadastro.adicionarHoteisRepetidos("Newtow Plaza", "Santana de Parnaiba/SP", 120);
        cadastro.adicionarHoteisRepetidos("Hotel Fazenda", "Serra Negra/SP", 300);
        cadastro.adicionarHoteisRepetidos("Lups", "Cajamar/SP", 100);
        cadastro.adicionarHoteisRepetidos("Chacara Solar Hotel", "Santana de Parnaiba/SP", 120);

        //Ordena por nome do hotel
        cadastro.ordenarHoteis();
        System.out.printf("Ordenado pelo nome -> %s\n", cadastro.obterHoteis());

        //Ordena pelo preço do hotel
        cadastro.ordenarHoteisPorPrecoDiaria();
        System.out.printf("Ordenado pelo preço da diária -> %s\n", cadastro.obterHoteis());

        Hotel hotel = (Hotel) cadastro.obterHoteis().get(1); //<- Com o uso do Generics, o casting não é mais necessário
        System.out.println(hotel.getNome());

        /*Ao declarar e instanciar um ArrayList, é assegurado que qualquer outro tipo diferente de Hotel não seja adicionado no ArrayList,
        *o compilador não deixa que seja adicionado outro elemento a não ser uma instancia do tipo Hotel. Com o uso do Generics, não é mais necessario
        * realizar o casting ao utilizar o metodo get(index i) ao tentar adicionar algum elemento ao ArrayList
        *
        * ArrayList<Hotel> hoteis = new ArrayList<>();
        *
        * Para a situação abaixo, o compilador permite que seja adicionado outro tipo de elemento ao ArrayList do tipo Hotel.
        * Mas ao tentar realizar o casting para Hotel usando o metodo get(index i) ocorre a excessao do tipo ClassCastException
        *
        * ArrayList hoteis = new ArrayList();
        * hoteis.add("Hotel Fazenda");
        *
        *  */
        List<Hotel> hoteis = cadastro.obterHoteis();
        imprimirHoteisComForTradicional(hoteis);

        System.out.println(hoteis.indexOf(hotel)); //<- busca o elemento do ArrayList da esquerda pra direita, mesmo se houver mais de um elemento no ArrayList
        System.out.println(hoteis.lastIndexOf(hotel));//<- busca o elemento do ArrayList da direita pra esquerda, mesmo se houver mais de um elemento no ArrayList

        System.out.printf("Hoteis[] -> %s\n", Arrays.toString(cadastro.obterHoteisTransformandoEmArray()));

        //Iterator

        imprimirHoteisComListIteratorDoPrimeiroAoUltimo(hoteis);
        imprimirHoteisComListIteratorDoUltimoAoPrimeiro(hoteis);

        //ForEach
        imprimirHoteisComForeach(hoteis);

        cadastro.removerHoteisPorCidade("Santana de Parnaiba/SP");
        cadastro.removerHoteis();

        System.out.println(cadastro.obterHoteis().size());
        imprimirHoteisComForTradicional(hoteis);


    }


}
