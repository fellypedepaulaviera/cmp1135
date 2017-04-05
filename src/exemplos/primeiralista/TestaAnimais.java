/**
 * Exercicio 05.
 */
package exemplos.primeiralista;

import java.util.ArrayList;

public class TestaAnimais {
	public static void main(String args[]) {
		/*
		 * Exercicio 05.1
		 */
		ArrayList<Animal> componentes = new ArrayList<Animal>();
		/*
		 * Exercicio 05.2
		 */
		componentes.add(new Sapo());
		componentes.add(new Cachorro());
		componentes.add(new Boi());
		/*
		 * Exercicio 05.3
		 */
		for(Animal animal : componentes) {
			System.out.println(animal.getClass().getSimpleName() + ", Som: " + animal.Som());
		}
	}
}
