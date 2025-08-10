package Desafio_Optional;

import java.util.Objects;

public class Principal {

    public static void main(String[] args) {

        Endereco endereco1 = new Endereco("Av Rondon Pacheco", "2000", "Santa Maria");
        Endereco endereco2 = new Endereco("Av Afonso Pena", "3000", "Centro", new Cidade("Uberlândia"));
        Endereco endereco3 = new Endereco("Av João Naves", "1000", "Santa Mônica", new Cidade("Uberlândia"));
        endereco3.setResidenciaPropria(true);

        Cliente cliente1 = new Cliente("João da Silva");
        Cliente cliente2 = new Cliente("Sebastião Coelho", endereco1);
        Cliente cliente3 = new Cliente("Manoel Filho", endereco2);
        Cliente cliente4 = new Cliente("Maria da Silva", endereco3);

//        System.out.println(obterNomeCidadeResidenciaPropria(cliente1));
//        System.out.println(obterNomeCidadeResidenciaPropria(cliente2));
//        System.out.println(obterNomeCidadeResidenciaPropria(cliente3));
//        System.out.println(obterNomeCidadeResidenciaPropria(cliente4));
    }

    private static String obterNomeCidadeResidenciaPropria(Cliente cliente) {
        Objects.requireNonNull(cliente);

        return cliente.getEndereco()
                .filter(Endereco::isResidenciaPropria)
                .flatMap(Endereco::getCidade)
                .map(Cidade::nome)
                .orElseThrow(TipoDeResidenciaInvalidaException::new);
    }

//    private static String obterNomeCidadeResidenciaPropria(Cliente cliente) {
//        Objects.requireNonNull(cliente);
//
//        Endereco endereco = cliente.getEndereco();
//        Cidade cidade = null;
//
//        if (endereco != null && endereco.isResidenciaPropria()) {
//            cidade = endereco.getCidade();
//        }
//
//        if (cidade != null) {
//            return cidade.nome();
//        }
//
//        throw new TipoDeResidenciaInvalidaException();
//    }

}
