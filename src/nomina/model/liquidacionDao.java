package nomina.model;

import nomina.entities.Liquidacion;
import nomina.util.Conexion;

public class liquidacionDao 
	extends Conexion<Liquidacion> 
	implements GenericDao<Liquidacion> {
	
	public liquidacionDao() {
		super(Liquidacion.class);
	}
}
