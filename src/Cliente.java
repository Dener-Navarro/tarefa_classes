public class Cliente {
    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static void main(String[] args) {
        // Exemplo de uso das classes
        Cliente cliente = new Cliente();
        Conta minhaConta = new Conta();
// Informações do cliente e da conta
        cliente.setNome("João Silva");
        cliente.setCpf("456.897.123-45");
        minhaConta.setNumeroConta("1245-6");
        minhaConta.setSaldo(500.0);

        System.out.println("Dados do cliente: Nome: " + cliente.getNome() + ", CPF: " + cliente.getCpf());
        System.out.println("Dados da Conta: Número da Conta: " + minhaConta.getNumeroConta() + ", Saldo: " + minhaConta.getSaldo());
    }
}
