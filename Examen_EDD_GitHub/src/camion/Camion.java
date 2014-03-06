package camion;

import java.util.Arrays;

/**
 * 
 * @author alu20477703k
 * @see Camion#getPesoTotal()
 */

public class Camion {

	public String matricula; // Identificador (codigo) del cliente
	public String modelo; // Nombre del cliente
	public double pesoMaximo; // Peso maximo de carga que admite el camión

	public Caja carga[]; // Cajas que hay cargadas en el camion

	/**
	 * @return pesoTotal Devuelve el pesoTotal del camion
	 */

	public double getPesoTotal() {
		// recorre todas las cajas de la carga sumando el peso
		double pesoTotal = 0;
		for (int c = 0; c < this.carga.length; c++) {
			pesoTotal += carga[c].peso;
		}
		return pesoTotal;

	}

	/**
	 * 
	 * @param caja
	 *            añade el peso de la caja
	 * @return Devuelve false si la caja no puede ser cargada porque el camion
	 *         excede el peso maximo o true si admite la caja
	 */

	public boolean addCaja(Caja caja) {
		if ((this.getPesoTotal() + caja.peso) > this.pesoMaximo) {
			return false; // no cargamos las cajas
		}

		Caja[] tmpCarga = this.carga;
		this.carga = new Caja[tmpCarga.length + 1];
		System.arraycopy(tmpCarga, 0, this.carga, 0, tmpCarga.length);
		this.carga[this.carga.length - 1] = caja;

		return true; // si cargamos la caja

	}

	@Override
	public String toString() {
		return "Camion [ matricula=" + matricula + "\n\t modelo=" + modelo
				+ "\n\tpesoMaximo=" + pesoMaximo + "\ncarga="
				+ Arrays.toString(this.carga) + "\n]";

	}

	/**
	 * 
	 * @param matricula
	 *            Matricula del camion
	 * @param modelo
	 *            Modelo del camion
	 * @param pesoMaximo
	 *            peso maximo admitido por el camion
	 * @param carga
	 *            carga del camion
	 * 
	 */

	public Camion(String matricula, String modelo, double pesoMaximo,
			Caja[] carga) {
		super();
		this.matricula = matricula;
		this.modelo = modelo;
		this.pesoMaximo = pesoMaximo;
		this.carga = carga;
	}

	/**
	 * 
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// Crear una Caja
		Caja[] carga = new Caja[] { new Caja("C100", "Libros", 50d),
				new Caja("C200", "DVDs", 50d),
				new Caja("C150", "Batamantas", 50d),
				new Caja("C600", "Lapices", 50d) };
		Camion camion1 = new Camion("4532-GDH", "Mercedes B3", 260d, carga);

		// Escribir el contenido del camion
		System.out.println(camion1);
		// Escribir el peso
		System.out.println("Peso Inicial: " + camion1.getPesoTotal());

		System.out.println("------------------------");
		// Cargar mas cajas
		camion1.addCaja(new Caja("C101", "Pilas", 50d));
		// la siguiente caja no se puede cargar
		if (!camion1.addCaja(new Caja("C121", "Agua", 50d))) {
			System.out
					.println("Las pilas NO se han cargado por exceso de peso.");
		}

		// Escribir el contenido del camion
		System.out.println(camion1);
		// Escribir el peso final
		System.out.println("Peso Final: " + camion1.getPesoTotal());

	}

}
