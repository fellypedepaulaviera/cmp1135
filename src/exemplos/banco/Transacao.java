package exemplos.banco;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transacao {
	/*
	 * Atributos da classe Transacao
	 */
	private Date dataHora;
	// Classe usada para definir o formato de como a data podera ser mostrada.
	private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyy hh:mm:ss");
	private String descricao;
	private double valor;	
	/**
	 * @return the dataHora
	 */
	public Date getDataHora() {
		return dataHora;
	}
	/**
	 * @param dataHora the dataHora to set
	 */
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/**
	 * @return the valor
	 */
	public double getValor() {
		return valor;
	}
	/**
	 * @param valor the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
	/**
	 * toString - sobrescreve o metodo toString da classe Object, 
	 * permitindo que a classe Transacao tenha seu proprio metodo toString.
	 * @return String
	 */
	public String toString() {
		return formato.format(this.getDataHora()) + "\t" + this.descricao + "\t\t" + this.getValor();
	}

}
