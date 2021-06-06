public class Main {

	public static void main(String[] args) {
		DBConn con= DBConn.getInstance();
		
		if(con instanceof DBConn) {
			System.out.println("Singleton Pattern");
		}
		
//		DBConn con1= DBConn.getInstance();
//		DBConn con2= DBConn.getInstance();
//		System.out.println(con1==con2);
		
		
	}

}
