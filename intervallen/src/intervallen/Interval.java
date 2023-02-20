package intervallen;

class Interval {
	// representatie =
	// voorstelling in het geheugen
	private int ondergrens;
	private int lengte;
	
	int getOndergrens() { // instantiemethode
		return this.ondergrens;
	}
	int getBovengrens() {
		return this.ondergrens + this.lengte;
	}

	Interval(int ondergrens, int bovengrens) {
		this.ondergrens = ondergrens;
		this.lengte = bovengrens - ondergrens;
	}

	Interval telOp(Interval meting2) {
		return new Interval(
				this.ondergrens + meting2.ondergrens,
				this.ondergrens + meting2.ondergrens +
				this.lengte + meting2.lengte
			);
	}

}

