package projetoVinho;

public class Vinho {
    // Atributos
    private String nome;
    private String tipo;
    private double preco;
    private int safra;

    // Métodos
    @Override
    public String toString() {
        return "Vinho{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", preco=" + preco +
                ", safra=" + safra +
                '}';
    }

    public boolean verificaPreco() {
        return this.preco < 25;
    }

    // Métodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getSafra() {
        return safra;
    }

    public void setSafra(int safra) {
        this.safra = safra;
    }
}
