package fr.reapy.enumeration;

public enum StatBonusEnum {
	
	A('A'),
	B('B'),
	C('C'),
	D('D'),
	E('E');

	// Fields
	
	private char level;
	
	// Constructor
	
	private StatBonusEnum(char level) {
		this.level = level;
	}
	
	// Methods
	
	public char getLevel() {
		return level;
	}
}