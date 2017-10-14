package fr.reapy.serviceTest;

import static org.junit.Assert.assertSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import equipment.ArmorSet;
import equipment.Chest;
import equipment.Gauntlet;
import equipment.Helm;
import equipment.Leg;
import exception.EmptyListException;
import service.ArmorService;

public class ArmorServiceTest {
	
	/**
	 * Développer plus largement les tests
	 * Fractionner le code
	 */
	
	// Fields
	
	private ArmorService armorService = new ArmorService();
	
	private Helm helm1, helm2, helm3;
	private Chest chest1, chest2, chest3;
	private Gauntlet gauntlet1, gauntlet2, gauntlet3;
	private Leg leg1, leg2, leg3;

	private List<Helm> helms = new ArrayList<>();
	private List<Chest> chests = new ArrayList<>();
	private List<Gauntlet> gauntlets = new ArrayList<>();
	private List<Leg> legs = new ArrayList<>();
	
	@Before
	public void init() {
		helm1 = new Helm();
		chest1 = new Chest();
		gauntlet1 = new Gauntlet();
		leg1 = new Leg();
		helm2 = new Helm();
		chest2 = new Chest();
		gauntlet2 = new Gauntlet();
		leg2 = new Leg();
		helm3 = new Helm();
		chest3 = new Chest();
		gauntlet3 = new Gauntlet();
		leg3 = new Leg();
	}

	@Test
	public void bestPhysicalDefSetTest() throws EmptyListException {
		helm1.setPhysicalDef(2);
		chest1.setPhysicalDef(3);
		gauntlet1.setPhysicalDef(5);
		leg1.setPhysicalDef(7);
		helm2.setPhysicalDef(1);
		chest2.setPhysicalDef(14);
		gauntlet2.setPhysicalDef(4);
		leg2.setPhysicalDef(6);
		helm3.setPhysicalDef(3);
		chest3.setPhysicalDef(7);
		gauntlet3.setPhysicalDef(6);
		leg3.setPhysicalDef(8);

		helms.add(helm1);
		helms.add(helm2);
		helms.add(helm3);
		chests.add(chest1);
		chests.add(chest2);
		chests.add(chest3);
		gauntlets.add(gauntlet1);
		gauntlets.add(gauntlet2);
		gauntlets.add(gauntlet3);
		legs.add(leg1);
		legs.add(leg2);
		legs.add(leg3);
		
		ArmorSet armorSetTest = new ArmorSet(helm3, chest2, gauntlet3, leg3);
		
		ArmorSet armorSet = armorService.bestPhysicalDefSet(helms, chests, gauntlets, legs);
		assertSame(armorSet.getHelm(), armorSetTest.getHelm());
		assertSame(armorSet.getChest(), armorSetTest.getChest());
		assertSame(armorSet.getGauntlet(), armorSetTest.getGauntlet());
		assertSame(armorSet.getLeg(), armorSetTest.getLeg());

		legs.clear();
		
		try {
			armorSet = armorService.bestPhysicalDefSet(helms, chests, gauntlets, legs);
			assert(false);
		} catch (EmptyListException e) {
			assert(true);
		}

		gauntlets.clear();
		
		try {
			armorSet = armorService.bestPhysicalDefSet(helms, chests, gauntlets, legs);
			assert(false);
		} catch (EmptyListException e) {
			assert(true);
		}

		chests.clear();
		
		try {
			armorSet = armorService.bestPhysicalDefSet(helms, chests, gauntlets, legs);
			assert(false);
		} catch (EmptyListException e) {
			assert(true);
		}

		helms.clear();
		
		try {
			armorSet = armorService.bestPhysicalDefSet(helms, chests, gauntlets, legs);
			assert(false);
		} catch (EmptyListException e) {
			assert(true);
		}
	}

	@Test
	public void bestMagicDefSetTest() throws EmptyListException {
		helm1.setMagicDef(2);
		chest1.setMagicDef(3);
		gauntlet1.setMagicDef(5);
		leg1.setMagicDef(7);
		helm2.setMagicDef(1);
		chest2.setMagicDef(14);
		gauntlet2.setMagicDef(4);
		leg2.setMagicDef(6);
		helm3.setMagicDef(3);
		chest3.setMagicDef(7);
		gauntlet3.setMagicDef(6);
		leg3.setMagicDef(8);

		helms.add(helm1);
		helms.add(helm2);
		helms.add(helm3);
		chests.add(chest1);
		chests.add(chest2);
		chests.add(chest3);
		gauntlets.add(gauntlet1);
		gauntlets.add(gauntlet2);
		gauntlets.add(gauntlet3);
		legs.add(leg1);
		legs.add(leg2);
		legs.add(leg3);
		
		ArmorSet armorSetTest = new ArmorSet(helm3, chest2, gauntlet3, leg3);
		
		ArmorSet armorSet = armorService.bestMagicDefSet(helms, chests, gauntlets, legs);
		assertSame(armorSet.getHelm(), armorSetTest.getHelm());
		assertSame(armorSet.getChest(), armorSetTest.getChest());
		assertSame(armorSet.getGauntlet(), armorSetTest.getGauntlet());
		assertSame(armorSet.getLeg(), armorSetTest.getLeg());
		
		legs.clear();
		
		try {
			armorSet = armorService.bestMagicDefSet(helms, chests, gauntlets, legs);
			assert(false);
		} catch (EmptyListException e) {
			assert(true);
		}
		
		gauntlets.clear();
		
		try {
			armorSet = armorService.bestMagicDefSet(helms, chests, gauntlets, legs);
			assert(false);
		} catch (EmptyListException e) {
			assert(true);
		}
		
		chests.clear();
		
		try {
			armorSet = armorService.bestMagicDefSet(helms, chests, gauntlets, legs);
			assert(false);
		} catch (EmptyListException e) {
			assert(true);
		}
		
		helms.clear();
		
		try {
			armorSet = armorService.bestMagicDefSet(helms, chests, gauntlets, legs);
			assert(false);
		} catch (EmptyListException e) {
			assert(true);
		}
	}

	@Test
	public void bestFireDefSetTest() throws EmptyListException {
		helm1.setFireDef(2);
		chest1.setFireDef(3);
		gauntlet1.setFireDef(5);
		leg1.setFireDef(7);
		helm2.setFireDef(1);
		chest2.setFireDef(14);
		gauntlet2.setFireDef(4);
		leg2.setFireDef(6);
		helm3.setFireDef(3);
		chest3.setFireDef(7);
		gauntlet3.setFireDef(6);
		leg3.setFireDef(8);

		helms.add(helm1);
		helms.add(helm2);
		helms.add(helm3);
		chests.add(chest1);
		chests.add(chest2);
		chests.add(chest3);
		gauntlets.add(gauntlet1);
		gauntlets.add(gauntlet2);
		gauntlets.add(gauntlet3);
		legs.add(leg1);
		legs.add(leg2);
		legs.add(leg3);
		
		ArmorSet armorSetTest = new ArmorSet(helm3, chest2, gauntlet3, leg3);
		
		ArmorSet armorSet = armorService.bestFireDefSet(helms, chests, gauntlets, legs);
		assertSame(armorSet.getHelm(), armorSetTest.getHelm());
		assertSame(armorSet.getChest(), armorSetTest.getChest());
		assertSame(armorSet.getGauntlet(), armorSetTest.getGauntlet());
		assertSame(armorSet.getLeg(), armorSetTest.getLeg());
		
		legs.clear();
		
		try {
			armorSet = armorService.bestFireDefSet(helms, chests, gauntlets, legs);
			assert(false);
		} catch (EmptyListException e) {
			assert(true);
		}
		
		gauntlets.clear();
		
		try {
			armorSet = armorService.bestFireDefSet(helms, chests, gauntlets, legs);
			assert(false);
		} catch (EmptyListException e) {
			assert(true);
		}
		
		chests.clear();
		
		try {
			armorSet = armorService.bestFireDefSet(helms, chests, gauntlets, legs);
			assert(false);
		} catch (EmptyListException e) {
			assert(true);
		}
		
		helms.clear();
		
		try {
			armorSet = armorService.bestFireDefSet(helms, chests, gauntlets, legs);
			assert(false);
		} catch (EmptyListException e) {
			assert(true);
		}
	}

	@Test
	public void bestLightningDefSetTest() throws EmptyListException {
		helm1.setLightningDef(2);
		chest1.setLightningDef(3);
		gauntlet1.setLightningDef(5);
		leg1.setLightningDef(7);
		helm2.setLightningDef(1);
		chest2.setLightningDef(14);
		gauntlet2.setLightningDef(4);
		leg2.setLightningDef(6);
		helm3.setLightningDef(3);
		chest3.setLightningDef(7);
		gauntlet3.setLightningDef(6);
		leg3.setLightningDef(8);

		helms.add(helm1);
		helms.add(helm2);
		helms.add(helm3);
		chests.add(chest1);
		chests.add(chest2);
		chests.add(chest3);
		gauntlets.add(gauntlet1);
		gauntlets.add(gauntlet2);
		gauntlets.add(gauntlet3);
		legs.add(leg1);
		legs.add(leg2);
		legs.add(leg3);
		
		ArmorSet armorSetTest = new ArmorSet(helm3, chest2, gauntlet3, leg3);
		
		ArmorSet armorSet = armorService.bestLightningDefSet(helms, chests, gauntlets, legs);
		assertSame(armorSet.getHelm(), armorSetTest.getHelm());
		assertSame(armorSet.getChest(), armorSetTest.getChest());
		assertSame(armorSet.getGauntlet(), armorSetTest.getGauntlet());
		assertSame(armorSet.getLeg(), armorSetTest.getLeg());
		
		legs.clear();
		
		try {
			armorSet = armorService.bestLightningDefSet(helms, chests, gauntlets, legs);
			assert(false);
		} catch (EmptyListException e) {
			assert(true);
		}
		
		gauntlets.clear();
		
		try {
			armorSet = armorService.bestLightningDefSet(helms, chests, gauntlets, legs);
			assert(false);
		} catch (EmptyListException e) {
			assert(true);
		}
		
		chests.clear();
		
		try {
			armorSet = armorService.bestLightningDefSet(helms, chests, gauntlets, legs);
			assert(false);
		} catch (EmptyListException e) {
			assert(true);
		}
		
		helms.clear();
		
		try {
			armorSet = armorService.bestLightningDefSet(helms, chests, gauntlets, legs);
			assert(false);
		} catch (EmptyListException e) {
			assert(true);
		}
	}

	@Test
	public void bestDarkDefSetTest() throws EmptyListException {
		helm1.setDarkDef(2);
		chest1.setDarkDef(3);
		gauntlet1.setDarkDef(5);
		leg1.setDarkDef(7);
		helm2.setDarkDef(1);
		chest2.setDarkDef(14);
		gauntlet2.setDarkDef(4);
		leg2.setDarkDef(6);
		helm3.setDarkDef(3);
		chest3.setDarkDef(7);
		gauntlet3.setDarkDef(6);
		leg3.setDarkDef(8);

		helms.add(helm1);
		helms.add(helm2);
		helms.add(helm3);
		chests.add(chest1);
		chests.add(chest2);
		chests.add(chest3);
		gauntlets.add(gauntlet1);
		gauntlets.add(gauntlet2);
		gauntlets.add(gauntlet3);
		legs.add(leg1);
		legs.add(leg2);
		legs.add(leg3);
		
		ArmorSet armorSetTest = new ArmorSet(helm3, chest2, gauntlet3, leg3);
		
		ArmorSet armorSet = armorService.bestDarkDefSet(helms, chests, gauntlets, legs);
		assertSame(armorSet.getHelm(), armorSetTest.getHelm());
		assertSame(armorSet.getChest(), armorSetTest.getChest());
		assertSame(armorSet.getGauntlet(), armorSetTest.getGauntlet());
		assertSame(armorSet.getLeg(), armorSetTest.getLeg());
		
		legs.clear();
		
		try {
			armorSet = armorService.bestDarkDefSet(helms, chests, gauntlets, legs);
			assert(false);
		} catch (EmptyListException e) {
			assert(true);
		}
		
		gauntlets.clear();
		
		try {
			armorSet = armorService.bestDarkDefSet(helms, chests, gauntlets, legs);
			assert(false);
		} catch (EmptyListException e) {
			assert(true);
		}
		
		chests.clear();
		
		try {
			armorSet = armorService.bestDarkDefSet(helms, chests, gauntlets, legs);
			assert(false);
		} catch (EmptyListException e) {
			assert(true);
		}
		
		helms.clear();
		
		try {
			armorSet = armorService.bestDarkDefSet(helms, chests, gauntlets, legs);
			assert(false);
		} catch (EmptyListException e) {
			assert(true);
		}
	}
}