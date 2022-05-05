package aula12;

public class Ave extends Animal {
    // Atributos
    private String corPena;
    
    // Métodos abstratos
    @Override
    public void locomover() {
        System.out.println("Ave voando");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Ave comendo");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Ave emitindo som");
    }
    
    // Métodos
    public void fazerNinho() {
        System.out.println("Fazendo ninho");
    }
    
    // Métodos especiais
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
}
