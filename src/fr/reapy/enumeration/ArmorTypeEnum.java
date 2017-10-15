package fr.reapy.enumeration;

public enum ArmorTypeEnum {

	HELM("resources/data/helmsOwned"),
	CHEST("/resources/data/chestsOwned"),
	GAUNTLET("resources/data/gauntletsOwned"),
	LEG("/resources/data/legsOwned"),
	DEFAULT();
	
	// Fields
	
	private String path;
	
	// Constructors
	
	private ArmorTypeEnum() {
		
	}
	
	private ArmorTypeEnum(String path) {
		this.path = path;
	}
	
	// Getters and Setters
	
	public String getPath() {
		return path;
	}
}