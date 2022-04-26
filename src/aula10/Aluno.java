package aula10;

public class Aluno extends Pessoa {
    private boolean matricula;
    private String curso;

    // Método construtor (baseado na classe Super)
    public Aluno(String nome, int idade, char sexo) {
        super(nome, idade, sexo);
    }

    // Métodos
    public void cancelarMatricula() {
        if (this.isMatricula()) {
            this.setMatricula(false);
        } else {
            System.out.println("Você não está matriculado em nenhum curso");
        }
    }

    // Métodos especiais
    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
