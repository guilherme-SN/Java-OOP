package aula07_08;

import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Métodos
    public void marcarLuta(Lutador l1, Lutador l2) {
       if (l1.getCategoria().equals(l2.getCategoria()) && !(l1.equals(l2))) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
       } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
       }
    }

    public void lutar() {
        if (this.getAprovada()) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESADIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            switch (vencedor) {
               case 0: // Empate
                   System.out.println("Empatou");
                   this.desafiado.empatarLutar();
                   this.desafiante.empatarLutar();
                   break;

               case 1: // Desafiado ganhou
                   System.out.println(this.desafiado.getNome() + " ganhou");
                   this.desafiado.ganharLuta();
                   this.desafiante.perderLutar();
                   break;

               case 2: // Desafiante ganhou
                   System.out.println(this.desafiante.getNome() + " ganhou");
                   this.desafiado.perderLutar();
                   this.desafiante.ganharLuta();
                   break;
           }
        } else {
            System.out.println("Luta não pode acontecer");
        }
    }

    // Métodos especiais
    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return this.aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
