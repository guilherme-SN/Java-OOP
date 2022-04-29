package aula11;

public class Aula11 {
    public static void main(String[] args) {
        Bolsista b1 = new Bolsista("Guilherme", 18, 'M', 12345, "CC", 1500);

        b1.fazerAniversario();
        b1.pagarMensalidade();
        b1.setIdade(23);
        System.out.println(b1.getIdade());
    }
}
