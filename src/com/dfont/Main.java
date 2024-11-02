package com.dfont;

import com.dfont.models.Persona;

public class Main {

	public static void main(String[] args) {
		Persona persona = Persona.Builder.getBuilder()
				.withNombre("David")
				.withApellido("Fontaiña")
				.withEdad(30)
				.build();
		System.out.println(persona);
	}

}
