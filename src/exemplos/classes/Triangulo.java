package exemplos.classes;

public class Triangulo extends Poligono {
	private double base;
	private double altura;

	public Triangulo(double base, double altura) {
		super();	
		this.base = base;
		this.altura = altura;
		calcularArea();
	}

	@Override
	void calcularArea() {
		setArea((base * altura)/2);
	}
}
