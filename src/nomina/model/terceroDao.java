package nomina.model;

import nomina.entities.Tercero;
import nomina.util.Conexion;

public class terceroDao 
	extends Conexion<Tercero> 
	implements GenericDao<Tercero> {
	
	public terceroDao() {
		super(Tercero.class);
	}
	
}
