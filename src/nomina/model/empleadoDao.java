/**
 * 
 */
package nomina.model;

import nomina.entities.Empleado;
import nomina.util.Conexion;


public class empleadoDao 
	extends Conexion<Empleado> 	
	implements GenericDao<Empleado> {
	
	public empleadoDao(){
		super(Empleado.class);
	}
	
}
