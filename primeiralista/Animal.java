/**
 * Exercicio 01.
 */
package exemplos.primeiralista;

public class Animal {
	
	int idadeMedia;
	
	public Animal() {}
	
	public Animal(int idade) {
		this.idadeMedia = idade;
	}
	
	public int idadeMedia() {
		return idadeMedia;
	}
	
	public int getIdadeMedia() {
		return idadeMedia;
	}

	public void setIdadeMedia(int idadeMedia) {
		this.idadeMedia = idadeMedia;
	}

	public String Som() {
		return "Voz produzida pelo animal.";
	}
}