package entidade;

public class Account {

    private int numeroConta;
    private String nome;
    private double saldo;
    private double limiteChequeEspecial;


    public Account(int numeroConta, String nome, double valorDepositado) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = valorDepositado;

        if(valorDepositado <= 500.0) {
            this.limiteChequeEspecial = 50.0;
        }else {
            this.limiteChequeEspecial = valorDepositado * 0.50;
        }

    }

    public void consultarSaldo() {
        System.out.println("\n=== CONSULTA DE SALDO ===");
        System.out.println("Conta: " + this.numeroConta + " | Titular: " + this.nome);
        System.out.println("Saldo Atual: R$ " + String.format("%.2f", this.saldo));
    }

    public void consultarChequeEspecial() {
        double valorUsado = isUsandoChequeEspecial() ? Math.abs(this.saldo) : 0.0;
        double limiteDisponivel = this.limiteChequeEspecial - valorUsado;

        System.out.println("\n=== CHEQUE ESPECIAL ===");
        System.out.println("Limite Total: R$ " + String.format("%.2f", this.limiteChequeEspecial));
        System.out.println("Valor em Uso: R$ " + String.format("%.2f", valorUsado));
        System.out.println("Limite Disponível: R$ " + String.format("%.2f", limiteDisponivel));
    }

    public boolean isUsandoChequeEspecial() {
        return this.saldo < 0;
    }

    public void depositar(double valor) {
        if (valor <= 0.0) {
            System.out.println("O valor de depósito precisa ser maior que zero!");
            return;
        }

        if (isUsandoChequeEspecial()) {
            double dividaChequeEspecial = Math.abs(this.saldo);
            double taxa = dividaChequeEspecial * 0.20;

            System.out.println("Cobrando taxa de 20%% pelo uso do cheque especial: R$ " + taxa);
            this.saldo -= taxa;
        }

        this.saldo += valor;
        System.out.printf("Depósito de R$ %.2f efetuado! Saldo atual: R$ %.2f\n", valor, this.saldo);
    }

    public void sacar(double valor){
        if (valor <= 0) {
            System.out.println("Valor de saque inválido!");
            return;
        }

        if (this.saldo + this.limiteChequeEspecial >= valor) {
            this.saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso!\n", valor);
        } else {
            System.out.println("Saldo e limite insuficientes para realizar o saque.");
        }
    }

    public void pagarBoleto(double valorBoleto) {
        if (valorBoleto <= 0) {
            System.out.println("Valor do boleto inválido");
            return;
        }

        if (this.saldo + this.limiteChequeEspecial >= valorBoleto) {
            this.saldo -= valorBoleto;
            System.out.printf("Boleto de R$ %.2f pago com sucesso!\n", valorBoleto);
        }else {
            System.out.println("Saldo e limite insuficientes para pagar o boleto.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double chequeEspecial) {
        this.limiteChequeEspecial = chequeEspecial;
    }

}
