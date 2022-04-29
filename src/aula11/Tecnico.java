package aula11;

public class Tecnico extends Aluno {
    // Atributos
    private int registroProfissional;

    // Construtor
    public Tecnico(String nome, int idade, char sexo, int matricula, String curso, int registroProfissional) {
        super(nome, idade, sexo, matricula, curso);
        this.registroProfissional = registroProfissional;
    }

    // Métodos
    public void praticar() {
        System.out.println("Praticando...");
    }

    // Métodos especiais
    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
