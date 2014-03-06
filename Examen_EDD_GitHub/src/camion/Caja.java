package camion;

/**
 * 
 * @author alu20477703k
 * @see Caja#Caja(String, String, double)
 */

// Modificacion para el ejercicio de GitHub

public class Caja {
	
	public String idCaja;		// id (codigo de barras) qupackage camion;e identifica a la caja	
	public String contenido;	// descripcion del contenido de la caja
	public double peso;			// peso de la caja y su contenido
	
	/**
	 * 
	 * @param idCaja Identificador de la caja
	 * @param contenido contenido de la caja
	 * @param peso peso de la caja
	 *
	 */
	
	
	public Caja(String idCaja, String contenido, double peso) {
		super();
		this.idCaja = idCaja;
		this.peso = peso;
		this.contenido = contenido;

	}

	@Override
	public String toString() {
		return "\n\tCaja [" + "idCaja=" + idCaja + " ,contenido=" + contenido + ", peso=" + peso + "]";
		
		/**
		 * @method toString
		 * @return 
		 * 
		 */

	}
	

}
