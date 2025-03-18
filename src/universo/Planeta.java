package universo;

public class Planeta {
	
	public static void main(String[] args) {
		
		
		Persona p0 = new Persona("María", "Pérez", "Gómez", 'H');
		Persona p1 = new Persona("Pedro","Gutiérrez","Pérez", 'H');
		Persona p2 = new Persona("Antonio", "Domínguez","Antúnez", 'H');
		Persona p3 = new Persona("Javier","Luque","Porras", 'V');
		Persona p4 = new Persona("Luisa","Mínguez","Mora", 'H');
		
		
		Persona p5 = new Persona("José","Mora","Larios",'V',2003,93849228,'M');
		Persona p6 = new Persona("Rocío","Pérez","Pérez",'H',1967,94329532,'J');
		Persona p7 = new Persona("Pilar","Laguna","López",'m',1999,83453624,'K');
		Persona p8 = new Persona("David","Ravina","Díez",'V',1945,76532345,'A');
		Persona p9 = new Persona("Juan","Lechuga","Montes",'V',2012,98432232,'Z');
		
		Persona [] personas = {p0,p1,p2,p3,p4,p5,p6,p7,p8,p9};
		
	///	4. Obtener una serie de listados de personas según se expresa a continuación:
	   //   1. Todas las personas mostrando personaID, nombre, apellidos y DNI
		
		for (Persona p : personas) {
			System.out.printf("ID: %d, Nombre: %s, Apellidos: %s %s, DNI: %d%n", p.getPersonaId(), p.getNombre(),p.getPrimerApellido(), p.getSegundoApellido(), p.getPersonaId());
		}
		
	     //   2. Personas mayores de edad mostrando sus nombres y edad
		
		for (Persona p : personas) {
				if(2025 - p.getAnioNacimiento() >= 18) {
				System.out.printf("Nombre: %s, Edad: %d%n", p.getNombre(), (2025 - p.getAnioNacimiento()));
				}
		}
		
	//    5. Verificación de lectura y métodos de presentación correctos:
	      //  1. Utiliza la Persona Pilar Laguna López, pero dentro del array. No utilices p7, sino su referencia a través del array persona.
	        
		Persona per7 = personas[7];
		//2. Muestra sus datos con show.
		System.out.println(per7);
		
	}
	
}
/*
 * 💡 **APARTADO C**

1. Operaciones a realizar en la clase Planeta
    1. Instanciar las siguientes 5 personas, en este orden, y llamarlos p0, p1, ..., p4 (determina el género por el nombre e inclúyelo manualmente y ten en cuenta que no se dice año de nacimiento, es decir, han nacido en este año):
        1. María Pérez Gómez
        2. Pedro Gutiérrez Pérez
        3. Antonio Domínguez Antúnez 
        4. Javier Luque Porras
        5. Luisa Mínguez Mora
    2. Instanciar las siguientes 5 personas, en este orden, y llamarlos p5, p6, ..., p9 (determina el género por el nombre e inclúyelo manualmente). En este caso se incluyen DNI y letras:
        1. José Mora Larios, 93849228M, 2003
        2. Rocío Pérez Pérez, 94329532J, 1967
        3. Pilar Laguna López, 83453624K, 1999
        4. David Ravina Díez, 76532345A, 1945
        5. Juan Lechuga Montes, 98432232Z, 2012
    3. Incluirlos en el orden indicado en un array llamado personas.
    
</aside>
*rre
 */
