package mybooks;

public class Test {
	public static void main(String[] args) {

		
		
		Libro lib0 = new Libro("Cien años de soledad", "Gabriel García Márquez", 735, 3, false, 20.99);
		Libro lib1 = new Libro("El señor de los anillos", "J. R. R. Tolkien", 429, 5, false, 22.99);
		Libro lib2 = new Libro("Cien años de soledad", "J. R. R. Tolkien", 429, 5, false, 22.99);
		Libro lib3 = new Libro("1984", "George Orwel", 122, 9, false, 40.99);
		Libro lib4 = new Libro("Un mundo feliz", "Aldous Huxley", 270, 1, false, 25.99);
		Libro lib5 = new Libro("Orgullo y prejuicio", "Jane Austen", 340, 2, true, 12.99);
		Libro lib6 = new Libro("Crimen y castigo", "Fiódor Dostoyevski", 259, 3, false, 60.99);
		Libro lib7 = new Libro("Ulises", "James Joyce", 400, 4, false, 42.99);
		Libro lib8 = new Libro("Madame Bovary", "Gustave Flaubert", 723, 9, true, 9.99);
		Libro lib9 = new Libro("En busca del tiempo perdido", "Marcel Proust", 374, 2, true, 9.99);
		//5 revistas
		Revista r0 = new Revista("Revista0",10, false, 30.30);
		Revista r1 = new Revista("Revista1",10, false, 5.30);
		Revista r2 = new Revista("Revista2",10, false, 5.30);
		Revista r3 = new Revista("Revista3", 10, false, 5.30);
		Revista r4 = new Revista("Revista4", 10, false, 5.30);
		
		Publicacion [] publicaciones = {lib0, lib1, lib2, lib3, lib4, lib5, lib6, lib7, lib8,lib9, r0, r1, r2, r3, r4};
		System.out.println("1.Todas las **publicaciones** del array `publicaciones` con `título` y `ID`.");
		for (Publicacion p : publicaciones) {
			System.out.printf(" Titulo: %s, Id: %d", p.getTitulo(), p.getId());
			System.out.println();
		}
		System.out.println();System.out.println();
		System.out.println("2. Solo **libros** del array `publicaciones` con `ID` y  `título` (usar `instanceof` para discriminar).");
		for (Publicacion p : publicaciones) {
			if(p instanceof Libro) {
				System.out.printf(" Titulo: %s, Id: %d", p.getTitulo(), p.getId());
				System.out.println();
			}
		}
		System.out.println();System.out.println();
		System.out.println("3. Solo **revistas** del array `publicaciones` con `ID` y  `título` (usar `instanceof` para discriminar).");
		for (Publicacion p : publicaciones) {
			if(p instanceof Revista) {
				System.out.printf(" Titulo: %s, Id: %d", p.getTitulo(), p.getId());
				System.out.println();
			}
		}
		System.out.println();System.out.println();
		System.out.println("4. Todas las **publicaciones** del array `publicaciones` con `ID,`  `título` y `precio` pero filtrando aquellas que tienen un precio mayor de 20 euros. ");
		for (Publicacion p : publicaciones) {
			if(p.getPrecio() > 20) {
				System.out.printf(" Titulo: %s, Id: %d, Precio: %.2f", p.getTitulo(), p.getId(), p.getPrecio());
				System.out.println();
			}
		}
		System.out.println();System.out.println();
		System.out.println(" 5. Solo **libros** del array `publicaciones` con `ID` y  `título` y `precio` pero filtrando aquellas que tienen un precio mayor de 20 euros.  (usar `instanceof` para discriminar).");
		for (Publicacion p : publicaciones) {
			if(p.getPrecio() > 20 && p instanceof Libro) {
				System.out.printf(" Titulo: %s, Id: %d, Precio: %.2f", p.getTitulo(), p.getId(), p.getPrecio());
				System.out.println();
			}
		}
		System.out.println();System.out.println();
		System.out.println(" 6. Solo **revistas** del array `publicaciones` con `ID` y  `título` y `precio` pero filtrando aquellas que tienen un precio mayor de 3 euros  (usar `instanceof` para discriminar).");
		for (Publicacion p : publicaciones) {
			if(p.getPrecio() > 3 && p instanceof Revista) {
				System.out.printf(" Titulo: %s, Id: %d, Precio: %.2f", p.getTitulo(), p.getId(), p.getPrecio());
				System.out.println();
			}
		}
		
	
		System.out.println();System.out.println();
		System.out.println("1. Utiliza el libro Ulises, pero dentro del array. No utilices lib7");
		System.out.println();System.out.println();
		System.out.println("2. Muestra su estado con show.");
		Libro  p7= (Libro)publicaciones[7];
		p7.show();
		System.out.println();System.out.println();
		System.out.println("3. Lee 295 paginas de forma silenciosa con el método estático y verifica que estás en la página 299.");
		for (int i = 1; i <= 295; i++) {
			Libro.leePaginaStatic(p7, true);
		}
		System.out.printf("Pagina: %d", p7.getPagActual());
		System.out.println();System.out.println();
		System.out.println("4. Lee 5 paginas de forma NO silenciosa con el método estático y verifica que estás en la página 304.");
		for (int i = 1; i <= 5; i++) {
			Libro.leePaginaStatic(p7, false);
		}
		System.out.printf("Pagina: %d", p7.getPagActual());
		System.out.println();System.out.println();
		System.out.println("Lee 10 palabras de forma NO silenciosa con el método NO estático y verifica que estás en la página 319.");
		for (int i = 1; i <= 10; i++) {
			Libro.leePaginaStatic(p7, false);
		}
		System.out.printf("Pagina: %d", p7.getPagActual());
		System.out.println();System.out.println();
		System.out.println("4. Lee 1000 paginas de forma NO silenciosa con el método estático y verifica que has finalizado.");
		for (int i = 1; i <= 1000; i++) {
			Libro.leePaginaStatic(p7, false);
		}
		System.out.printf("Pagina: %d", p7.getPagActual());
		
		
		Publicacion p1 = new Libro("En busca del tiempo perdid", "Marcel Proust", 374, 2, true, 9.99);
		
		System.out.println(p1.toString());  
		Publicacion.showStatic(p1);
		
		Libro p = new Libro("En busca del tiempo perdid", "Marcel Proust", 374, 2, true, 9.99);
		
		/*
		 * En Java, el tipo real del objeto determina qué método se invoca, no el tipo de la referencia. Así que, aunque el tipo de la referencia sea Publicacion (cuando haces el cast), si el objeto real es de tipo Libro, Java ejecuta el método show() de Libro debido al polimorfismo.
		 */
		 ((Publicacion)p).show(); 
		
		p.show();
		
		
	}

}
