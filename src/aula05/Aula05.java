package aula05;

public class Aula05 {
    public static void main(String[] args) {
        Banco p1 = new Banco();

        p1.abrirConta("CP");
        p1.sacar(160);
        p1.depositar(10);

        p1.fecharConta();
    }
}
