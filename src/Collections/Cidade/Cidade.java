package Collections.Cidade;

import java.util.Objects;

public class Cidade implements Comparable<Cidade> {

    private int codigoIbge;
    private String nome;
    private int totalHabitantes;

    public Cidade(int codigoIbge, String nome, int totalHabitantes) {
        this.codigoIbge = codigoIbge;
        this.nome = nome;
        this.totalHabitantes = totalHabitantes;
    }

    public int getCodigoIbge() {
        return codigoIbge;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "codigoIbge=" + codigoIbge +
                ", nome='" + nome + '\'' +
                ", totalHabitantes=" + totalHabitantes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidade = (Cidade) o;
        return codigoIbge == cidade.codigoIbge;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoIbge);
    }

    @Override
    public int compareTo(Cidade o) {
        // Fiz a implementação manual até para me desafiar se consegui entender como sobreescrever o compareTo
        // Mas uma implementação mais legivel e que a IDE recomendou foi -> Integer.compare(this.getCodigoIbge(), o.getCodigoIbge());
        if (this.getCodigoIbge() < o.getCodigoIbge()) return -1;
        else if (this.getCodigoIbge() > o.getCodigoIbge()) return 1;
        else return 0;
    }
}
