package nomina.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2019-11-13T19:40:35.969-0500")
@StaticMetamodel(Tipoconcepto.class)
public class Tipoconcepto_ {
	public static volatile SingularAttribute<Tipoconcepto, Integer> id;
	public static volatile SingularAttribute<Tipoconcepto, String> descripcion;
	public static volatile ListAttribute<Tipoconcepto, Concepto> conceptos;
}
