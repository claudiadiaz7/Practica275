
public class MyPointTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyPoint start = new MyPoint();
		MyPoint end = new MyPoint();
		MyPoint stray;
		
		start.x=10;
		start.y=10;		
		end.x=20;
		end.y=30;
		stray=end;
		
		System.out.println("start es " + start.toString());
		System.out.println("end es " + end.toString());
		System.out.println("stray es " + stray.toString());
		
		stray.x=47;
		stray.y=50;
		
		System.out.println("--------");
		System.out.println("start es " + start.toString());
		System.out.println("end es " + end.toString());
		System.out.println("stray es " + stray.toString());
	}

}
