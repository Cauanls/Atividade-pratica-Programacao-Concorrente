package projeto;

public class Loja {
	@SuppressWarnings("unused")
    private String nome;
    private Conta conta;
    public static Loja[] lojas = new Loja[2];

    public Loja(String nome, Conta conta) {
        this.nome = nome;
        this.conta = conta;
    }

    public void realizarCompra(Cliente cliente, double valor) {
        Banco banco = Banco.getInstance();
        banco.transferir(Cliente.getConta(), conta, valor);
    }

    public static void inicializarLojas() {
        lojas[0] = new Loja("Loja A", new Conta(null, 0));
        lojas[1] = new Loja("Loja B", new Conta(null, 0));
    }
}
