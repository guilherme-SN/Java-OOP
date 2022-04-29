package aula11;

public class Aluno extends Pessoa {
    // Atributos
    private int matricula;
    private String curso;

    // Construtor
    public Aluno(String nome, int idade, char sexo, int matricula, String curso) {
        super(nome, idade, sexo);
        this.setMatricula(matricula);
        this.setCurso(curso);
    }

    // Métodos
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do Aluno");
    }

    // Métodos especiais
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
