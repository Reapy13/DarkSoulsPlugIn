package test;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import equipment.ArmorSet;
import equipment.Chest;
import equipment.Gauntlet;
import equipment.Helm;
import equipment.Leg;
import exception.EmptySetException;
import service.ArmorService;

public class Main {

	private static Logger logger = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {

		ArmorService armorService = new ArmorService();

		Helm helm1 = new Helm();
		Chest chest1 = new Chest();
		Gauntlet gauntlet1 = new Gauntlet();
		Leg leg1 = new Leg();
		Helm helm2 = new Helm();
		Chest chest2 = new Chest();
		Gauntlet gauntlet2 = new Gauntlet();
		Leg leg2 = new Leg();

		helm1.setPhysicalDef(1);
		chest1.setPhysicalDef(3);
		gauntlet1.setPhysicalDef(5);
		leg1.setPhysicalDef(7);
		helm2.setPhysicalDef(1);
		chest2.setPhysicalDef(14);
		gauntlet2.setPhysicalDef(4);
		leg2.setPhysicalDef(6);

		Set<Helm> helms = new HashSet<>();
		Set<Chest> chests = new HashSet<>();
		Set<Gauntlet> gauntlets = new HashSet<>();
		Set<Leg> legs = new HashSet<>();

		//helms.add(helm1);
		//helms.add(helm2);
		chests.add(chest1);
		chests.add(chest2);
		gauntlets.add(gauntlet1);
		gauntlets.add(gauntlet2);
		legs.add(leg1);
		legs.add(leg2);

		try {
			ArmorSet armorSet = armorService.bestPhysicalDefSet(helms, chests, gauntlets, legs);

			logger.log(Level.INFO,
					"Helm : " + armorSet.getHelm().getPhysicalDef() + "\nChest : " + armorSet.getChest().getPhysicalDef()
							+ "\nGauntlet : " + armorSet.getGauntlet().getPhysicalDef() + "\nLeg : "
							+ armorSet.getLeg().getPhysicalDef());
		} catch (EmptySetException e) {
			Main.logger.log(Level.INFO, "La fonction a rencontré une erreur.");
		}
	}
}