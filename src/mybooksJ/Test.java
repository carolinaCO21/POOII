package mybooksJ;

public class Test {
		public static void main(String[] args) {
			Libro l1 = new Libro("Cien años de soledad", "Gabriel García Marquez",
					735, 3, false, 20.99);
			System.out.println(l1);
			l1.show();
			Libro.showStatic(l1);
			l1.leePagina(true);
			l1.leePagina(true);
			l1.leePagina(false);
			
			
			System.out.println();
			
			Revista r1 = new Revista("Muy interesante", 127, 3, false, 3.50);
			System.out.println(r1);
			r1.show();
			Revista.showStatic(r1);
			
			System.out.println("Empezamos el apartado 14");
			System.out.println("========================");
			
			
			Libro lib0 = new Libro("Cien años de soledad", "Gabriel García Márquez", 735, 3, false, 20.99);
			Libro lib1 = new Libro("El señor de los anillos", "J. R. R. Tolkien", 429, 5, false, 22.99);
			Libro lib2 = new Libro("1984", "George Orwel", 122, 9, false, 40.99);
			Libro lib3 = new Libro("Un mundo feliz", "Aldous Huxley", 270, 1, false, 25.99);
			Libro lib4 = new Libro("Orgullo y prejuicio", "Jane Austen", 340, 2, true, 12.99);
			Libro lib5 = new Libro("Crimen y castigo", "Fiódor Dostoyevski", 259, 3, false, 60.99);
			Libro lib6 = new Libro("Lolita", "Vladimir Nabokov", 300, 5, false, 27.99);
			Libro lib7 = new Libro("Ulises", "James Joyce", 400, 4, false, 42.99);
			Libro lib8 = new Libro("Madame Bovary", "Gustave Flaubert", 723, 9, true, 9.99);
			Libro lib9 = new Libro("En busca del tiempo perdido", "Marcel Proust", 374, 2, true, 9.99);

			Revista rev0 = new Revista("Revista 1", 100, 2, true, 5.95);
			Revista rev1 = new Revista("Revista 2",50, 2, true, 2.95);
			Revista rev2 = new Revista("Revista 3", 30, 2, true, 1.95);
			Revista rev3 = new Revista("Revista 4", 90, 2, true, 9.95);
			Revista rev4 = new Revista("Revista 5", 120, 2, true, 7.95);
			
			rev1.show();
			lib1.show();
			
			Publicacion[] publicaciones = {lib0, lib1, lib2, lib3, lib4, lib5, 
					lib6, lib7, lib8, lib9, rev0, rev1, rev2, rev3, rev4};
			
			System.out.println("Todas las publicaciones del array publicaciones con título y ID");
			
			for(Publicacion p: publicaciones) {
				System.out.println(p.getId() + ": " + p.getTitulo());
			}
			
			// Solo libros del array publicaciones con ID y  
			// título (usar instanceof para discriminar).
			
			System.out.println("Solo libros del array publicaciones");
			
			for(Publicacion p: publicaciones) {
				if(p instanceof Libro) {
					System.out.println(p.getId() + ": " + p.getTitulo());
				}
			}
			
			System.out.println("Solo revistas del array publicaciones");
			
			for(Publicacion p: publicaciones) {
				if(p instanceof Revista) {
					System.out.println(p.getId() + ": " + p.getTitulo());
				}
			}
			
			System.out.println("Publicaciones más caras de 20 euros");
			
			for(Publicacion p: publicaciones) {
				if(p.getPrecio() > 20) {
					System.out.println(p.getId() + ": " + p.getTitulo() + " " + p.getPrecio() + "€");
				}
			}
			
			System.out.println("Libros más caros de 20 euros");
			
			for(Publicacion p: publicaciones) {
				if(p.getPrecio() > 20 && p instanceof Libro) {
					System.out.println(p.getId() + ": " + p.getTitulo() + " " + p.getPrecio() + "€");
				}
			}
			
			System.out.println("Revistas más caras de 3 euros");
			
			for(Publicacion p: publicaciones) {
				if(p.getPrecio() > 3 && p instanceof Revista) {
					System.out.println(p.getId() + ": " + p.getTitulo() + " " + p.getPrecio() + "€");
				}
			}
			
			System.out.println("Apartado e");
			
			Libro libro = (Libro)publicaciones[8];
			libro.show();
			for(int i =0; i < 295; i++) {
				Libro.leePaginaStatic(libro, true);
			}
			System.out.println(libro.getPagActual());
			
			for(int i =0; i < 5; i++) {
				Libro.leePaginaStatic(libro, false);
			}
			System.out.println(libro.getPagActual());
			
			for(int i =0; i < 10; i++) {
				libro.leePagina(false);
			}
			System.out.println(libro.getPagActual());
			
			for(int i =0; i < 410; i++) {
				libro.leePagina(false);
			}
			System.out.println(libro.getPagActual());
			System.out.println(libro.isLeido());
			
		}
}

