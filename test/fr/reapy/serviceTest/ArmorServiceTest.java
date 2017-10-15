package fr.reapy.serviceTest;

import static org.junit.Assert.assertSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fr.reapy.enumeration.ElementEnum;
import fr.reapy.exception.ElementNotSupportedException;
import fr.reapy.exception.EmptyListException;
import fr.reapy.model.ArmorSet;
import fr.reapy.model.Chest;
import fr.reapy.model.Gauntlet;
import fr.reapy.model.Helm;
import fr.reapy.model.Leg;
import fr.reapy.service.ArmorService;

public class ArmorServiceTest {

	// Fields

	private ArmorService armorService = new ArmorService();

	private ArmorSet armorSetTest = new ArmorSet();

	private Helm helm1, helm2, helm3;
	private Chest chest1, chest2, chest3;
	private Gauntlet gauntlet1, gauntlet2, gauntlet3;
	private Leg leg1, leg2, leg3;

	private List<Helm> helms = new ArrayList<>();
	private List<Chest> chests = new ArrayList<>();
	private List<Gauntlet> gauntlets = new ArrayList<>();
	private List<Leg> legs = new ArrayList<>();
	
	// Methods

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

		helm1.setStrikeDef(2);
		chest1.setStrikeDef(3);
		gauntlet1.setStrikeDef(5);
		leg1.setStrikeDef(7);
		helm2.setStrikeDef(1);
		chest2.setStrikeDef(14);
		gauntlet2.setStrikeDef(4);
		leg2.setStrikeDef(6);
		helm3.setStrikeDef(3);
		chest3.setStrikeDef(7);
		gauntlet3.setStrikeDef(6);
		leg3.setStrikeDef(8);

		helm1.setSlashDef(2);
		chest1.setSlashDef(3);
		gauntlet1.setSlashDef(5);
		leg1.setSlashDef(7);
		helm2.setSlashDef(1);
		chest2.setSlashDef(14);
		gauntlet2.setSlashDef(4);
		leg2.setSlashDef(6);
		helm3.setSlashDef(3);
		chest3.setSlashDef(7);
		gauntlet3.setSlashDef(6);
		leg3.setSlashDef(8);

		helm1.setTrustDef(2);
		chest1.setTrustDef(3);
		gauntlet1.setTrustDef(5);
		leg1.setTrustDef(7);
		helm2.setTrustDef(1);
		chest2.setTrustDef(14);
		gauntlet2.setTrustDef(4);
		leg2.setTrustDef(6);
		helm3.setTrustDef(3);
		chest3.setTrustDef(7);
		gauntlet3.setTrustDef(6);
		leg3.setTrustDef(8);

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

		armorSetTest = new ArmorSet(helm3, chest2, gauntlet3, leg3);
	}

	@Test
	public void bestDefPhysicalSetTest() throws EmptyListException, ElementNotSupportedException {
		ArmorSet armorSet = armorService.bestDefSetByElement(helms, chests, gauntlets, legs, ElementEnum.PHYSICAL);
		assertSame(armorSet.getHelm(), armorSetTest.getHelm());
		assertSame(armorSet.getChest(), armorSetTest.getChest());
		assertSame(armorSet.getGauntlet(), armorSetTest.getGauntlet());
		assertSame(armorSet.getLeg(), armorSetTest.getLeg());
	}

	@Test
	public void bestDefStrikeSetTest() throws EmptyListException, ElementNotSupportedException {
		ArmorSet armorSet = armorService.bestDefSetByElement(helms, chests, gauntlets, legs, ElementEnum.STRIKE);
		assertSame(armorSet.getHelm(), armorSetTest.getHelm());
		assertSame(armorSet.getChest(), armorSetTest.getChest());
		assertSame(armorSet.getGauntlet(), armorSetTest.getGauntlet());
		assertSame(armorSet.getLeg(), armorSetTest.getLeg());
	}

	@Test
	public void bestDefSlashSetTest() throws EmptyListException, ElementNotSupportedException {
		ArmorSet armorSet = armorService.bestDefSetByElement(helms, chests, gauntlets, legs, ElementEnum.SLASH);
		assertSame(armorSet.getHelm(), armorSetTest.getHelm());
		assertSame(armorSet.getChest(), armorSetTest.getChest());
		assertSame(armorSet.getGauntlet(), armorSetTest.getGauntlet());
		assertSame(armorSet.getLeg(), armorSetTest.getLeg());
	}

	@Test
	public void bestDefTrustSetTest() throws EmptyListException, ElementNotSupportedException {
		ArmorSet armorSet = armorService.bestDefSetByElement(helms, chests, gauntlets, legs, ElementEnum.TRUST);
		assertSame(armorSet.getHelm(), armorSetTest.getHelm());
		assertSame(armorSet.getChest(), armorSetTest.getChest());
		assertSame(armorSet.getGauntlet(), armorSetTest.getGauntlet());
		assertSame(armorSet.getLeg(), armorSetTest.getLeg());
	}

	@Test
	public void bestDefMagicSetTest() throws EmptyListException, ElementNotSupportedException {
		ArmorSet armorSet = armorService.bestDefSetByElement(helms, chests, gauntlets, legs, ElementEnum.MAGIC);
		assertSame(armorSet.getHelm(), armorSetTest.getHelm());
		assertSame(armorSet.getChest(), armorSetTest.getChest());
		assertSame(armorSet.getGauntlet(), armorSetTest.getGauntlet());
		assertSame(armorSet.getLeg(), armorSetTest.getLeg());
	}

	@Test
	public void bestDefFireSetTest() throws EmptyListException, ElementNotSupportedException {
		ArmorSet armorSet = armorService.bestDefSetByElement(helms, chests, gauntlets, legs, ElementEnum.FIRE);
		assertSame(armorSet.getHelm(), armorSetTest.getHelm());
		assertSame(armorSet.getChest(), armorSetTest.getChest());
		assertSame(armorSet.getGauntlet(), armorSetTest.getGauntlet());
		assertSame(armorSet.getLeg(), armorSetTest.getLeg());
	}

	@Test
	public void bestDefLightningSetTest() throws EmptyListException, ElementNotSupportedException {
		ArmorSet armorSet = armorService.bestDefSetByElement(helms, chests, gauntlets, legs, ElementEnum.LIGHTNING);
		assertSame(armorSet.getHelm(), armorSetTest.getHelm());
		assertSame(armorSet.getChest(), armorSetTest.getChest());
		assertSame(armorSet.getGauntlet(), armorSetTest.getGauntlet());
		assertSame(armorSet.getLeg(), armorSetTest.getLeg());
	}

	@Test
	public void bestDefDarkSetTest() throws EmptyListException, ElementNotSupportedException {
		ArmorSet armorSet = armorService.bestDefSetByElement(helms, chests, gauntlets, legs, ElementEnum.DARK);
		assertSame(armorSet.getHelm(), armorSetTest.getHelm());
		assertSame(armorSet.getChest(), armorSetTest.getChest());
		assertSame(armorSet.getGauntlet(), armorSetTest.getGauntlet());
		assertSame(armorSet.getLeg(), armorSetTest.getLeg());
	}
	
	@Test
	public void emptyHelmListTest() throws ElementNotSupportedException {
		helms.clear();
		
		try {
			armorService.bestDefSetByElement(helms, chests, gauntlets, legs, ElementEnum.PHYSICAL);
			assert(false);
		} catch (EmptyListException e) {
			assert(true);
		}
	}
	
	@Test
	public void emptyChestListTest() throws ElementNotSupportedException {
		chests.clear();
		
		try {
			armorService.bestDefSetByElement(helms, chests, gauntlets, legs, ElementEnum.PHYSICAL);
			assert(false);
		} catch (EmptyListException e) {
			assert(true);
		}
	}
	
	@Test
	public void emptyGauntletListTest() throws ElementNotSupportedException {
		gauntlets.clear();
		
		try {
			armorService.bestDefSetByElement(helms, chests, gauntlets, legs, ElementEnum.PHYSICAL);
			assert(false);
		} catch (EmptyListException e) {
			assert(true);
		}
	}
	
	@Test
	public void emptyLegListTest() throws ElementNotSupportedException {
		legs.clear();
		
		try {
			armorService.bestDefSetByElement(helms, chests, gauntlets, legs, ElementEnum.PHYSICAL);
			assert(false);
		} catch (EmptyListException e) {
			assert(true);
		}
	}

	@Test
	public void elementNotSupportedTest() throws EmptyListException {
		try {
			armorService.bestDefSetByElement(helms, chests, gauntlets, legs, ElementEnum.DEFAULT);
			assert (false);
		} catch (ElementNotSupportedException e) {
			assert (true);
		}
	}
}