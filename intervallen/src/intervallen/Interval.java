package intervallen;

/**
 * Each instance of this class represents an
 * interval on the real line.
 * 
 * abstractetoestandsinvariant
 * 
 * @invar | getOndergrens() <= getBovengrens()
 */
class Interval {
	/**
	 * representatie-invariant
	 * 
	 * @invar | 0 <= lengte
	 */
	// representatie =
	// voorstelling in het geheugen
	private int ondergrens;
	private int lengte;
	
	// abstracte toestandsruimte =
	// verzameling van mogelijke abstracte toestanden
	int getOndergrens() { // instantiemethode
		return ondergrens;
	}
	int getBovengrens() {
		return ondergrens + lengte;
	}

	/**
	 * Initializes this instance with the given ondergrens and bovengrens.
	 * 
	 * @pre | ondergrens <= bovengrens
	 * @post | getOndergrens() == ondergrens
	 * @post | getBovengrens() == bovengrens
	 */
	Interval(int ondergrens, int bovengrens) {
		this.ondergrens = ondergrens;
		lengte = bovengrens - ondergrens;
	}
	
	/**
	 * Sets this instance's ondergrens to the given ondergrens.
	 * 
	 * @pre | ondergrens <= getBovengrens()
	 * @mutates | this
	 * @post | getOndergrens() == ondergrens
	 * @post | getBovengrens() == old(getBovengrens())
	 */
	void setOndergrens(int ondergrens) {
		lengte = this.ondergrens + lengte - ondergrens;
		this.ondergrens = ondergrens;
	}

	/**
	 * @pre | meting2 != null
	 * @inspects | this, meting2
	 * @creates | result
	 * @post | result.getOndergrens() == getOndergrens() + meting2.getOndergrens()
	 * @post | result.getBovengrens() == getBovengrens() + meting2.getBovengrens()
	 */
	Interval telOp(Interval meting2) {
		return new Interval(
				this.ondergrens + meting2.ondergrens,
				this.ondergrens + meting2.ondergrens +
				this.lengte + meting2.lengte
			);
	}

}

