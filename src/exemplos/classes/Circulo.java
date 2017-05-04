package exemplos.classes;

public class Circulo extends Poligono {
	
	private double raio;
	
	public Circulo(double raio) {
		super();	
		this.raio = raio;
		calcularArea();
	}
	@Override
	void calcularArea() {
		setArea(Math.PI * Math.pow(raio, 2));
	}

}
