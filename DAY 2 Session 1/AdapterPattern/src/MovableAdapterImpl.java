
public class MovableAdapterImpl implements MovableAdapter{

	private Movable luxuryCars;
	
	public MovableAdapterImpl(Movable m) {
		luxuryCars = m;
	}
	
	@Override
	public double getSpeed() {
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}

	@Override
	public double getPrice() {
		return convertUSDtoEURO(luxuryCars.getPrice());
	}
	
	private double convertMPHtoKMPH(double mph) {
		return mph*1.60934;
	}
	
	private double convertUSDtoEURO(double usd) {
		return usd*0.82;
	}
	
}
