package projeto;

import projeto.Loja;
import projeto.Cliente;
import projeto.Conta;
import projeto.Funcionario;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {
        Loja.inicializarLojas();

        Cliente[] clientes = new Cliente[5];
        for (int i = 0; i < clientes.length; i++) {
            Conta conta = new Conta(null, 1000);
            clientes[i] = new Cliente("Cliente " + (i + 1), conta);
            clientes[i].start();
        }

        Loja.lojas[0] = new Loja("Loja A", new Conta(null, 0));
        Loja.lojas[1] = new Loja("Loja B", new Conta(null, 0));

        Funcionario[] funcionarios = new Funcionario[4];
        for (int i = 0; i < funcionarios.length; i += 2) {
            Conta contaSalario = new Conta(null, 0);
            Conta contaInvestimento = new Conta(null, 0);
            funcionarios[i] = new Funcionario("Funcionário " + (i + 1), contaSalario, contaInvestimento);
            funcionarios[i + 1] = new Funcionario("Funcionário " + (i + 2), contaSalario, contaInvestimento);
            funcionarios[i].start();
            funcionarios[i + 1].start();
        }
    }

}