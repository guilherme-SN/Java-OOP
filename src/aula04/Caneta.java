package aula04;

public class Caneta {
    private String modelo;
    public String cor;
    private float ponta;
    public boolean tampada;

    public Caneta(String m, String c, float p) {
        this.tampar();
        setModelo(m);
        setCor(c);
        setPonta(p);

    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
       this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void status() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada: " + this.tampada);
    }
}
