/**
 * Resolucao do Exercicio 01 - Lista de metodos.
 */
package exemplos;

/**
 * @author Heider
 *
 */
public class Exercicio01 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double resultado = soma(1000);
		System.out.println("Resultado = " + resultado);
	}
	/*
	 * Formula do Exercicio 01:
	 * S = 1000/1 + 997/2 - 994/3 + ...
	 */
	private static double soma(double valor) {
		double resultado = 0;
		double denominador = 1;
		double sinal = 1;
		for(double numerador = valor;numerador>=0;numerador-=3) {
			resultado += (numerador/denominador) * (sinal);
			denominador++;
			sinal = sinal * (-1);
		}
		return resultado;
	}
}
