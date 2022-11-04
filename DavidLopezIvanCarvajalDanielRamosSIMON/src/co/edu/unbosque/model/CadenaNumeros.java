package co.edu.unbosque.model;


public class CadenaNumeros {

	private String cadena;

	public CadenaNumeros() {
      cadena = "";
	}
	
	public String generarCadena() {
		String a = String.valueOf((int)(Math.floor(Math.random()*4+1)));
        return a;
	}
	
    public void organizar(String a) {
    	String z = a;
		cadena+=z;
	}
    

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	
    
    
    
   
}


