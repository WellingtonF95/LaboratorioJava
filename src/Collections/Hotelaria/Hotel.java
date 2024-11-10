package Collections.Hotelaria;

public class Hotel {

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
        return cidade.equals(hotel.cidade);
    }

    @Override
    public int hashCode() {
        int result = nome.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", precoDiaria=" + precoDiaria +
                '}';
    }
}
