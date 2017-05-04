package exercicios.terceiralista;

public class TestaLivro {
		
	public static void main(String args[]) {
		/**
		 * Exercicio 03
		 */
		Livro livroPrimeiroLugar = new Livro();
		Livro livroSegundoLugar = new Livro();
		Livro livroTerceiroLugar = new Livro();
		livroPrimeiroLugar.setAutor("Michael Pollan");
		livroPrimeiroLugar.setTitulo("Food Rules: An Eater's Manual");
		livroPrimeiroLugar.setEditora("Penguin");
		livroPrimeiroLugar.setAno(2009);
		livroSegundoLugar.setAutor("Alicia Silverstone");
		livroSegundoLugar.setTitulo("The Kind Diet: A Simple Guide to Feeling Great, Losing Weight, and Saving the Planet");
		livroSegundoLugar.setEditora("Rodale Books");
		livroSegundoLugar.setAno(2009);
		livroTerceiroLugar.setAutor("J.D. Salinger");
		livroTerceiroLugar.setTitulo("The Catcher in the Rye");
		livroTerceiroLugar.setEditora("Back Bay Books");
		livroTerceiroLugar.setAno(2001);
		/**
		 * Exercicio 05
		 */
		System.out.println(livroPrimeiroLugar.toString());
		System.out.println(livroSegundoLugar.toString());
		System.out.println(livroTerceiroLugar.toString());		
	}

}
