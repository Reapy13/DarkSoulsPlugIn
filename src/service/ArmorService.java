package service;

import java.util.List;

import equipment.ArmorSet;
import equipment.Chest;
import equipment.Gauntlet;
import equipment.Helm;
import equipment.Leg;
import exception.EmptyListException;

public class ArmorService {

	// Methods
	
	public ArmorSet bestPhysicalDefSet(List<Helm> helms, List<Chest> chests, List<Gauntlet> gauntlets, List<Leg> legs) throws EmptyListException {
		ArmorSet armorSet = new ArmorSet();
		
		Helm helmTmp = null;
		for (Helm helm : helms) {
			if (helmTmp == null) {
				helmTmp = helm;
			} else {
				if (helm.getPhysicalDef() > helmTmp.getPhysicalDef()) {
					helmTmp = helm;
				}
			}
		}
		if (helmTmp == null) {
			throw new EmptyListException();
		}
		
		Chest chestTmp = null;
		for (Chest chest : chests) {
			if (chestTmp == null) {
				chestTmp = chest;
			} else {
				if (chest.getPhysicalDef() > chestTmp.getPhysicalDef()) {
					chestTmp = chest;
				}
			}
		}
		if (chestTmp == null) {
			throw new EmptyListException();
		}
		
		Gauntlet gauntletTmp = null;
		for (Gauntlet gauntlet : gauntlets) {
			if (gauntletTmp == null) {
				gauntletTmp = gauntlet;
			} else {
				if (gauntlet.getPhysicalDef() > gauntletTmp.getPhysicalDef()) {
					gauntletTmp = gauntlet;
				}
			}
		}
		if (gauntletTmp == null) {
			throw new EmptyListException();
		}
		
		Leg legTmp = null;
		for (Leg leg : legs) {
			if (legTmp == null) {
				legTmp = leg;
			} else {
				if (leg.getPhysicalDef() > legTmp.getPhysicalDef()) {
					legTmp = leg;
				}
			}
		}
		if (legTmp == null) {
			throw new EmptyListException();
		}
		
		armorSet.setHelm(helmTmp);
		armorSet.setChest(chestTmp);
		armorSet.setGauntlet(gauntletTmp);
		armorSet.setLeg(legTmp);
		
		return armorSet;
	}
	
	public ArmorSet bestMagicDefSet(List<Helm> helms, List<Chest> chests, List<Gauntlet> gauntlets, List<Leg> legs) throws EmptyListException {
		ArmorSet armorSet = new ArmorSet();
		
		Helm helmTmp = null;
		for (Helm helm : helms) {
			if (helmTmp == null) {
				helmTmp = helm;
			} else {
				if (helm.getMagicDef() > helmTmp.getMagicDef()) {
					helmTmp = helm;
				}
			}
		}
		if (helmTmp == null) {
			throw new EmptyListException();
		}
		
		Chest chestTmp = null;
		for (Chest chest : chests) {
			if (chestTmp == null) {
				chestTmp = chest;
			} else {
				if (chest.getMagicDef() > chestTmp.getMagicDef()) {
					chestTmp = chest;
				}
			}
		}
		if (chestTmp == null) {
			throw new EmptyListException();
		}
		
		Gauntlet gauntletTmp = null;
		for (Gauntlet gauntlet : gauntlets) {
			if (gauntletTmp == null) {
				gauntletTmp = gauntlet;
			} else {
				if (gauntlet.getMagicDef() > gauntletTmp.getMagicDef()) {
					gauntletTmp = gauntlet;
				}
			}
		}
		if (gauntletTmp == null) {
			throw new EmptyListException();
		}
		
		Leg legTmp = null;
		for (Leg leg : legs) {
			if (legTmp == null) {
				legTmp = leg;
			} else {
				if (leg.getMagicDef() > legTmp.getMagicDef()) {
					legTmp = leg;
				}
			}
		}
		if (legTmp == null) {
			throw new EmptyListException();
		}
		
		armorSet.setHelm(helmTmp);
		armorSet.setChest(chestTmp);
		armorSet.setGauntlet(gauntletTmp);
		armorSet.setLeg(legTmp);
		
		return armorSet;
	}
	
	public ArmorSet bestFireDefSet(List<Helm> helms, List<Chest> chests, List<Gauntlet> gauntlets, List<Leg> legs) throws EmptyListException {
		ArmorSet armorSet = new ArmorSet();
		
		Helm helmTmp = null;
		for (Helm helm : helms) {
			if (helmTmp == null) {
				helmTmp = helm;
			} else {
				if (helm.getFireDef() > helmTmp.getFireDef()) {
					helmTmp = helm;
				}
			}
		}
		if (helmTmp == null) {
			throw new EmptyListException();
		}
		
		Chest chestTmp = null;
		for (Chest chest : chests) {
			if (chestTmp == null) {
				chestTmp = chest;
			} else {
				if (chest.getFireDef() > chestTmp.getFireDef()) {
					chestTmp = chest;
				}
			}
		}
		if (chestTmp == null) {
			throw new EmptyListException();
		}
		
		Gauntlet gauntletTmp = null;
		for (Gauntlet gauntlet : gauntlets) {
			if (gauntletTmp == null) {
				gauntletTmp = gauntlet;
			} else {
				if (gauntlet.getFireDef() > gauntletTmp.getFireDef()) {
					gauntletTmp = gauntlet;
				}
			}
		}
		if (gauntletTmp == null) {
			throw new EmptyListException();
		}
		
		Leg legTmp = null;
		for (Leg leg : legs) {
			if (legTmp == null) {
				legTmp = leg;
			} else {
				if (leg.getFireDef() > legTmp.getFireDef()) {
					legTmp = leg;
				}
			}
		}
		if (legTmp == null) {
			throw new EmptyListException();
		}
		
		armorSet.setHelm(helmTmp);
		armorSet.setChest(chestTmp);
		armorSet.setGauntlet(gauntletTmp);
		armorSet.setLeg(legTmp);
		
		return armorSet;
	}
	
	public ArmorSet bestLightningDefSet(List<Helm> helms, List<Chest> chests, List<Gauntlet> gauntlets, List<Leg> legs) throws EmptyListException {
		ArmorSet armorSet = new ArmorSet();
		
		Helm helmTmp = null;
		for (Helm helm : helms) {
			if (helmTmp == null) {
				helmTmp = helm;
			} else {
				if (helm.getLightningDef() > helmTmp.getLightningDef()) {
					helmTmp = helm;
				}
			}
		}
		if (helmTmp == null) {
			throw new EmptyListException();
		}
		
		Chest chestTmp = null;
		for (Chest chest : chests) {
			if (chestTmp == null) {
				chestTmp = chest;
			} else {
				if (chest.getLightningDef() > chestTmp.getLightningDef()) {
					chestTmp = chest;
				}
			}
		}
		if (chestTmp == null) {
			throw new EmptyListException();
		}
		
		Gauntlet gauntletTmp = null;
		for (Gauntlet gauntlet : gauntlets) {
			if (gauntletTmp == null) {
				gauntletTmp = gauntlet;
			} else {
				if (gauntlet.getLightningDef() > gauntletTmp.getLightningDef()) {
					gauntletTmp = gauntlet;
				}
			}
		}
		if (gauntletTmp == null) {
			throw new EmptyListException();
		}
		
		Leg legTmp = null;
		for (Leg leg : legs) {
			if (legTmp == null) {
				legTmp = leg;
			} else {
				if (leg.getLightningDef() > legTmp.getLightningDef()) {
					legTmp = leg;
				}
			}
		}
		if (legTmp == null) {
			throw new EmptyListException();
		}
		
		armorSet.setHelm(helmTmp);
		armorSet.setChest(chestTmp);
		armorSet.setGauntlet(gauntletTmp);
		armorSet.setLeg(legTmp);
		
		return armorSet;
	}
	
	public ArmorSet bestDarkDefSet(List<Helm> helms, List<Chest> chests, List<Gauntlet> gauntlets, List<Leg> legs) throws EmptyListException {
		ArmorSet armorSet = new ArmorSet();
		
		Helm helmTmp = null;
		for (Helm helm : helms) {
			if (helmTmp == null) {
				helmTmp = helm;
			} else {
				if (helm.getDarkDef() > helmTmp.getDarkDef()) {
					helmTmp = helm;
				}
			}
		}
		if (helmTmp == null) {
			throw new EmptyListException();
		}
		
		Chest chestTmp = null;
		for (Chest chest : chests) {
			if (chestTmp == null) {
				chestTmp = chest;
			} else {
				if (chest.getDarkDef() > chestTmp.getDarkDef()) {
					chestTmp = chest;
				}
			}
		}
		if (chestTmp == null) {
			throw new EmptyListException();
		}
		
		Gauntlet gauntletTmp = null;
		for (Gauntlet gauntlet : gauntlets) {
			if (gauntletTmp == null) {
				gauntletTmp = gauntlet;
			} else {
				if (gauntlet.getDarkDef() > gauntletTmp.getDarkDef()) {
					gauntletTmp = gauntlet;
				}
			}
		}
		if (gauntletTmp == null) {
			throw new EmptyListException();
		}
		
		Leg legTmp = null;
		for (Leg leg : legs) {
			if (legTmp == null) {
				legTmp = leg;
			} else {
				if (leg.getDarkDef() > legTmp.getDarkDef()) {
					legTmp = leg;
				}
			}
		}
		if (legTmp == null) {
			throw new EmptyListException();
		}
		
		armorSet.setHelm(helmTmp);
		armorSet.setChest(chestTmp);
		armorSet.setGauntlet(gauntletTmp);
		armorSet.setLeg(legTmp);
		
		return armorSet;
	}
}