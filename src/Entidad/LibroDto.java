package Entidad;
/**
 * Entidad que contiene el catálogo de libros
 * @author ASMP-28/09/2023
 */
public class LibroDto {
	
		//Atributos
		private long id_Libro;
		private String titulo;
		private String autor;
		private String isbn;
		private int edicion;
		
		//Constructores
		public LibroDto(long id_Libro, String titulo, String autor, String isbn, int edicion) {
			super();
			this.id_Libro = id_Libro;
			this.titulo = titulo;
			this.autor = autor;
			this.isbn = isbn;
			this.edicion = edicion;
		}
		
		public LibroDto(String titulo, String autor, String isbn, int edicion) {
			super();
			this.titulo = titulo;
			this.autor = autor;
			this.isbn = isbn;
			this.edicion = edicion;
		}
		
		//Getters y setters
		public LibroDto() {
			super();
			// TODO Auto-generated constructor stub
		}

		public long getIdLibro() {
			return id_Libro;
		}

		public void setIdLibro(long id_Libro) {
			this.id_Libro = id_Libro;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		public String getIsbn() {
			return isbn;
		}

		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}

		public int getEdicion() {
			return edicion;
		}

		public void setEdicion(int edicion) {
			this.edicion = edicion;
		}

		@Override
		public String toString() {
			return "librosDto [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn
					+ ", edicion=" + edicion + "]";
		}
}
