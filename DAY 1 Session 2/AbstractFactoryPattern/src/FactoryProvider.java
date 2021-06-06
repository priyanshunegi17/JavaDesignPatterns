public class FactoryProvider {

	public static Factory getFactory(String type) {
		if (type.equalsIgnoreCase("audi")) {
			return new AudiFactory();
		} else if (type.equalsIgnoreCase("mercedes")) {
			return new MercedesFactory();
		}
		return null;
	}
}
