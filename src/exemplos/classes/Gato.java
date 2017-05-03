package exemplos.classes;

public class Gato extends Animal{

	/*
	 * Contrutor
	 */
	public Gato(int idade) {
		this.idade = idade;
	}
	
	public Gato(int idade, double peso, String nome) {
		this.idade = idade;
		this.peso = peso;
		this.nome = nome;
	}

	public String som() {
		return "miar";
	}
	public int getIdade() {
		return idade;
	}
}
