package nomina.model;

import nomina.entities.Concepto;
import nomina.util.Conexion;

public class conceptoDao 
	extends Conexion<Concepto> 
	implements GenericDao<Concepto> {
	
	public conceptoDao() {
		super(Concepto.class);
	}
}
