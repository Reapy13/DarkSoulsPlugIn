package fr.reapy;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import fr.reapy.serviceTest.ArmorServiceTest;

@RunWith(Suite.class)
@SuiteClasses({ArmorServiceTest.class/*, EquipmentTest.class*/})
public class AllTests {
	
}