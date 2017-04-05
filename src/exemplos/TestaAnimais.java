package exemplos;

public class TestaAnimais {
	public static void main(String[] args) {
		Animal[] animais = new Animal[3];
		animais[0] = new Sapo(2,1,"Pururu");
		animais[1] = new Boi(10,400,"Jeff");
		animais[2] = new Cachorro(3,10,"Toto");
		for (int i = 0; i < animais.length; i++) {
			System.out.println(animais[i].getClass().getName() + " : " + animais[i].som() + " idade do animal : " + animais[i].getIdade());
		}
	}
}
