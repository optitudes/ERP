package ERP.model;

public class Cronograma {
	String fechaInicio;
	String fechaFinal;
	String descripcion;
	public Cronograma(String fechaInicio, String fechaFinal, String descripcion) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
		this.descripcion = descripcion;
	}
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getFechaFinal() {
		return fechaFinal;
	}
	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Cronograma [fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", descripcion=" + descripcion
				+ "]";
	}
	
	

}
