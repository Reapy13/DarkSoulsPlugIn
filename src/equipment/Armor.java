package equipment;

import enumeration.StatBonus;

public abstract class Armor implements IEquipment {

	// Fields
	
	private String name;
	
	private StatBonus physicalDefBonus;
	
	private int physicalDef;
	
	private int strikeDef;
	
	private int slashDef;
	
	private int trustDef;
	
	private int magicDef;
	
	private int fireDef;
	
	private int lightningDef;
	
	private int darkDef;
	
	private int poiseRes;
	
	private int bleedRes;
	
	private int petrifyRes;
	
	private int curseRes;
	
	private double weight;
	
	private int durability;
	
	// Getters and Setters
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public StatBonus getPhysicalDefBonus() {
		return physicalDefBonus;
	}
	
	public void setPhysicalDefBonus(StatBonus physicalDefBonus) {
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