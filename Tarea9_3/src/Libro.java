
public class Libro {
	
	private String ISBN;
	private String titulo;
	private String autor;
	private int npaginas;
	
	/**
	 * Metodo constructo por parametro
	 * @param I
	 * @param t
	 * @param a
	 * @param n
	 */
	public Libro(String I, String t, String a, int n) {
		ISBN=I;
		titulo=t;
		autor=a;
		npaginas=n;
	}
	
	//GETTERS
	public String getISBN() {
		return ISBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public int getNpaginas() {
		return npaginas;
	}
	//SETTERS
	public void setISBN(String ISBN) {
		this.ISBN=ISBN;
	}
	public void setTitulo(String t) {
		this.titulo=t;
	}
	public void setAutor(String a) {
		autor=a;
	}
	public void setNpaginas(int n) {
		npaginas=n;
	}
	
	/**
	 * Metodo toString para mostrar información del libro
	 */
	public String toString() {
		String aux;
		aux="El libro "+titulo+" con ISBN "+ISBN+" creado por el autor "+autor+" tiene "+npaginas+" paginas";
		return aux;
	}
	
	/**
	 * Metodo que compara dos objetos y retorna el titulo del libro con mas paginas. Si son iguales devolvera null
	 * @param l
	 * @return
	 */
	public String masPaginas(Libro l) {
		String res;
		if(l.getNpaginas()>npaginas) {
			res=l.getTitulo();
		}
		else {
			if(l.getNpaginas()<npaginas) {
				res=titulo;
			}
			else {
				res=null;
			}
		}
		return res;
	}
	

}
