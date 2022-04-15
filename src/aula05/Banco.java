package aula05;

public class Banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Banco() {
        setSaldo(0);
        setStatus(false);
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public void abrirConta(String t) {
        this.setStatus(true);
        this.setTipo(t);

        if (t.equals("CC")) {
            this.setSaldo(50);
        } else if (t.equals("CP")) {
            this.setSaldo(150);
        } else {
            System.out.println("Por favor, informe um tipo de conta válido!");
        }
    }


    public void fecharConta() {
        if (this.getSaldo() == 0) {
            System.out.println("Fechando sua conta");
            this.setStatus(false);
        } else if (this.getSaldo() > 0) {
            System.out.printf("Ainda há R$%.2f na sua conta. Por favor, deposite esse valor antes!", this.getSaldo());
        } else {
            System.out.printf("Você está devendo R$%.2f para o banco. Por favor, deposite esse valor antes!", this.getSaldo() * (-1));
        }
    }


    public void depositar(float qnt) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + qnt);
        } else {
            System.out.println("Por favor, abra sua conta antes.");
        }
    }


    public void sacar(float qnt) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - qnt);
        } else {
            System.out.println("Por favor, abra sua conta antes.");
        }
    }


    public void pagarMensal() {
        if (this.getTipo().equals("CC")) {
            this.setSaldo(this.getSaldo() - 12);
        } else {
            this.setSaldo(this.getSaldo() - 20);
        }
    }
}
