package ERP.model;

public class Admin {
	String nombre;
	String iD;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String nombre, String iD) {
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
		return "Admin [nombre=" + nombre + ", iD=" + iD + "]";
	}
	

}
