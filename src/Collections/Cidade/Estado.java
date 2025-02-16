package Collections.Cidade;

import java.util.Objects;

public class Estado implements Comparable<Estado> {

    private String sigla;
    private String nome;

    public Estado(String sigla, String nome) {
        Objects.requireNonNull(sigla);
        Objects.requireNonNull(nome);
        this.setSigla(sigla);
        this.setNome(nome);
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "sigla='" + sigla + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estado estado = (Estado) o;
        return Objects.equals(sigla, estado.sigla);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(sigla);
    }

    @Override
    public int compareTo(Estado o) {
        return this.getSigla().compareTo(o.getSigla());
    }
}
