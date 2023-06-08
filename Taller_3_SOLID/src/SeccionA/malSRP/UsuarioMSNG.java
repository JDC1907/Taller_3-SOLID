package SeccionA.malSRP;

public class UsuarioMSNG {

	    private final Usuario usuario;

	    public UsuarioMSNG (String u, String c) {
	        this.usuario=new Usuario(u, c);;
	    }

	    public void listaDeContactos(String c) {
	        if(c==usuario.getClave()) {
	        	//retorna lista de contactos
	        }
	    }

	    public void sendMSG(Usuario user, String msg) {
	        // manda mensaje al usuario
	    }

}

