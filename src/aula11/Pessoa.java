package aula11;

public abstract class Pessoa {
    // Atributos
    private String name;
    private int idade;
    private char sexo;

    // Construtor
    public Pessoa(String name, int idade, char sexo) {
        this.name = name;
        this.idade = idade;
        this.sexo = sexo;
    }

    // Métodos
    public final void fazerAniversario() {
        this.setIdade(this.getIdade() + 1);
    }

    // Métodos especiais
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
