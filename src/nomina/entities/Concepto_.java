package nomina.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-11-13T19:40:35.943-0500")
@StaticMetamodel(Concepto.class)
public class Concepto_ {
	public static volatile SingularAttribute<Concepto, String> codconcepto;
	public static volatile SingularAttribute<Concepto, String> descripcion;
	public static volatile SingularAttribute<Concepto, Tercero> tercero;
	public static volatile SingularAttribute<Concepto, Tipoconcepto> tipoconcepto;
	public static volatile ListAttribute<Concepto, Liquidacion> liquidacions;
}
