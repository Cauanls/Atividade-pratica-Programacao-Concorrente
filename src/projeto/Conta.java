package projeto;

public class Conta {
	private Cliente cliente;
    private double saldo;

    public Conta(Cliente cliente, double saldoInicial) {
        this.cliente = cliente;
        this.saldo = saldoInicial;
        if (cliente != null) {
            cliente.setConta(this);
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void creditar(double valor) {
        saldo += valor;
    }

    public void debitar(double valor) {
        saldo -= valor;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
