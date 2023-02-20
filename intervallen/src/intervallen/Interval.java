package intervallen;

class Interval {
	// representatie =
	// voorstelling in het geheugen
	private int ondergrens;
	private int lengte;
	
	static int getOndergrens(Interval interval) {
		return interval.ondergrens;
	}
	static int getBovengrens(Interval interval) {
		return interval.ondergrens + interval.lengte;
	}

	static Interval maakInterval(int ondergrens,
			int bovengrens) {
		Interval result = new Interval();
		result.ondergrens = ondergrens;
		result.lengte = bovengrens - ondergrens;
		return result;
	}

	static Interval telOp(Interval meting1,
			Interval meting2) {
		return maakInterval(
				meting1.ondergrens + meting2.ondergrens,
				meting1.lengte + meting2.lengte
			);
	}

}

