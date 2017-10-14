package fr.reapy.model;

public class ArmorSet {

	// Fields
	
	private Helm helm;
	
	private Chest chest;
	
	private Gauntlet gauntlet;
	
	private Leg leg;
	
	// Constructors
	
	public ArmorSet() {
		this.helm = null;
		this.chest = null;
		this.gauntlet = null;
		this.leg = null;
	}
	
	public ArmorSet(Helm helm, Chest chest, Gauntlet gauntlet, Leg leg) {
		this.helm = helm;
		this.chest = chest;
		this.gauntlet = gauntlet;
		this.leg = leg;
	}
	
	// Getters and Setters
	
	public Helm getHelm() {
		return helm;
	}
	
	public void setHelm(Helm helm) {
		this.helm = helm;
	}
	
	public Chest getChest() {
		return chest;
	}
	
	public void setChest(Chest chest) {
		this.chest = chest;
	}
	
	public Gauntlet getGauntlet() {
		return gauntlet;
	}
	
	public void setGauntlet(Gauntlet gauntlet) {
		this.gauntlet = gauntlet;
	}
	
	public Leg getLeg() {
		return leg;
	}
	
	public void setLeg(Leg leg) {
		this.leg = leg;
	}
}