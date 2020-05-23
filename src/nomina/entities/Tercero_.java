package nomina.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-11-13T19:40:35.966-0500")
@StaticMetamodel(Tercero.class)
public class Tercero_ {
	public static volatile SingularAttribute<Tercero, String> codtercero;
	public static volatile SingularAttribute<Tercero, String> descripcion;
	public static volatile ListAttribute<Tercero, Concepto> conceptos;
}
