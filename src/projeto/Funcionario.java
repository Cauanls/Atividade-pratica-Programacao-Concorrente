package projeto;

public class Funcionario extends Thread {
    private String nome;
    private Conta contaSalario;
    @SuppressWarnings("unused")
    private Conta contaInvestimento;

    public Funcionario(String nome, Conta contaSalario, Conta contaInvestimento) {
        this.nome = nome;
        this.contaSalario = contaSalario;
        this.contaInvestimento = contaInvestimento;
    }

    public Funcionario(String string, Loja loja, Conta contaSalario2, Conta contaInvestimento2) {
    }

    public void run() {
        Banco banco = Banco.getInstance();
        while (true) {
            synchronized (contaSalario) {
                if (contaSalario.getSaldo() >= 1400) {
                    banco.transferir(Cliente.getConta(), contaSalario, 1400);
                    contaSalario.debitar(1400);
                    System.out.println(nome + " recebeu seu salário de R$ 1400,00");
                }
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
