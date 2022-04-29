package aula11;

public class Professor extends Pessoa {
    // Atributos
    private String especialidade;
    private float salario;

    // Construtor
    public Professor(String name, int idade, char sexo, String especialidade, float salario) {
        super(name, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    // Métodos
    public void receberAumento(float aumento) {
        this.setSalario(this.getSalario() + aumento);
    }

    // Métodos especiais
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
