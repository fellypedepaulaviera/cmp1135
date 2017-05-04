package exemplos.polimorfismo;

import java.util.ArrayList;

import exemplos.classes.Circulo;
import exemplos.classes.Poligono;
import exemplos.classes.Retangulo;
import exemplos.classes.Triangulo;

public class Poligonos {
	
	public static void main(String[] args) {
		
		ArrayList<Poligono> poligonos = new ArrayList<Poligono>();
		
		poligonos.add(new Circulo(100));
		poligonos.add(new Circulo(10));
		
		poligonos.add(new Retangulo(100,40));
		poligonos.add(new Retangulo(1000,40));
		
		poligonos.add(new Triangulo(10,4));
		poligonos.add(new Triangulo(1000,4000));
		
		for(Poligono poligono : poligonos) {
			System.out.println(poligono.getClass().getSimpleName() + " area = " + poligono.getArea());
		}		
		
	}

}
