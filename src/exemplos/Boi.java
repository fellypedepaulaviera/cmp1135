package exemplos;

public class Boi extends Animal {
	/*
	 * Contrutor
	 */
	public Boi(int idade) {
		this.idade = idade;
	}
	
	public Boi(int idade, double peso, String nome) {
		this.idade = idade;
		this.peso = peso;
		this.nome = nome;
	}

	public String som() {
		return "mugir";
	}
	public int getIdade() {
		return idade;
	}
}
