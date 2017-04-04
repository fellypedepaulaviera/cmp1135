/**
 * Exercicio 01.
 */
package exemplos.segundalista;

import java.util.ArrayList;

import exemplos.primeiralista.Animal;
import exemplos.primeiralista.Boi;
import exemplos.primeiralista.Cachorro;
import exemplos.primeiralista.Sapo;


public class TestaAnimais {
	public static void main(String args[]) {
		ArrayList<Animal> componentes = new ArrayList<Animal>();

		componentes.add(new Sapo(2));
		componentes.add(new Cachorro(9));
		componentes.add(new Boi(15));
		/*
		 * Exercicio 01.
		 */
		exibeSonsAnimais(componentes);
		/*
		 * Exercicio 02.
		 */
		ExibeSomAnimal esa = new ExibeSomAnimal();
		executaOperacao(componentes, esa);		
	}
	private static void exibeSonsAnimais(ArrayList<Animal> animais) {
		for(Animal animal : animais) {
			System.out.println(animal.getClass().getSimpleName() + ", Som: " + animal.Som());
		}
	}
	
	private static void executaOperacao(ArrayList<Animal> as, Operacao op) {
		int soma = 0;
		for(Animal a : as) {
			op.executa(a);
			soma += a.getIdadeMedia();
		}
		/*
		 * Exercicio 03.
		 */
		System.out.println(soma / as.size());
	}
}
