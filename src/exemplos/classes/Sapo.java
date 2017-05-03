package exemplos.classes;

public class Sapo extends Animal {
	public Sapo(int idade) {
		this.idade = idade;
	}
	public Sapo(int idade, double peso, String nome) {
		this.idade = idade;
		this.peso = peso;
		this.nome = nome;
	}
	public String som() {
		return "coaxar";
	}
}
