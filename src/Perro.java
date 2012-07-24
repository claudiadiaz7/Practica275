
public class Perro {
	private int peso;
	
	public Perro(){	
	}
	
	public Perro(int p) {
		peso = p;
	}
	
	public Perro(int p, boolean mostrar) {
		peso = p;
		if (mostrar){
		System.out.println("El peso Inicial del Perro es:  "+peso);
		}
	}
		
    public int getPeso(){
    	return peso;
    }
    
    public void setPeso(int nuevoPeso){
    	if (nuevoPeso>0) {
    		peso = nuevoPeso;
    	}
    }
}
