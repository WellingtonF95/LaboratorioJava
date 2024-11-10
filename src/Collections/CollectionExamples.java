package Collections;

import java.util.*;

public class CollectionExamples {

    public static void main(String[] args) {

        Collection<String> nomes = new ArrayList<>();
        Collection<String> sobrenomes = new ArrayList<>();
        Collection<String> animais = new ArrayList<>(List.of("Cachorro", "Gato"));
        List<String> cores = new ArrayList<>(List.of("Amarelo", "Verde"));

        //Metodos para adicionar elementos
        nomes.add("Wellington");
        sobrenomes.add("Francelino");
        sobrenomes.add("dos Santos");
        nomes.addAll(sobrenomes);
        nomes.addAll(animais);

        //Metodo size() verifica a quantidade de elementos do ArrayList
        System.out.printf("Tamanho da lista de nomes: %d\n", nomes.size());
        System.out.printf("Tamanho da lista de sobrenomes: %d\n", sobrenomes.size());

        //Metodo isEmpty() verifica se o ArrayList está vazia
        System.out.printf("Lista de nomes está vazia? %s\n", nomes.isEmpty());

        System.out.printf("Lista de nomes: %s\n", nomes);

        //Metodo contains verifica se o ArrayList contem o elemento especificado
        System.out.printf("Na lista de nomes contem o sobrenome dos Santos? %s\n", nomes.contains("dos Santos"));

        //Metodo containsAll verifica se o ArrayList possui um outro ArrayList lista dentro dele
        System.out.printf("Na lista de nomes contem a lista de sobrenomes? %s\n", nomes.containsAll(sobrenomes));
        System.out.printf("Na lista de nomes contem a lista de animais? %s\n", nomes.containsAll(animais));

        //Metodos para remover elementos
        nomes.remove("dos Santos");
        nomes.removeAll(sobrenomes);
        nomes.removeIf(nome -> nome.equals("Wellington"));

        //Metodo retainAll retem todos os elementos do arraylist nomes se esses elementos estiver no arraylist animais. Se nao, esse elementos são removidos
        System.out.printf("retainAll: %s\n",nomes.retainAll(animais));
        nomes.retainAll(animais);

        //Metodo clear() remove todos os elementos do ArrayList
        animais.clear();

        System.out.printf("Lista de nomes: %s\n", nomes);
        System.out.printf("Lista de sobrenomes: %s\n", sobrenomes);
        System.out.printf("Lista de animais: %s\n", animais);

        nomes.clear();
        sobrenomes.clear();

        nomes.add("Wellington");
        nomes.add("Francelino");
        nomes.add("Santos");

        sobrenomes.add("Wellington");
        sobrenomes.add("Francelino");
        sobrenomes.add("Santos");

        //Para ArrayList - o metodo equals verifica se todos elementos do arraylist são iguais e se estão na mesma ordem, pois é verificado pelo conteudo do indice
        System.out.printf("Os elementos da lista nomes são iguais ao da lista sobrenomes? %s\n", nomes.equals(sobrenomes));
        System.out.printf("Nomes hasCode: %d\n", nomes.hashCode());
        System.out.printf("Sobrenomes hasCode: %d\n", sobrenomes.hashCode());

        Collection<String> objetos = new HashSet<>();
        Collection<String> outrosObjetos = new HashSet<>();

        objetos.add("Teclado");
        objetos.add("Mouse");

        outrosObjetos.add("Mouse");
        outrosObjetos.add("Teclado");

        //Para HashSet - o metodo equals verifica se todos elementos do hasSet são iguais, independente da ordem, pois o Set não possuem indices e garante que os elementos são unicos
        System.out.printf("hasCode objetos: %d\n", objetos.hashCode());
        System.out.printf("hasCode outrosObjetos: %d\n", outrosObjetos.hashCode());
        System.out.printf("Os elementos do hasSet objetos são iguais ao do hashSet outrosObjetos? %s\n", objetos.equals(outrosObjetos));

    }
}
