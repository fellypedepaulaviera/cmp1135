package exemplos.classes;

public class Retangulo extends Poligono {

	private double base;
	private double altura;

	public Retangulo(double base, double altura) {
		super();	
		this.base = base;
		this.altura = altura;
		calcularArea();
	}

	@Override
	void calcularArea() {
		setArea(base * altura);
	}

}
