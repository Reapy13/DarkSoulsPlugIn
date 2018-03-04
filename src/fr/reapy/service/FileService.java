package fr.reapy.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import fr.reapy.enumeration.ArmorTypeEnum;
import fr.reapy.exception.ArmorTypeNotSupportedException;
import fr.reapy.model.Armor;
import fr.reapy.model.Chest;
import fr.reapy.model.Gauntlet;
import fr.reapy.model.Helm;
import fr.reapy.model.Leg;

public class FileService {

	// Fields
	
	private static Logger logger = Logger.getLogger(FileService.class.getName());

	// Methods

	public List<Armor> extractArmorElementsFromFile(ArmorTypeEnum armorTypeEnum) throws ArmorTypeNotSupportedException {		
		try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(armorTypeEnum.getPath()))))) {
			List<Armor> armors = new ArrayList<>();
			String buffer;

			while ((buffer = bufferedReader.readLine()) != null) {
				Armor armor = null;

				switch (armorTypeEnum) {
				case HELM :
					armor = new Helm();
					break;
				case CHEST :
					armor = new Chest();
					break;
				case GAUNTLET :
					armor = new Gauntlet();
					break;
				case LEG :
					armor = new Leg();
					break;
				default:
					throw new ArmorTypeNotSupportedException();
				}
				
				armor.setName(buffer);
				armor.setPhysicalDef(Integer.parseInt(bufferedReader.readLine()));
				armor.setStrikeDef(Integer.parseInt(bufferedReader.readLine()));
				armor.setSlashDef(Integer.parseInt(bufferedReader.readLine()));
				armor.setTrustDef(Integer.parseInt(bufferedReader.readLine()));
				armor.setMagicDef(Integer.parseInt(bufferedReader.readLine()));
				armor.setFireDef(Integer.parseInt(bufferedReader.readLine()));
				armor.setLightningDef(Integer.parseInt(bufferedReader.readLine()));
				armor.setDarkDef(Integer.parseInt(bufferedReader.readLine()));
				armor.setPoiseRes(Integer.parseInt(bufferedReader.readLine()));
				armor.setBleedRes(Integer.parseInt(bufferedReader.readLine()));
				armor.setPetrifyRes(Integer.parseInt(bufferedReader.readLine()));
				armor.setCurseRes(Integer.parseInt(bufferedReader.readLine()));
				armor.setWeight(Double.parseDouble(bufferedReader.readLine()));
				armor.setDurability(Integer.parseInt(bufferedReader.readLine()));
			
				armors.add(armor);
			}
			
			return armors;
		} catch (FileNotFoundException e) {
			logger.log(Level.INFO, "Le fichier " + armorTypeEnum.getPath() + " n'a pas été trouvé.");
		} catch (IOException e) {
			logger.log(Level.INFO, "Erreur lors de la lecture du fichier " + armorTypeEnum.getPath() + ".");
		} catch (ArmorTypeNotSupportedException e) {
			logger.log(Level.INFO, "Le type de l'armure n'est pas supporté.");
		} catch(Exception e) {
			logger.info("Coucou");
		}
		
		throw new ArmorTypeNotSupportedException();
	}
}