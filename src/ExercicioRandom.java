package exemplos;

import java.util.Random;

public class ExercicioRandom {

	public static void main(String[] args) {
		Random r = new Random();
		int max = 10;
		int min = 5;		
		int numero = r.nextInt(max - min + 1)+min;
		System.out.println(numero);
	}

}
