package service;

import java.util.Set;

import equipment.ArmorSet;
import equipment.Chest;
import equipment.Gauntlet;
import equipment.Helm;
import equipment.Leg;
import exception.EmptySetException;

public class ArmorService {

	// Methods
	
	public ArmorSet bestPhysicalDefSet(Set<Helm> helms, Set<Chest> chests, Set<Gauntlet> gauntlets, Set<Leg> legs) throws EmptySetException {
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
			throw new EmptySetException();
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
			throw new EmptySetException();
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
			throw new EmptySetException();
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
			throw new EmptySetException();
		}
		
		armorSet.setHelm(helmTmp);
		armorSet.setChest(chestTmp);
		armorSet.setGauntlet(gauntletTmp);
		armorSet.setLeg(legTmp);
		
		return armorSet;
	}
}