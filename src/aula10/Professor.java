package aula10;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    // Método construtor (baseado na classe Super)
    public Professor(String nome, int idade, char sexo) {
        super(nome, idade, sexo);
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
