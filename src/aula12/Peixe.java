package aula12;

public class Peixe extends Animal {
    // Atributos
    private String corEscama;
    
    // Métodos abstratos
    @Override
    public void locomover() {
        System.out.println("Peixe nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Peixe comendo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não emite som");
    }
    
    // Métodos
    public void soltarBolha() {
        System.out.println("Soltando bolhas");
    }
    
    // Métodos especiais
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
