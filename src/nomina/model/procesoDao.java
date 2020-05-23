package nomina.model;

import nomina.entities.Proceso;
import nomina.util.Conexion;

public class procesoDao 
	extends Conexion<Proceso> 
	implements GenericDao<Proceso> {

	public procesoDao() {
		super(Proceso.class);
	}
}
