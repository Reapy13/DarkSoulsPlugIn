package fr.reapy.model;

import fr.reapy.enumeration.StatBonusEnum;

public abstract class Armor implements IEquipment {

	// Fields
	
	protected String name;
	
	protected StatBonusEnum physicalDefBonus;
	
	protected int physicalDef;
	
	protected int strikeDef;
	
	protected int slashDef;
	
	protected int trustDef;
	
	protected int magicDef;
	
	protected int fireDef;
	
	protected int lightningDef;
	
	protected int darkDef;
	
	protected int poiseRes;
	
	protected int bleedRes;
	
	protected int petrifyRes;
	
	protected int curseRes;
	
	protected double weight;
	
	protected int durability;
	
	// Constructors
	
	public Armor() {
		
	}
	
	public Armor(String name) {
		this.name = name;
	}
	
	// Getters and Setters
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public StatBonusEnum getPhysicalDefBonus() {
		return physicalDefBonus;
	}
	
	public void setPhysicalDefBonus(StatBonusEnum physicalDefBonus) {
		this.physicalDefBonus = physicalDefBonus;
	}
	
	public int getPhysicalDef() {
		return physicalDef;
	}
	
	public void setPhysicalDef(int physicalDef) {
		this.physicalDef = physicalDef;
	}
	
	public int getStrikeDef() {
		return strikeDef;
	}
	
	public void setStrikeDef(int strikeDef) {
		this.strikeDef = strikeDef;
	}
	
	public int getSlashDef() {
		return slashDef;
	}
	
	public void setSlashDef(int slashDef) {
		this.slashDef = slashDef;
	}
	
	public int getTrustDef() {
		return trustDef;
	}
	
	public void setTrustDef(int trustDef) {
		this.trustDef = trustDef;
	}
	
	public int getMagicDef() {
		return magicDef;
	}
	
	public void setMagicDef(int magicDef) {
		this.magicDef = magicDef;
	}
	
	public int getFireDef() {
		return fireDef;
	}
	
	public void setFireDef(int fireDef) {
		this.fireDef = fireDef;
	}
	
	public int getLightningDef() {
		return lightningDef;
	}
	
	public void setLightningDef(int lightningDef) {
		this.lightningDef = lightningDef;
	}
	
	public int getDarkDef() {
		return darkDef;
	}
	
	public void setDarkDef(int darkDef) {
		this.darkDef = darkDef;
	}
	
	public int getPoiseRes() {
		return poiseRes;
	}
	
	public void setPoiseRes(int poiseRes) {
		this.poiseRes = poiseRes;
	}
	
	public int getBleedRes() {
		return bleedRes;
	}
	
	public void setBleedRes(int bleedRes) {
		this.bleedRes = bleedRes;
	}
	
	public int getPetrifyRes() {
		return petrifyRes;
	}
	
	public void setPetrifyRes(int petrifyRes) {
		this.petrifyRes = petrifyRes;
	}
	
	public int getCurseRes() {
		return curseRes;
	}
	
	public void setCurseRes(int curseRes) {
		this.curseRes = curseRes;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public int getDurability() {
		return durability;
	}
	
	public void setDurability(int durability) {
		this.durability = durability;
	}
}