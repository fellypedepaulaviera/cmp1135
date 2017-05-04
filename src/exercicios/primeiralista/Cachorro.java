/**
 * Exercicio 03.
 */
package exercicios.primeiralista;

public class Cachorro extends Animal {
	
	public Cachorro() {}
	
	public Cachorro(int idade) {
		super(idade);
	}
	
	public String Som() {
		return "latir";
	}
}
