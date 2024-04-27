package projeto;

public class Cliente extends Thread{
	private String nome;
    private static Conta conta;

    public Cliente(String nome, Conta conta) {
        this.nome = nome;
        Cliente.conta = conta;
        conta.setCliente(this);
    }
    
    public Cliente(String nome, double saldoInicial) {
        this.nome = nome;
        Cliente.conta = new Conta(this, saldoInicial);
    }

    public String getNome() {
        return nome;
    }

    public static Conta getConta() {
        return conta;
    }
    
    public void setConta(Conta conta) {
        Cliente.conta = conta;
    }
    public void run() {
        while (conta.getSaldo() > 0) {
            double valor = Math.random() < 0.5 ? 100 : 200;
            Loja.lojas[(int) (Math.random() * Loja.lojas.length)].realizarCompra(this, valor);
        }
    }
}
