package sef.module7.activity;

/**
 * An implementation of the Denomination interface.  The equality test for between instances
 * of this class considers the name and the symbol
 * 
 * @author John Doe
 *
 */
public class DenominationImpl implements Denomination {

	private String description;
	private String name;
	private String symbol;
	
	/**
	 * Creates a new instance with the specified parameters
	 * 
	 * @param name the name of the denomination
	 * @param description a description 
	 * @param symbol
	 */
	public DenominationImpl(String name, String description, String symbol) {
		this.name = name;
		this.description = description;
		this.symbol = symbol;
	}

	/* (non-Javadoc)
	 * @see sef.module6.activity.Denomination#getDescription()
	 */
	public String getDescription() {
		return this.description;
	}
	
	/* (non-Javadoc)
	 * @see sef.module6.activity.Denomination#getName()
	 */
	public String getName() {
		return this.name;
	}

	/* (non-Javadoc)
	 * @see sef.module6.activity.Denomination#getSymbol()
	 */
	public String getSymbol() {
		return this.symbol;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object o) {
		
		if (! (o instanceof Denomination) )
			return false;
		
		Denomination d = (Denomination) o;
		
		return d.getName().equals(this.getName())
				&&
				d.getSymbol().equals(this.getSymbol());

	}

}
