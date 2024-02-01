package PooBancoExercicio;

public class ContaBanco {
    // ATRIBUTOS declarados

    public int numConta;     // inteiro
    protected String tipo;   // caractere
    private String dono;     // caractere
    private float saldo;     // real
    private boolean status; //  logico

    // mostrar objetos
    public void estadoAtual() {
        System.out.println("------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status da conta: " + this.getStatus());
    }

    //metodos personalizado
    public void abrirConta(String t) {

        this.setTipo(t);
        this.setStatus(true);

        if ("CC".equals(t)) {
            //forma pelo atributo,
            //this.saldo = 50;
            // ou
            //this.setSaldo(50);  **forma pelo metodo
            // obs: sempre da preferencia pela forma do metodo

            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {

        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");

        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada pois tem debito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            //this.saldo = this.saldo + v; **pode ser usado assim tambem
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma conta fechada");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saqur realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque ");
            }

        } else {
            System.out.println("Impossivel sacar de uma conta fechada!");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12;
        } else if ("cp".equals(this.getTipo())) {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossivel pagar uma conta fechada");
        }
    }

    //metodos especiais
    // construtor obs: colocar mesmo nome da classe
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public int getNumConta() {
        return this.numConta;
    }

    protected void setTipo(String t) {
        this.tipo = t;
    }

    protected String getTipo() {
        return this.tipo;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public String getDono() {
        return this.dono;
    }

    private void setSaldo(float s) {
        this.saldo = s;
    }

    private float getSaldo() {
        return this.saldo;
    }

    private void setStatus(boolean a) {
        this.status = a;
    }

    private boolean getStatus() {
        return this.status;
    }

}
