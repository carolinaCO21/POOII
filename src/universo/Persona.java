package universo;

public class Persona {
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private int dniSinLetra;
	private char letraDniMayusculas;
	private int anioNacimiento;
	private char genero;
	private  long personaId;
	private static long nextPersonaID = 0;
	
	
	public Persona(String nombre, String primerApellido, String segundoApellido, char genero) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.genero = (genero == 'V'|| genero == 'v' || genero == 'H' || genero == 'h') ? genero : 'e';
		anioNacimiento = 2025;
		personaId = nextPersonaID++;
		
	}
	
	//Persona(String nombre, String primerApellido, String segundoApellido, char genero, int anioNacimiento, int DNISinLetra, char letraDNIMayusculas)
	
    public Persona(String nombre, String primerApellido, String segundoApellido, char genero, 
                  int anioNacimiento, int dniSinLetra, char letraDNIMayusculas) {
        this(nombre, primerApellido, segundoApellido, genero);
        this.anioNacimiento = anioNacimiento;
        this.dniSinLetra = dniSinLetra;
        this.letraDniMayusculas = letraDNIMayusculas;
     
        
    }
	
   // 1. Crear un método de instancia (no estático) que para una persona devuelva el DNI concatenado (04324567Y) en caso de no tener DNI devuelve null

    public String obtenerId(){ 
  
    	if (dniSinLetra == 0) {
			return null;
		}
 
    	return String.format("%d%c", dniSinLetra, letraDniMayusculas);
    	
    }
    
    //. Crear un método de instancia (no estático) que para una persona devuelva un String “Varón” o “Hembra” en función del valor del campo genero.

    public String obtenerGenero() {
        return (genero == 'H' || genero == 'h') ? "Hembra" : (genero == 'V' || genero == 'v')? "Varón": "Género Invalido";
    }
    
	public char getGenero() {
		return genero;
	}
    
	//Crear un metodo de instancia (no estático) que para una persona devuelva un String con el nombre + primerApellido + segundoApellido, de forma que quede algo así.
	public String nombreCompleto() {
		return String.format("%s %s %s%n",nombre, primerApellido,segundoApellido);
		
	}
	
	private String cabecera(String texto) {
		return String.format("%s%n%s%n", texto, "=".repeat(texto.length()));
	}
	

    @Override
	public String toString() {
		return cabecera("DATOS PERSONA") + String.format("Nombre: %s%nApellidos: %s%nDNI: %s%nAño de nacimiento: %d%nEdad: %d%nGénero: %s%n", nombre, primerApellido, obtenerId(), anioNacimiento, 2025-anioNacimiento, obtenerGenero());
	}

	public String getNombre() {
		return nombre;
	}


	public String getPrimerApellido() {
		return primerApellido;
	}


	public String getSegundoApellido() {
		return segundoApellido;
	}


	public long getPersonaId() {
		return personaId;
	}

	public int getAnioNacimiento() {
		return anioNacimiento;
	}



	
    
    
    
    
    
/*
	public static void main(String[] args) {
		Persona p = new Persona("Carolina", "Carrera", "Ochoa", 'H', 2006, 1203450, 'L');
		
		System.out.println(p.obtenerId());
		System.out.println(p.nombreCompleto());
		System.out.println(p);
	}
*/


	
	

 
	
	
}


/*
 * <aside>
💡 **APARTADO A**

1. Creación de una nueva aplicación llamada **Universo**
2. Creación de una clase principal llamada **Planeta** para desarrollar la lógica de programación y poder probar.
3. Creación de una clase denominada **Persona** que tendrá los siguientes campos, que habrás de declarar todos ellos como públicos (tu decides si encapsulas - y tomas los campos como privados dando acceso público - o no, si no sabes que decisión tomar, no encapsules):
    - Campos de instancia generales:
        - String nombre
        - String primerApellido
        - String segundoApellido
        - int DNISinLetra
        - char letraDNIMayusculas
        - int anioNaciomiento
        - char genero: simplificaremos utilizando ‘V’ y ‘H’
    - Campos de instancia que tienen una gestión específica:
        - int personaID: se irá incrementando de uno en uno por cada nueva persona “instanciada”, utilizando para almacenar el próximo personaID disponible la propiedad estática nextPersonaID definida más abajo.
    - Campos estáticos:
        - public static long nextPersonaID = 0;
            - Se utilizará para saber cual es el próximo ID disponible.
4. Constructores:
    - Persona(String nombre, String primerApellido, String segundoApellido, char genero)
        - Deberá introducir los valores indicados en los parámetros en el objeto creado.
        - Deberá gestionar adecuadamente, según la definición, personaID.
        - Deberá incluir año de nacimiento 2022.
    - Persona(String nombre, String primerApellido, String segundoApellido, char genero, int **anioNacimiento**, int DNISinLetra**,** char letraDNIMayusculas)
        - Deberá introducir los valores indicados en los parámetros en el objeto creado.
        - Deberá gestionar adecuadamente, según la definición, personaID.
</aside>

<aside>
💡 **APARTADO B**

}


3. Crear un metodo de instancia (no estático) que para una persona devuelva un String con el nombre + primerApellido + segundoApellido, de forma que quede algo así.
    
    ```
    Gabriel García Márquez
    ```
    
4. Crear un método de instancia show que muestre la información con se adjunta en el ejemplo (puedes usar alguno de los métodos anteriores).
    
    ```
    DATOS PERSONA
    =============
    Nombre: Gabriel
    Apellidos: García Márquez
    DNI: 04324567Y
    Año de nacimiento: 2020
    Edad: 2
    Género: Varón
    ```
    
5. Crear el mismo método anterior, llamandolo showStatic que haga la misma función que el anterior pero que sea un método estático.

*/