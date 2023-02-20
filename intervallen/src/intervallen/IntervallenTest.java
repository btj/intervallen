package intervallen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervallenTest {
	
	@Test
	void test() { // klantmodule van Interval
		Interval meting1 = new Interval(49, 51);
		
		Interval meting2 = new Interval(16, 20);
		
		Interval totaleLengte = meting1.telOp(meting2);
		
		assert totaleLengte.getOndergrens() == 65;
		assert totaleLengte.getBovengrens() == 71;
		
		totaleLengte.setOndergrens(71);
		assert totaleLengte.getOndergrens() == 71;
		assert totaleLengte.getBovengrens() == 71;
	}

}
