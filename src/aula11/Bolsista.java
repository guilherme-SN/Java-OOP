package aula11;

public class Bolsista extends Aluno {
    // Atributos
    private int bolsa;

    // Construtor
    public Bolsista(String nome, int idade, char sexo, int matricula, String curso, int bolsa) {
        super(nome, idade, sexo, matricula, curso);
        this.setBolsa(bolsa);
    }

    // Métodos
    public void renovarBolsa() {
        System.out.println("Renovando bolsa do aluno");
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do Bolsista");
    }

    // Métodos especiais
    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}
