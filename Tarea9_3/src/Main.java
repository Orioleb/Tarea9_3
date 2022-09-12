
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro l1=new Libro("f6hr-hfye6","LOST","Edgar Miller",70);
		Libro l2=new Libro("afd5-let7s","FOUND","Thomas Eriksen", 80);
		
		//Llamada metodo toString
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		
		//Llamada metodo masPaginas
		if(l1.masPaginas(l2)==null) {
			System.out.println("Ambos libros tienen las mismas paginas");
		}
		else {
			System.out.println("\nTiene mas paginas el libro "+l1.masPaginas(l2));
		}
	

	}

}
