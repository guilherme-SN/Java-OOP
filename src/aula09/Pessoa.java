package aula09;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private char sexo;

    // Construtor
    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // Métodos
    public void fazerAniversario() {
        System.out.println("Feliz Aniversário!!!");
        this.setIdade(this.getIdade() + 1);
    }

    // Métodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
