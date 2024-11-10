package Collections;

import java.util.ArrayList;

public class ListExamples {

    public static void main(String[] args) {


        /*As listas sao estruturas de dados linear que possuem um indice e que aceitam elementos duplicados. É semelhante
        * ao array[] mas é possível redimensionar elementos em uma lista.
        *
        * Implementaçoes da interface List: ArrayList, LinkedList, Vector
        *
        * ArrayList não é um array[]. O ArrayList não tem especificação de quantos elementos se podem adicionar, o array[] possuí.
        * O ArrayList possuí um array interno que o seu tamanho padrão é 10. Ao adicionar um elemento a mais no ArrayList, acontece uma redimencionamento
        * interno desse array interno, onde é criado um outro array com 50% de sua capacidade anterior e os elementos são reordenados novamente.
        *
        * Cada elemento é adicionado sempre ao final da lista. Ao remover algum elemento no inicio ou no meio da lista, todos os outros elementos a direita são redimensionados
        * para ocupar a posição do elemento que foi removido. Para listas maiores isso pode ser um problema, pelo fato dessa reorganização acontecer para todos os elementos.
        * Para um cenário onde é possível prever a quantidade de elementos que o ArrayList possa receber, seria interessante instanciar o arrayList com uma capacidade pré-determinada
        * em seu construtor. Ex.: ArrayList frutas = new ArrayList(15);
        *
        * Por outro lado,a iteração por cada elemento do arrayList é feito de forma rápida e bem performática, uma vez que a estrutura interna do ArrayList é um
        * array e que é um recurso nativo da linguagem
        *
        * */

        //Instanciando um ArrayList de forma simples, sem Generics
        ArrayList frutas = new ArrayList();
        frutas.add("Banana");
        frutas.add("Maça");
        frutas.add("Melão");

        System.out.println(frutas.get(1));







    }
}
