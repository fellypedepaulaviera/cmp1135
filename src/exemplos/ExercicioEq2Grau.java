package exemplos;

public class ExercicioEq2Grau {
	public static void main(String[] args) {
		String resultado = equacao2Grau(1,-5,2);
		System.out.println(resultado);
	}
	/*
	 * Calcula Equacao do 2o. grau 
	 * Delta = (b*b) - 4 * a * c
	 * X' = (-b + Raiz(Delta)) / 2 * a
	 * X" = (-b - Raiz(Delta)) / 2 * a 
	 * 
	 */
	private static String equacao2Grau(int a, int b, int c) {
		double delta = 0;
		double x1 = 0;
		double x2 = 0;
		delta = Math.pow(b, 2) - 4 * a * c;
		if (delta >= 0) {
			x1 = (-b + Math.sqrt(delta)) / 2*a;
			x2 = (-b - Math.sqrt(delta)) / 2*a;	
			return "Delta = " + delta + "\n" + "X1 = " + x1 + "\n" + "X2 = " + x2;
		} else {
			return "Delta = " + delta + " Nao existem reaizes reais para Delta negativo.";
		}
	}

}
