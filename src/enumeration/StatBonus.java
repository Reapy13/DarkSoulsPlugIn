package enumeration;

public enum StatBonus {
	
	A('A'),
	B('B'),
	C('C'),
	D('D'),
	E('E');

	// Fields
	
	private char level;
	
	// Constructor
	
	private StatBonus(char level) {
		this.level = level;
	}
	
	// Methods
	
	public char getLevel() {
		return level;
	}
}