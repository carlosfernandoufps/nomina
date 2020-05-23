package nomina.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-11-13T19:44:27.845-0500")
@StaticMetamodel(Empleado.class)
public class Empleado_ {
	public static volatile SingularAttribute<Empleado, String> codigo;
	public static volatile SingularAttribute<Empleado, String> cedula;
	public static volatile SingularAttribute<Empleado, Date> fechaingreso;
	public static volatile SingularAttribute<Empleado, Date> fechanacimiento;
	public static volatile SingularAttribute<Empleado, Date> fecharetiro;
	public static volatile SingularAttribute<Empleado, String> nombre;
	public static volatile ListAttribute<Empleado, Liquidacion> liquidacions;
}
