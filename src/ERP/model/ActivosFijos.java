package ERP.model;

public class ActivosFijos {
	private String nombre;
	private String iD;
	public ActivosFijos(String nombre, String iD) {
		super();
		this.nombre = nombre;
		this.iD = iD;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getiD() {
		return iD;
	}
	public void setiD(String iD) {
		this.iD = iD;
	}
	@Override
	public String toString() {
		return "ActivosFijos [nombre=" + nombre + ", iD=" + iD + "]";
	}
	

}
