package Collections.Cidade;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class EstadoCidadeMapMain {

    public static void main(String[] args) {

        Estado sp = new Estado("SP", "São Paulo");
        Estado mg = new Estado("MG", "Minas Gerais");
        Estado ce = new Estado("CE", "Ceará");
        Estado ro = new Estado("RO", "Rondonia");

        Cidade saoPaulo = new Cidade(3550308, "São Paulo", 1_2396_372);
        Cidade beloHorizonte = new Cidade(3106200, "Belo Horizonte", 2_530_701);
        Cidade fortaleza = new Cidade(2304400, "Fortaleza", 2_703_391);
        Cidade portoVelho = new Cidade(1100205, "Porto Velho", 548_952);

        // Implementação onde a performance é mais importante e que a ordenação não é importante
        //Map<Estado, Cidade> estados = new HashMap<>();

        // Implementação onde a performance é importante, mas que garante a ordem de inserçao dos elementos
        //Map<Estado, Cidade> estados = new LinkedHashMap<>();

        //Implementação onde a performance é menos importante, mas que garante a ordenação de forma natural
        Map<Estado, Cidade> estados = new TreeMap<>();

        estados.put(sp, saoPaulo);
        estados.put(mg, beloHorizonte);
        estados.put(ce, fortaleza);
        estados.put(ro, portoVelho);
        estados.put(new Estado("PR", "Paraná"), new Cidade(1244009, "Curitiba", 1_095_456));

        for (Map.Entry<Estado, Cidade> entry : estados.entrySet()) {
            System.out.printf("%s (%s) -> %s\n",
                    Objects.nonNull(entry.getKey()) ? entry.getKey().getNome() : "Nenhum Estado",
                    Objects.nonNull(entry.getKey()) ? entry.getKey().getSigla() : "Nenhuma Sigla",
                    Objects.nonNull(entry.getValue()) ? entry.getValue().getNome() : "Nenhuma Cidade/Capital"
            );
        }
    }

}
