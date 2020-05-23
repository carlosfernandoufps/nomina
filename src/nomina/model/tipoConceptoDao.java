package nomina.model;

import nomina.entities.Tipoconcepto;
import nomina.util.Conexion;

public class tipoConceptoDao 
	extends Conexion<Tipoconcepto> 
	implements GenericDao<Tipoconcepto> {

	public tipoConceptoDao() {
		super(Tipoconcepto.class);
	}
	
}
