package SeccionB;

import Interfaces.MetodoPago;
import Interfaces.TipoNotificacion;

public class Notificacion {
	public void notificar(MetodoPago pago, TipoNotificacion tipoNotificacion) {
		tipoNotificacion.notificar(pago);
	}

}
