package aula12;

public class Reptil extends Animal {
    // Atributos
    private String corEscama;
    
    // Métodos abstratos
    @Override
    public void locomover() {
        System.out.println("Reptil andando");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Reptil comendo");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Reptil emitindo som");
    }
    
    // Métodos especiais
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
