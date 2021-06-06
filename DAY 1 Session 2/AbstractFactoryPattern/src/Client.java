import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("which Brand ?");
		String brand = sc.nextLine();
		Factory factory = FactoryProvider.getFactory(brand);
		factory.makeHeadlight();
		factory.makeTire();
		
	}

}
