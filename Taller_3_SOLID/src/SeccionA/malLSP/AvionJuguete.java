package SeccionA.malLSP;

public class AvionJuguete implements Avion {
	
	private boolean cargado;

	@Override
	public void volar() {
		if(!cargado) {
			return;
		}
		//vuela
	}

}
