package exemplos.classes;

public class MountainBike extends Bicicleta {
	
	boolean suspensao = false;

	public MountainBike() {
		mudarCadencia(50);
		aumentarVelocidade(10);
		mudarMarcha(2);
		mudarCadencia(40);
		aumentarVelocidade(10);
		mudarMarcha(3);
		travarSuspensao();
	}
	
	public void travarSuspensao() {
		suspensao = false;
	}
	
	public void destravarSuspensao() {
		suspensao = true;
	}
	
	@Override
	public void mostrarEstados() {
		System.out.println("cadencia: " + cadencia + " velocidade:" + velocidade + " marcha:" + marcha + " suspensao:"+suspensao);
	}

}
