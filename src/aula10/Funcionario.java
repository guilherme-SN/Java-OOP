package aula10;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    // Método construtor (baseado na classe Super)
    public Funcionario(String nome, int idade, char sexo) {
        super(nome, idade, sexo);
    }

    // Métodos
    public void mudarTrabalhando() {
        this.setTrabalhando(!this.isTrabalhando());
    }

    // Métodos especiais
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
