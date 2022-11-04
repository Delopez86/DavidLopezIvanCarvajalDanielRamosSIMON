package co.edu.unbosque.model;

public class EnlaceNumeros {
	
	private CadenaNumeros cad;
	
	public EnlaceNumeros() {
		cad = new CadenaNumeros();
	}

	public CadenaNumeros getCn() {
		return cad;
	}
	public void setCn(CadenaNumeros cn) {
		this.cad = cn;
	}
}
