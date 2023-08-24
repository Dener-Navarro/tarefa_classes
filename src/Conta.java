public class Conta {

    private String numeroConta;
    private double saldo;

    // Método getter para o número da conta
    public String getNumeroConta() {
        return numeroConta;
    }

    // Método setter para o número da conta
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    // Método getter para o saldo
    public double getSaldo() {
        return saldo;
    }

    // Método setter para o saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static void main(String[] args) {

        Conta minhaConta = new Conta();

        minhaConta.setNumeroConta("1245-6");
        minhaConta.setSaldo(500.0);

        System.out.println("Número da Conta: " + minhaConta.getNumeroConta());
        System.out.println("Saldo Atual: " + minhaConta.getSaldo());
    }
}
