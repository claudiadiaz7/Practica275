
public class PerroTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Perro d = new Perro();
         System.out.println("El peso del Perro d es:  "+d.getPeso());
         Perro otroPerro=new Perro(5);
         d.setPeso(42);
         System.out.println("El peso del Perro d es:  "+d.getPeso());
         System.out.println("El peso del otro Perro es:  "+ otroPerro.getPeso());
         d.setPeso(-42);
         System.out.println("El peso del Perro d es:  "+d.getPeso());
         Perro OtroPerro=new Perro(10,true);
	}

}
