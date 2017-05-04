package exemplos.colecoes;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
	
public static void main(String[] args) {
		
		Set<String> cargos = new HashSet<String>();		
		cargos.add("Gerente");
		cargos.add("Diretor");
		cargos.add("Presidente");
		cargos.add("Secretária");
		cargos.add("Funcionário");
		cargos.add("Diretor"); // repetido!
		// imprime na tela todos os elementos
		System.out.println(cargos);	
		
	}

}
