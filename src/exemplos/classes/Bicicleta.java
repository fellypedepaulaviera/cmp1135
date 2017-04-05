package exemplos.classes;

public class Bicicleta {

	int cadencia = 0;
	int velocidade = 0;
	int marcha = 1;

	public void mudarCadencia(int novoValor) {
		cadencia = novoValor;
	}

	public void mudarMarcha(int novoValor) {
		marcha = novoValor;
	}

	public void aumentarVelocidade(int incremento) {
		velocidade = velocidade + incremento;
	}

	void apertarFreio(int decremento) {
		velocidade = velocidade - decremento;
	}

	public void mostrarEstados() {
		System.out.println("cadencia: " + cadencia + " velocidade:" + velocidade + " marcha:" + marcha);
	}

}
