package exemplos.banco;

import java.util.ArrayList;

public class Agencia {	
	/*
	 * Atributos da classe Agencia
	 */	
	private int numero;
	private String nome;	
	private ArrayList<Conta> contas = new ArrayList<Conta>();	
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the contas
	 */
	public ArrayList<Conta> getContas() {
		return contas;
	}
	/**
	 * Construtor da classe Agencia
	 * @param numero
	 * @param nome
	 */
	public Agencia(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	/**
	 * @param conta the conta to add
	 */
	public void adicionarConta(Conta conta) {
		this.contas.add(conta);
	}
}
