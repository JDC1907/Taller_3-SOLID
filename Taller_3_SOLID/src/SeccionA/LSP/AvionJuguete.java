package SeccionA.LSP;

public class AvionJuguete implements Avion {
	private boolean cargado;

	@Override
	public void volar() {
		if(!cargado) {
			//metodo para cargarlo
		}
		//vuela
	}
}
