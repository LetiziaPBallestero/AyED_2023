package ejercicio3;

public class Test {
	public static void main(String[] args) {

		Estudiante[] estudiantes = new Estudiante[2];
		Profesor[] profesores = new Profesor[3];

		Estudiante Fausto = new Estudiante();
		Fausto.setApellido("Ballestero");
		Fausto.setNombre("Fausto");
		Fausto.setComision("1A");
		Fausto.setDireccion("77 bis");
		Fausto.setEmail("FaustO@gmail.com");

		Estudiante Leti = new Estudiante();
		Leti.setApellido("Ballestero");
		Leti.setNombre("Letizia");
		Leti.setComision("1B");
		Leti.setDireccion("77 bis");
		Leti.setEmail("Letizia@gmail.com");

		Profesor Marcos = new Profesor();
		Marcos.setApellido("Cantero");
		Marcos.setNombre("Marcos");
		Marcos.setCatedra("Biologia");
		Marcos.setComision("1C");
		Marcos.setFacultad("UNV");

		Profesor Luna = new Profesor();
		Luna.setApellido("Calderon");
		Luna.setNombre("Lunita");
		Luna.setCatedra("Ilustracion de la nostalgia");
		Luna.setComision("1D");
		Luna.setFacultad("UNC");

		Profesor Milanesa = new Profesor();
		Milanesa.setApellido("Ballestero");
		Milanesa.setNombre("Mila");
		Milanesa.setCatedra("Bigotes y otros artefactos");
		Milanesa.setComision("1E");
		Milanesa.setFacultad("UNLP");

		estudiantes[0] = Leti;
		estudiantes[1] = Fausto;

		profesores[0] = Marcos;
		profesores[1] = Luna;
		profesores[2] = Milanesa;

		System.out.println("Estudiantes: ");
		for (Estudiante e : estudiantes) {

			System.out.println(e.tusDatos() + " , ");
		}
		System.out.println("");
		System.out.println("Profesores: ");
		for (Profesor p : profesores) {

			System.out.println(p.tusDatos() + " , ");
		}
	}
}
