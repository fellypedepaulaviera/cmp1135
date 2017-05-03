package exemplos.banco;

import exemplos.classes.Agencia;
import exemplos.classes.Banco;
import exemplos.classes.Cliente;
import exemplos.classes.Conta;

public class TesteBanco {
	
	public static void main(String... args) {
		/*
		 * Cria um objeto banco1 do tipo Banco
		 */
		Banco banco1 = new Banco(140,"Itau");		
		/*
		 * Cria um objeto agencia1 do tipo Agencia
		 */
		Agencia agencia1 = new Agencia(1960,"Nova Central");	
		/*
		 * Cria um objeto cliente1 do tipo Cliente
		 */
		Cliente cliente1 = new Cliente(12345678901l,"Heider");	
		/*
		 * Cria um objeto cliente1 do tipo Cliente
		 */
		Cliente cliente2 = new Cliente(12345678901l,"Pedro Henrique");	
		/*
		 * Cria um objeto conta1 do tipo Conta.
		 * O contrutor recebe como parametro o objeto cliente1
		 */
		Conta conta1 = new Conta(cliente1);
		conta1.setNumeroConta(1971);
		/*
		 * Cria um objeto conta1 do tipo Conta.
		 * O contrutor recebe como parametro o objeto cliente1
		 */
		Conta conta2 = new Conta(cliente2);
		conta2.setNumeroConta(2012);
		/*
		 * Adiciona a conta1 a agencia1
		 */
		agencia1.adicionarConta(conta1);
		/*
		 * Adiciona a conta2 a agencia1
		 */
		agencia1.adicionarConta(conta2);
		/*
		 * Adiciona a agencia1 ao banco1
		 */
		banco1.adicionarAgencia(agencia1);
		/*
		 * Realiza um deposito no objeto conta1
		 */
		conta1.deposito(10000);
		/*
		 * Realiza um saque no objeto conta1
		 */
		conta1.saque(100);
		/*
		 * Realiza um deposito no objeto conta1
		 */
		conta2.deposito(20000);
		/*
		 * Realiza um saque no objeto conta1
		 */
		conta2.saque(1005);
		/*
		 * Efetuar uma transferencia entre contas
		 */
		conta1.transferencia(conta2,  10000);
		/*
		 * Mostrar os extratos das contas
		 */
		System.out.println("Extrato conta " + conta1.getNumeroConta());
		conta1.mostrarExtrato();	
		System.out.println("Extrato conta " + conta2.getNumeroConta());
		conta2.mostrarExtrato();
		//System.out.println("Consulta Extrato Agencia 1960 conta 1971");
		//banco1.mostrarExtratoContaAgencia(1960, 1971);		
	}

}
