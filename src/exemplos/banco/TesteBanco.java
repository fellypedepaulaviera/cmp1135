package exemplos.banco;

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
		 * Cria um objeto conta1 do tipo Conta.
		 * O contrutor recebe como parametro o objeto cliente1
		 */
		Conta conta1 = new Conta(cliente1);
		/*
		 * Adiciona a conta1 a agencia1
		 */
		agencia1.adicionarConta(conta1);
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
		 * Mostra na tela o extrado da conta (objeto conta1)
		 */
		conta1.mostrarExtrato();	
	}

}
