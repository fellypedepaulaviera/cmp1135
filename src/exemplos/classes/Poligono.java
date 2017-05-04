package exemplos.classes;

public abstract class Poligono {
	
	protected double area;
	
	public Poligono() {
		this.area = 0;
	}
	
	public double getArea() {
		return area;
	}
	
	protected void setArea(double area) {
		this.area = area;
	}
	
	abstract void calcularArea();

}
