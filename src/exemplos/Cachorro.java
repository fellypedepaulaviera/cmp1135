package exemplos;

public class Cachorro extends Animal {
	/*
	 * Construtor
	 */
	public Cachorro(int idade) {
		this.idade = idade;
	}

	public Cachorro(int idade, double peso, String nome) {
		this.idade = idade;
		this.peso = peso;
		this.nome = nome;
	}

	public String som() {
		return "latir";
	}
}
