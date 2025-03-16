package Desafio_Excessoes.Excessoes;

public class OperacaoBancariaException extends RuntimeException {

    public OperacaoBancariaException(String mensagem) {
        super(mensagem);
    }

    public OperacaoBancariaException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }

}
