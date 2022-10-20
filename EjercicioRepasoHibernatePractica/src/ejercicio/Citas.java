package ejercicio;
// Generated 19 oct. 2022 14:24:10 by Hibernate Tools 6.0.2.Final

import java.sql.Date;

/**
 * Citas generated by hbm2java
 */
public class Citas implements java.io.Serializable {

	private Integer codigo;
	private Pacientes pacientes;
	private Medicos medicos;
	private Date fecha;

	public Citas() {
	}

	public Citas(Pacientes pacientes, Medicos medicos, Date fecha) {
		this.pacientes = pacientes;
		this.medicos = medicos;
		this.fecha = fecha;
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Pacientes getPacientes() {
		return this.pacientes;
	}

	public void setPacientes(Pacientes pacientes) {
		this.pacientes = pacientes;
	}

	public Medicos getMedicos() {
		return this.medicos;
	}

	public void setMedicos(Medicos medicos) {
		this.medicos = medicos;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Citas [codigo=" + codigo + ", idPacientes=" + pacientes.getId() + ", idMedicos=" + medicos.getId() + ", fecha=" + fecha
				+ "]";
	}

}