package aula12;

public class Mamifero extends Animal {
    // Atributos
    private String corPelo;
    
    // Métodos abstratos a serem definidos
    @Override
    public void locomover() {
        System.out.println("Mamifero andando");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }
    
    // Métodos especiais
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
