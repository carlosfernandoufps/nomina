package nomina.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-11-13T19:40:35.960-0500")
@StaticMetamodel(Proceso.class)
public class Proceso_ {
	public static volatile SingularAttribute<Proceso, Integer> id;
	public static volatile SingularAttribute<Proceso, String> descripcion;
	public static volatile SingularAttribute<Proceso, Date> fechafin;
	public static volatile SingularAttribute<Proceso, Date> fechainicio;
	public static volatile ListAttribute<Proceso, Liquidacion> liquidacions;
}
