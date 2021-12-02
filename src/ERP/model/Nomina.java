package ERP.model;

public class Nomina {
	String iD;
	String nombre;
	String diasTrabajados;
	String salario;
	String salarioPagar;
	String pagado;
	public Nomina(String iDAux,String nombre, String diasTrabajados, String salario, String salarioPagar, String pagado) {
		super();
		this.iD=iDAux;
		this.nombre = nombre;
		this.diasTrabajados = diasTrabajados;
		this.salario = salario;
		this.salarioPagar = salarioPagar;
		this.pagado = pagado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDiasTrabajados() {
		return diasTrabajados;
	}
	public void setDiasTrabajados(String diasTrabajados) {
		this.diasTrabajados = diasTrabajados;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	public String getSalarioPagar() {
		return salarioPagar;
	}
	public void setSalarioPagar(String salarioPagar) {
		this.salarioPagar = salarioPagar;
	}
	public String getPagado() {
		return pagado;
	}
	public void setPagado(String pagado) {
		this.pagado = pagado;
	}
	@Override
	public String toString() {
		return "Nomina [nombre=" + nombre + ", diasTrabajados=" + diasTrabajados + ", salario=" + salario
				+ ", salarioPagar=" + salarioPagar + ", pagado=" + pagado + "]";
	}
	

}
