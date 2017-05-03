package exemplos.classes;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

import sun.util.locale.provider.CurrencyNameProviderImpl;

public class Transacao {
	/*
	 * Atributos da classe Transacao
	 */
	private Date dataHora;
	// Classe usada para definir o formato de como a data podera ser mostrada.
	private SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyy hh:mm:ss");
	private NumberFormat nf = NumberFormat.getCurrencyInstance();
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
		return formatoData.format(this.getDataHora()) + "\t" + this.descricao + "\n\t\t\t\t" + nf.format(this.getValor());
	}

}
