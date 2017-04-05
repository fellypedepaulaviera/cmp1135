/**
 * 
 */
package exemplos;

/**
 * @author Heider
 *
 */
public class EquacaoSegundoGrau2 {

	// Atributos da classe
	int a;
	int b;
	int c;
	double x1;
	double x2;
	double delta;
	
	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}
	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		this.a = a;
	}
	/**
	 * @return the b
	 */
	public int getB() {
		return b;
	}
	/**
	 * @param b the b to set
	 */
	public void setB(int b) {
		this.b = b;
	}
	/**
	 * @return the c
	 */
	public int getC() {
		return c;
	}
	/**
	 * @param c the c to set
	 */
	public void setC(int c) {
		this.c = c;
	}
	
	public EquacaoSegundoGrau2(int a, int b, int c) {
		this.setA(a);
		this.setB(b);
		this.setC(c);
		this.calcularEquacao();			
	}
	
	public EquacaoSegundoGrau2() {
		this.setA(0);
		this.setB(0);
		this.setC(0);		
	}
	
	public void calcularEquacao() {
		this.delta = Math.pow(b, 2) - 4 * this.a * this.c;
		if (this.delta >= 0) {
			this.x1 = (-this.b + Math.sqrt(this.delta)) / (2 * this.a);
			this.x2 = (-this.b - Math.sqrt(this.delta)) / (2 * this.a);
		} else {
			this.x1 = 0;
			this.x2 = 0;
		}	
	}
	
	public String toString() {
		return "A = " + this.getA()+ 
				"\nB = " +this.getB() +
				"\nC = " + this.getC() +
				"\nDelta = " + this.delta + 
				"\nX1 = " + this.x1 + 
				"\nX2 = " + this.x2;
	}
	

}
