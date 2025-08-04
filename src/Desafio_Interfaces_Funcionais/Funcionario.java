package Desafio_Interfaces_Funcionais;

import java.math.BigDecimal;

public class Funcionario {

    private String nome;
    private BigDecimal salario;
    private boolean ativo;

    public Funcionario(String nome, BigDecimal salario, boolean ativo) {
        this.nome = nome;
        this.salario = salario;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public boolean isInativo() {
        return !isAtivo();
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", ativo=" + ativo +
                '}';
    }
}
