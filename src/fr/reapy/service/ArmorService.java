package fr.reapy.service;

import java.util.List;

import fr.reapy.enumeration.ElementEnum;
import fr.reapy.exception.ElementNotSupportedException;
import fr.reapy.exception.EmptyListException;
import fr.reapy.model.Armor;
import fr.reapy.model.ArmorSet;
import fr.reapy.model.Chest;
import fr.reapy.model.Gauntlet;
import fr.reapy.model.Helm;
import fr.reapy.model.Leg;

public class ArmorService {

	// Methods

	private void emptyList(List<? extends Armor> list) throws EmptyListException {
		if (list.isEmpty()) {
			throw new EmptyListException();
		}
	}

	private void emptyLists(List<Helm> helms, List<Chest> chests, List<Gauntlet> gauntlets, List<Leg> legs)
			throws EmptyListException {
		emptyList(helms);
		emptyList(chests);
		emptyList(gauntlets);
		emptyList(legs);
	}

	private Armor bestElementInListByElement(List<? extends Armor> armors, ElementEnum enumeration)
			throws ElementNotSupportedException {
		Armor armorReturned = null;
		for (Armor armor : armors) {
			if (armorReturned == null) {
				armorReturned = armor;
			} else {
				switch (enumeration) {
				case PHYSICAL:
					if (armor.getPhysicalDef() > armorReturned.getPhysicalDef()) {
						armorReturned = armor;
					}
					break;
				case STRIKE:
					if (armor.getStrikeDef() > armorReturned.getStrikeDef()) {
						armorReturned = armor;
					}
					break;
				case SLASH:
					if (armor.getSlashDef() > armorReturned.getSlashDef()) {
						armorReturned = armor;
					}
					break;
				case TRUST:
					if (armor.getTrustDef() > armorReturned.getTrustDef()) {
						armorReturned = armor;
					}
					break;
				case MAGIC:
					if (armor.getMagicDef() > armorReturned.getMagicDef()) {
						armorReturned = armor;
					}
					break;
				case FIRE:
					if (armor.getFireDef() > armorReturned.getFireDef()) {
						armorReturned = armor;
					}
					break;
				case LIGHTNING:
					if (armor.getLightningDef() > armorReturned.getLightningDef()) {
						armorReturned = armor;
					}
					break;
				case DARK:
					if (armor.getDarkDef() > armorReturned.getDarkDef()) {
						armorReturned = armor;
					}
					break;
				default:
					throw new ElementNotSupportedException();
				}
			}
		}

		return armorReturned;
	}

	public ArmorSet bestDefSetByElement(List<Helm> helms, List<Chest> chests, List<Gauntlet> gauntlets, List<Leg> legs,
			ElementEnum element) throws EmptyListException, ElementNotSupportedException {
		// Testing of the lists
		emptyLists(helms, chests, gauntlets, legs);

		// Creation of the armor set
		return new ArmorSet((Helm) bestElementInListByElement(helms, element),
				(Chest) bestElementInListByElement(chests, element), (Gauntlet) bestElementInListByElement(gauntlets, element),
				(Leg) bestElementInListByElement(legs, element));
	}
}