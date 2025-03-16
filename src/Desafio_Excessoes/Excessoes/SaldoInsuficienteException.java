package Desafio_Excessoes.Excessoes;

public class SaldoInsuficienteException extends OperacaoBancariaException {

    public SaldoInsuficienteException(String messagem) {
        super(messagem);
    }

}
