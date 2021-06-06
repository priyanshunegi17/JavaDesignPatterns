
public class Main {

	public static void main(String[] args) {
		
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter mp = new MovableAdapterImpl(bugattiVeyron);
		System.out.println("Speed in MPH: "+bugattiVeyron.getSpeed());
		System.out.println("Speed in KMPH: "+mp.getSpeed());
		System.out.println("Price in USD: "+bugattiVeyron.getPrice());
		System.out.println("Price in EURO: "+mp.getPrice());
		
	}

}
