# Atividade-pratica-Programacao-Concorrente

Este é um projeto Java que simula um sistema bancário utilizando threads e os conceitos de concorrência. O sistema é composto por várias entidades, incluindo bancos, lojas, funcionários, clientes e contas.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Funcionalidades do Sistema

O sistema possui as seguintes funcionalidades:

Banco: Gerencia as transações e garante a consistência dos saldos das contas.

Loja: Possui uma conta para receber pagamentos dos clientes e pagar salários aos funcionários.

Funcionário: Recebe salário da loja e investe parte do salário em uma conta de investimentos.

Cliente: Realiza compras alternando entre lojas até o saldo da conta ser esgotado.

Conta: Gerencia o saldo do cliente e do funcionário.

Configuração do Projeto
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

O projeto está estruturado da seguinte forma:

Main.java: Arquivo principal que inicia o sistema.

Banco.java: Classe que representa o banco e gerencia as transações.

Loja.java: Classe que representa as lojas e suas contas.

Funcionario.java: Classe que representa os funcionários e suas contas.

Cliente.java: Classe que representa os clientes e suas contas.

Conta.java: Classe que representa as contas dos clientes e funcionários.
