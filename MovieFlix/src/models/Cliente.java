package models;

import java.time.LocalDate;

public class Cliente {

	private int idCliente;
	private String nombreCliente;
	private LocalDate fechaNacimiento;
	private String fechaR;
	private String ciudad;
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(int idCliente, String nombreCliente, LocalDate fechaNacimiento, String fechaR, String ciudad) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaR = fechaR;
		this.ciudad = ciudad;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getFechaR() {
		return fechaR;
	}

	public void setFechaR(String fechaR) {
		this.fechaR = fechaR;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", fechaNacimiento="
				+ fechaNacimiento + ", fechaR=" + fechaR + ", ciudad=" + ciudad + "]";
	}
	
}
