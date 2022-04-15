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
        setStatus(true);
        setTipo(t);

        if (t.equals("CC")) {
            setSaldo(50);
        } else if (t.equals("CP")) {
            setSaldo(150);
        } else {
            System.out.println("Por favor, informe um tipo de conta válido!");
        }
    }


    public void fecharConta() {
        if (getSaldo() == 0) {
            System.out.println("Fechando sua conta");
            setStatus(false);
        } else if (getSaldo() > 0) {
            System.out.printf("Ainda há R$%.2f na sua conta. Por favor, deposite esse valor antes!", getSaldo());
        } else {
            System.out.printf("Você está devendo R$%.2f para o banco. Por favor, deposite esse valor antes!",getSaldo() * (-1));
        }
    }


    public void depositar(float qnt) {
        if (getStatus()) {
           setSaldo(getSaldo() + qnt);
        } else {
            System.out.println("Por favor, abra sua conta antes.");
        }
    }


    public void sacar(float qnt) {
        if (getStatus()) {
            setSaldo(getSaldo() - qnt);
        } else {
            System.out.println("Por favor, abra sua conta antes.");
        }
    }


    public void pagarMensal() {
        if (getTipo().equals("CC")) {
           setSaldo(getSaldo() - 12);
        } else {
            setSaldo(getSaldo() - 20);
        }
    }
}
