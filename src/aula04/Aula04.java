package aula04;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic", "Roxo", 0.3f);
        c1.status();

        System.out.printf("Tenho uma caneta %s de ponta %.1f", c1.getModelo(), c1.getPonta());
    }
}
