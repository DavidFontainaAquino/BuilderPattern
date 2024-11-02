package com.dfont.models;

public class Persona {
	private String nombre;
	private String apellido;
	private Integer edad;
	
	public Persona(String nombre, String apellido, Integer edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	public static final class Builder{
		private String nombre;
		private String apellido;
		private Integer edad;
		
		private Builder() {
		}
		
		public static Builder getBuilder() {
			return new Builder();
		}
		
		public Builder withNombre(String nombre) {
			this.nombre = nombre;
			return this;
		}
		
		public Builder withApellido(String apellido) {
			this.apellido = apellido;
			return this;
		}
		
		public Builder withEdad(Integer edad) {
			this.edad = edad;
			return this;
		}
		
		public Persona build() {
			return new Persona(nombre, apellido, edad);
		}
	}
	
}
