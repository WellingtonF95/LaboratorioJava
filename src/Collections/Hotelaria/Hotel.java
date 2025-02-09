package Collections.Hotelaria;

import java.util.Objects;

public class Hotel implements Comparable<Hotel> {

    private String nome;
    private String cidade;
    private double precoDiaria;

    public Hotel() {
    }

    public Hotel(String nome, String cidade, double precoDiaria) {
        setNome(nome);
        setCidade(cidade);
        setPrecoDiaria(precoDiaria);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hotel hotel = (Hotel) o;
        return Objects.equals(nome, hotel.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public String toString() {
        return "Hotel {" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", precoDiaria=" + precoDiaria +
                '}';
    }

    /*Para ordenar por objetos personalizados que implementa a interface Comparble, deve-se implementar o metodo compareTo
    *onde é retornado um inteiro, indicando por:
    *
    * (-1) se o valor do objeto for menor que o valor do objeto recebido;
    * (1) se o valor do objeto for maior que o valor do objeto recebido;
    * (0) se o valor do objeto for igual ao valor do objeto recebido.
    *
    * A boa prática ao sobreescrever o compareTo é usar a(s) mesma(s) propriedade(s) a qual também estão sendo usadas no metodo
    * equals() e hasCode()
    *
    * Exemplo comparando por preço da diaria:
    *
    * Recomendado. O proprio Wrapper já possui um compare que realiza a comparação dos valores
      return Double.compare(this.getPrecoDiaria(), o.getPrecoDiaria());

      Tranforma em um Wrapper e depois usa chama o compareTo que existe no proprio Wrapper e faz a comparação
      return Double.valueOf(getPrecoDiaria()).compareTo(o.getPrecoDiaria());

      Forma manual. Não recomendada pois pode causar confusão durante a sobrescrita
      if (this.getPrecoDiaria() < o.getPrecoDiaria()) return -1;
      else if (this.getPrecoDiaria() > o.getPrecoDiaria()) return 1;
      else return 0;
    *
    * */

    @Override
    public int compareTo(Hotel o) {
        return this.getNome().compareTo(o.getNome());
    }
}
