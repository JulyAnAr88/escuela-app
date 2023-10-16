package com.example.escnormalsup;

public class Alumno {

	
	public Alumno(String nombre, Carrera myCarrera) {
		super();
		this.nombre = nombre;
		this.myCarrera = myCarrera;
	}
	
	private String nombre;
	private Carrera myCarrera;
	private String correo;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
}
