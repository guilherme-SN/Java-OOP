package aula14_15;

public class Gafanhoto extends Pessoa {
    // Atributos
    private int login;
    private int totAssistido;

    // Construtor
    public Gafanhoto(String nome, int idade, char sexo, int login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    // Métodos
    public void viuMaisUm() {
        this.setTotAssistido(this.getTotAssistido() + 1);
    }

    @Override
    public String toString() {
        /* return "Gafanhoto{" +
                "login=" + login +
                ", totAssistido=" + totAssistido +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                ", experiencia=" + experiencia +
                '}';
         Jeito melhor embaixo
         */
        return "Gafanhoto{" +
                super.toString() +
                "login=" + login +
                ", totAssistido=" + totAssistido +
                '}';
    }

    // Métodos especiais
    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
}
