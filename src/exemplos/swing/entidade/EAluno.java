package exemplos.swing.entidade;

public class EAluno {
	
	private String nome;
	private double n1;
	private double n2;
	
	public EAluno() {
		
	}
	
	public EAluno(String nome, double n1, double n2) {
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
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
	 * @return the n1
	 */
	public double getN1() {
		return n1;
	}
	/**
	 * @param n1 the n1 to set
	 */
	public void setN1(double n1) {
		this.n1 = n1;
	}
	/**
	 * @return the n2
	 */
	public double getN2() {
		return n2;
	}
	/**
	 * @param n2 the n2 to set
	 */
	public void setN2(double n2) {
		this.n2 = n2;
	}
	
	public double getMedia() {
		return (this.getN1() + this.getN2())/2;
	}
	
	public String toString() {
		return this.getNome()+"\n"+this.getN1()+"\n"+this.getN2()+"\n"+this.getMedia();
	}
	

}
