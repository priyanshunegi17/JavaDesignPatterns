import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdapterPatternTest {

	@Test 
	public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() { 
		Movable bugattiVeyron = new BugattiVeyron(); 
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron); 
		assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001); 
		}
	
	@Test 
	public void whenConvertingUSDToEURO_thenSuccessfullyConverted() { 
		Movable bugattiVeyron = new BugattiVeyron(); 
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron); 
		assertEquals(bugattiVeyronAdapter.getPrice(), 820.0, 0.00001); 
	}

}
