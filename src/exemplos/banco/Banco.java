package exemplos.banco;

import java.util.ArrayList;

public class Banco {
	/*
	 * Atributos da classe Banco
	 */
	private int numero;
	private String nome;
	private ArrayList<Agencia> agencias = new ArrayList<Agencia>();

	/**
	 * Construtor da classe Banco
	 * 
	 * @param numero
	 * @param nome
	 */
	public Banco(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	/**
	 * Adiciona uma agencia ao banco
	 * 
	 * @param agencia
	 */
	public void adicionarAgencia(Agencia agencia) {
		this.agencias.add(agencia);
	}

	/**
	 * Prova N1 - Java Orientado a Objetos.
	 * 
	 * Mostrar extrato de uma conta de uma determinada agencia. Implemente este
	 * metodo, ele deve percorrer o Array de agencias, e encontrar o
	 * numeroAgenciaProcurada, quando encontrar deve percorrer o Array de contas
	 * e encontrar o numeroContaProcurada, quando encontrar, deve mostrar o
	 * extrato da conta. Se nao encontrar a agencia, deve mostrar a mensagem
	 * "Agencia nao encontrada", e se nao encontrar a conta, deve mostrar a
	 * mensagem "Conta nao encontrada".
	 */
	public void mostrarExtratoContaAgencia(int numeroAgenciaProcurada, int numeroContaProcurada) {
		boolean achouAgencia = false;
		boolean achouConta = false;
		for(Agencia agencia:agencias) {
			if (agencia.getNumero() == numeroAgenciaProcurada) {
				achouAgencia = true;
				for(Conta conta:agencia.getContas()) {
					if (conta.getNumeroConta() == numeroContaProcurada) {
						achouConta = true;
						conta.mostrarExtrato();
					}
				}
			}
		}
		if (!achouAgencia) {
			System.out.println("Agencia nao encontrada");
		} else {
			if (!achouConta) {
				System.out.println("Conta nao encontrada");
			}
		}
	}
}
