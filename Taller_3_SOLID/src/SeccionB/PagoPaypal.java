package SeccionB;
import Interfaces.MetedoPago;


public class PagoPaypal implements MetedoPago {
	
	private boolean loggedIn;
	
	public void realizarCobro(double monto) {
		
		if(!loggedIn) {
			loggedIn = true;
		   return;
		}
		//cargar el monto de compra al medio de pago
		

}
	public void calcularImpuestosFactura() {
		// TODO Auto-generated method stub
		
	}
	public void generarFactura() {
		// TODO Auto-generated method stub
		
	}
}
