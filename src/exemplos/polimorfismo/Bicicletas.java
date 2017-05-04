package exemplos.polimorfismo;

import exemplos.classes.Bicicleta;
import exemplos.classes.MountainBike;

class Bicicletas {
	public static void main(String[] args) {
		// Cria dois objetos do tipo Bicicleta diferentes
		Bicicleta bike1 = new Bicicleta();
		Bicicleta bike2 = new Bicicleta();
		MountainBike bike3 = new MountainBike();
		
		// Invoca os métodos desses objetos
		bike1.mudarCadencia(50);
		bike1.aumentarVelocidade(10);
		bike1.mudarMarcha(2);
		bike1.mostrarEstados();

		bike2.mudarCadencia(50);
		bike2.aumentarVelocidade(10);
		bike2.mudarMarcha(2);
		bike2.mudarCadencia(40);
		bike2.aumentarVelocidade(10);
		bike2.mudarMarcha(3);
		bike2.mostrarEstados();
		
//		bike3.mudarCadencia(50);
//		bike3.aumentarVelocidade(10);
//		bike3.mudarMarcha(2);
//		bike3.mudarCadencia(40);
//		bike3.aumentarVelocidade(10);
//		bike3.mudarMarcha(3);
//		bike3.travarSuspensao();
		bike3.mostrarEstados();
	}
}

