package accesoDatos.practica1.objeto;

import java.sql.Date;
import java.time.LocalDate;

public class Vendedor {
	private int id;
	private String nombre;
	private Date fecha_ingreso;
	private Integer salario;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer getSalario() {
		return salario;
	}
	
	public void setSalario(Integer salario) {
		this.salario = salario;
	}
	
	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}
	
	public void setFecha_ingreso(Date date) {
		this.fecha_ingreso = date;
	}
	
}
