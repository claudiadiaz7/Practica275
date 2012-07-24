package modulo3.ejercicio1.domain;

public class TestMyPoint {

	
	public static void main(String[] args) {
		MyPoint start = new MyPoint();
		MyPoint end = new MyPoint();
		start.x=10;
	    start.y= 10;
	    end.x= 20;
	    end.y=30;
	    MyPoint stray = new MyPoint();
	    
	    System.out.println("Start point is " + start.toString());
	    System.out.println("End point is " + end.toString());
	    stray = end;
	    System.out.println("Stray point is " + stray.toString());
	    System.out.println("End point is " + end.toString());
	    stray.x=47;
	    stray.y=50;
	    System.out.println("Stray point is " + stray.toString());
	    
	    System.out.println("End point is " + end.toString());
	    System.out.println("Start point is " + start.toString());
	}

}
