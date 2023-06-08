package SeccionA.SRP;

public class UserLogin {
    private final Usuario usuario;

    public UserLogin (String u, String c) {
        this.usuario=new Usuario(u, c);;
    }

    public void listaDeContactos(String c) {
        if(c==usuario.getClave()) {
        	//retorna lista de contactos.
        }
    }
}
