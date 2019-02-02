/**
 * 
 */
package com.soen.risk.model;

/**
 * @author yogesh
 *
 * The Enum Card.
 */
public enum RiskCard {

	/** The infant. */
	INFANT("Infant"),
	/** The cavalry. */
	CAVALRY("Cavalry"),
	/** The artillery. */
	ARTILLERY("Artillery");

	/** The name. */
	private final String name;

	/**
	 * Instantiates a new card.
	 *
	 * @param name the name
	 */
	private RiskCard(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Enum#toString()
	 */
	public String toString() {
		return this.name;
	}

}
