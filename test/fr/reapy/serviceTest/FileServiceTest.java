package fr.reapy.serviceTest;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.reapy.model.Chest;
import fr.reapy.model.Gauntlet;
import fr.reapy.model.Helm;
import fr.reapy.model.Leg;

public class FileServiceTest {

	// Methods

	@Test
	public void extractHelmsFromFileTest() {
		List<Helm> Helms = new ArrayList<>();
		List<Helm> HelmsTest = new ArrayList<>();
		
		assertEquals(Helms, HelmsTest);
		// Test Not Donne
		assert(false);
	}

	@Test
	public void extractChestsFromFileTest() {
		List<Chest> chests = new ArrayList<>();
		List<Chest> chestsTest = new ArrayList<>();
		
		assertEquals(chests, chestsTest);
		// Test Not Donne
		assert(false);
	}

	@Test
	public void extractGauntletsFromFileTest() {
		List<Gauntlet> gauntlets = new ArrayList<>();
		List<Gauntlet> gauntletsTest = new ArrayList<>();
		
		assertEquals(gauntlets, gauntletsTest);
		// Test Not Donne
		assert(false);
	}

	@Test
	public void extractLegsFromFileTest() {
		List<Leg> Legs = new ArrayList<>();
		List<Leg> LegsTest = new ArrayList<>();
		
		assertEquals(Legs, LegsTest);
		// Test Not Donne
		assert(false);
	}
}