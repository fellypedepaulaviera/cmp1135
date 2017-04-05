/**
 * 
 */
package exemplos;

/**
 * @author Heider
 *
 */
public class TestaEquacaoSegundoGrau {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EquacaoSegundoGrau2 eq1 = new EquacaoSegundoGrau2(2, 10, 2);
		System.out.println(eq1.toString());
		EquacaoSegundoGrau2 eq2 = new EquacaoSegundoGrau2();
		eq2.setA(3);
		eq2.setB(50);
		eq2.setC(4);
		eq2.calcularEquacao();
		System.out.println(eq2.toString());		
	}

}
