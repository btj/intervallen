package intervallen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervallenTest {
	
	@Test
	void test() { // klantmodule van Interval
		Interval meting1 = Interval.maakInterval(49, 51);
		
		Interval meting2 = Interval.maakInterval(16, 20);
		
		Interval totaleLengte = Interval.telOp(meting1, meting2);
		
		assert Interval.getOndergrens(totaleLengte) == 65;
		assert Interval.getBovengrens(totaleLengte) == 71;
		
		assert Interval.getOndergrens(totaleLengte) == 65;
	}

}
