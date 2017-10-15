package fr.reapy.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import fr.reapy.model.Chest;
import fr.reapy.model.Gauntlet;
import fr.reapy.model.Helm;
import fr.reapy.model.Leg;

public class FileService {

	// Fields

	private File helmFile;

	private File chestFile;

	private File gauntletFile;

	private File legFile;

	// Constructor

	public FileService() {
		this.helmFile = new File("/resources/data/helmsOwned");
		this.chestFile = new File("/resources/data/chestsOwned");
		this.gauntletFile = new File("/resources/data/gauntletsOwned");
		this.legFile = new File("/resources/data/legsOwned");
	}

	// Methods

	public List<Helm> extractHelmsFromFile() {
		List<Helm> helms = new ArrayList<>();

		return helms;
	}

	public List<Chest> extractChestsFromFile() {
		List<Chest> chests = new ArrayList<>();

		return chests;
	}

	public List<Gauntlet> extractGauntletsFromFile() {
		List<Gauntlet> gauntlets = new ArrayList<>();

		return gauntlets;
	}

	public List<Leg> extractLegsFromFile() {
		List<Leg> legs = new ArrayList<>();
		
		return legs;
	}
}