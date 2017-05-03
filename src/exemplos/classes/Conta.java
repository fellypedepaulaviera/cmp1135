package exemplos.classes;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;

public class Conta {	
	/*
	 * Atributos da classe Conta
	 */
	private int numero;	
	private Cliente cliente;
	private ArrayList<Transacao> transacoes = new ArrayList<Transacao>();		
	/**
	 * Construtor da classe Conta
	 * @param cliente
	 */
	public Conta(Cliente cliente) {
		this.cliente = cliente;
	}		
	/**
	 * @return the numero
	 */
	public int getNumeroConta() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumeroConta(int numero) {
		this.numero = numero;
	}
	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	/**
	 * getSaldo - retorna o saldo baseado em todas as transacoes da conta
	 * @return double
	 */
	public double getSaldo() {
		double saldo = 0.0;
		for(Transacao transacao:transacoes) {
			saldo += transacao.getValor();
		}
		return saldo;
	}
	/**
	 * mostrarExtrato da conta
	 */
	public void mostrarExtrato() {
		double saldo = 0.0;
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		for(Transacao transacao:transacoes) {
			saldo += transacao.getValor();
			System.out.println(transacao.toString() + "\t(" + nf.format(saldo) + ")");
		}
	}
	/**
	 * deposito - realiza uma transacao de deposito na conta
	 * @param valor
	 */
	public void deposito(double valor) {
		Transacao transacao = new Transacao();
		transacao.setDataHora(new Date());
		transacao.setDescricao("Deposito");
		transacao.setValor(valor);
		transacoes.add(transacao);
	}
	/**
	 * deposito - realiza uma transacao na conta
	 * @param valor
	 */
	private void depositoTransferencia(Transacao transacao) {
		transacoes.add(transacao);
	}
	/**
	 * saque - realiza uma transacao de saque na conta
	 * @param valor
	 */
	public void saque(double valor) {
		Transacao transacao = new Transacao();
		transacao.setDataHora(new Date());
		transacao.setDescricao("Saque");
		transacao.setValor(-valor);
		transacoes.add(transacao);
	}
	/**
	 * transferencia - realiza uma transferencia entre contas
	 * @param contaDestino
	 * @param valor
	 */
	public void transferencia(Conta contaDestino, double valor) {
		// Registra transacao na conta origem
		Transacao transacaoContaOrigem = new Transacao();
		transacaoContaOrigem.setDataHora(new Date());
		transacaoContaOrigem.setDescricao("Transferencia " + contaDestino.getNumeroConta());
		transacaoContaOrigem.setValor(-valor);
		this.depositoTransferencia(transacaoContaOrigem);
		// Registra transacao na conta destino
		Transacao transacaoContaDestino = new Transacao();
		transacaoContaDestino.setDataHora(new Date());
		transacaoContaDestino.setDescricao("Transferencia " + this.getNumeroConta());
		transacaoContaDestino.setValor(valor);
		contaDestino.depositoTransferencia(transacaoContaDestino);
	}
	
}
