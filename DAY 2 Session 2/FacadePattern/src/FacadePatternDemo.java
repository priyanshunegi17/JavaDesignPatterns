import java.util.Scanner;

public class FacadePatternDemo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the type of shape you want to draw");
		String shape = sc.nextLine();
		
		ShapeMaker sm = new ShapeMaker();
		
		if(shape.equalsIgnoreCase("circle")) {
			sm.drawCircle();
		}
		else if(shape.equalsIgnoreCase("rectangle")) {
			sm.drawRectangle();
		}
		else {
			sm.drawSquare();
		}
		
	}
}
