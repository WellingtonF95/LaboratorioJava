package Collections.Cidade;

import java.util.Set;
import java.util.TreeSet;

public class CidadeSetMain {

    public static void main(String[] args) {

        // Performance é mais importante (não garante a ordem dos elementos)
        //Set<Cidade> cidades = new HashSet<>();

        // Performance é importante, mas precisa manter a ordem de inserção dos elementos
        //Set<Cidade> cidades = new LinkedHashSet<>();

        // Performance é menos importante e precisa manter a ordem natural dos elementos
        Set<Cidade> cidades = new TreeSet<>();

        cidades.add(new Cidade(3170206, "Uberlândia", 706_597));
        cidades.add(new Cidade(3170107, "Uberaba",340_227));
        cidades.add(new Cidade(3550308, "São Paulo",1_2396_372));
        cidades.add(new Cidade(3106200, "Belo Horizonte",2_530_701));
        cidades.add(new Cidade(2304400, "Fortaleza",2_703_391));
        cidades.add(new Cidade(1100205, "Porto Velho",548_952));

        cidades.forEach(System.out::println);

    }

}
