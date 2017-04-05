package exemplos.segundalista;

import exemplos.primeiralista.Animal;

public class ExibeSomAnimal implements Operacao {

	@Override
	public void executa(Object obj) {
		System.out.println(((Animal)obj).Som());
	}

}
