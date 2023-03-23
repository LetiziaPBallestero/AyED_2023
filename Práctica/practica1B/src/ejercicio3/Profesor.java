package ejercicio3;

public class Profesor {
	private String nombre;
	private String apellido;
	private String comision;
	private String catedra;
	private String facultad;

	public String tusDatos() {
		return this.getNombre() + " " + this.getApellido() + ". " 
	+ "Comision: " + this.getComision() + ", " +
	" Cátedra " + this.getCatedra() + ", " +
	"Facultad: " + this.getFacultad();
	}

	// getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getComision() {
		return comision;
	}

	public void setComision(String comision) {
		this.comision = comision;
	}

	public String getCatedra() {
		return catedra;
	}

	public void setCatedra(String catedra) {
		this.catedra = catedra;
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

}
