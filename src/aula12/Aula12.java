package aula12;

public class Aula12 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Peixe p = new Peixe();
        
        m.setCorPelo("Preto");
        m.setIdade(13);
        m.emitirSom();
        m.alimentar();
        
        p.setIdade(4);
        p.setCorEscama("Preto");
        p.soltarBolha();
        p.locomover();
    }
    
}
