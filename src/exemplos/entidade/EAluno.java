package exemplos.entidade;

public class EAluno {
	
	private int id;
	private String nome;
	private double n1;
	private double n2;
	
	public EAluno() {		
		this.id = 0;
		this.nome = new String();;
		this.n1 = 0;
		this.n2 = 0;
	}
	
	public EAluno(int id, String nome, double n1, double n2) {
		this.id = id;
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
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
