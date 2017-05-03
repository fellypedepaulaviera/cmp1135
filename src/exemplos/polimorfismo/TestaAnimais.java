package exemplos.polimorfismo;

import exemplos.classes.Animal;
import exemplos.classes.Boi;
import exemplos.classes.Cachorro;
import exemplos.classes.Sapo;

public class TestaAnimais {
	static public void main(String... args) {
		Animal[] animais = new Animal[3];
		animais[0] = new Sapo(2,1,"Pururu");
		animais[1] = new Boi(10,400,"Jeff");
		animais[2] = new Cachorro(3,10,"Toto");
		for (int i = 0; i < animais.length; i++) {
			System.out.println(animais[i].getClass().getName() + " : " + animais[i].som() + " idade do animal : " + animais[i].getIdade());
		}
	}
}
