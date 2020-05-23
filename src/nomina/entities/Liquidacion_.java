package nomina.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-11-13T19:44:27.852-0500")
@StaticMetamodel(Liquidacion.class)
public class Liquidacion_ {
	public static volatile SingularAttribute<Liquidacion, Integer> id;
	public static volatile SingularAttribute<Liquidacion, Integer> codmodelo;
	public static volatile SingularAttribute<Liquidacion, Date> fecha;
	public static volatile SingularAttribute<Liquidacion, BigDecimal> valor;
	public static volatile SingularAttribute<Liquidacion, Concepto> concepto;
	public static volatile SingularAttribute<Liquidacion, Empleado> empleado;
	public static volatile SingularAttribute<Liquidacion, Proceso> proceso;
}
