package fr.reapy.serviceTest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fr.reapy.enumeration.ArmorTypeEnum;
import fr.reapy.exception.ArmorTypeNotSupportedException;
import fr.reapy.model.Armor;
import fr.reapy.model.Chest;
import fr.reapy.model.Gauntlet;
import fr.reapy.model.Helm;
import fr.reapy.model.Leg;
import fr.reapy.service.FileService;

public class FileServiceTest {
	
	// Fields
	
	private FileService fileService;
	
	private List<Armor> helmsTest;
	private List<Armor> chestsTest;
	private List<Armor> gauntletsTest;
	private List<Armor> legsTest;

	// Methods
	
	@Before
	public void init() {
		fileService = new FileService();
		
		helmsTest = new ArrayList<>();
		chestsTest = new ArrayList<>();
		gauntletsTest = new ArrayList<>();
		legsTest = new ArrayList<>();
		
		Armor helm = new Helm();
		helm.setName("Knight Helm");
		helm.setPhysicalDef(35);
		helm.setStrikeDef(34);
		helm.setSlashDef(40);
		helm.setTrustDef(35);
		helm.setMagicDef(11);
		helm.setFireDef(11);
		helm.setLightningDef(8);
		helm.setDarkDef(11);
		helm.setPoiseRes(9);
		helm.setBleedRes(13);
		helm.setPetrifyRes(0);
		helm.setCurseRes(0);
		helm.setWeight(4.2);
		helm.setDurability(80);
		
		helmsTest.add(helm);
	}

	/**
	 * Test faux ! A remodeler
	 * @throws ArmorTypeNotSupportedException
	 */
	@Test
	public void extractHelmsFromFileTest() throws ArmorTypeNotSupportedException {
		List<Armor> helms = fileService.extractArmorElementsFromFile(ArmorTypeEnum.HELM);

		for (Armor helm : helms) {
			assertEquals("Knight Helm", helm.getName());
			assertEquals(35, helm.getPhysicalDef());
			assertEquals(34, helm.getStrikeDef());
			assertEquals(40, helm.getSlashDef());
			assertEquals(35, helm.getTrustDef());
			assertEquals(11, helm.getMagicDef());
			assertEquals(11, helm.getFireDef());
			assertEquals(8, helm.getLightningDef());
			assertEquals(11, helm.getDarkDef());
			assertEquals(9, helm.getPoiseRes());
			assertEquals(13, helm.getBleedRes());
			assertEquals(0, helm.getPetrifyRes());
			assertEquals(0, helm.getCurseRes());
			assertEquals(new Double(4.2), new Double(helm.getWeight()));
			assertEquals(80, helm.getDurability());
		}
	}

/*	@Test
	public void extractChestsFromFileTest() throws ArmorTypeNotSupportedException {
		List<Chest> chests = new ArrayList<>();
		List<Chest> chestsTest = new ArrayList<>();
		
		assertEquals(chests, chestsTest);
		// Test Not Donne
		assert(false);
	}

	@Test
	public void extractGauntletsFromFileTest() throws ArmorTypeNotSupportedException {
		List<Gauntlet> gauntlets = new ArrayList<>();
		List<Gauntlet> gauntletsTest = new ArrayList<>();
		
		assertEquals(gauntlets, gauntletsTest);
		// Test Not Donne
		assert(false);
	}

	@Test
	public void extractLegsFromFileTest() throws ArmorTypeNotSupportedException {
		List<Leg> legs = new ArrayList<>();
		List<Leg> legsTest = new ArrayList<>();
		
		assertEquals(legs, legsTest);
		// Test Not Donne
		assert(false);
	}*/
}