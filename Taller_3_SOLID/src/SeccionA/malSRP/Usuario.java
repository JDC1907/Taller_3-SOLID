package SeccionA.malSRP;

public class Usuario {
	private String usuario;
	private String clave;
	
	public Usuario(String u, String c) {
		this.usuario=u;
		this.clave=c;
	}

	public String getClave() {
		return clave;
	}

}
