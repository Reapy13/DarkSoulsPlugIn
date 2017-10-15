package fr.reapy;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import fr.reapy.serviceTest.ArmorServiceTest;
import fr.reapy.serviceTest.FileServiceTest;

@RunWith(Suite.class)
@SuiteClasses({ ArmorServiceTest.class, FileServiceTest.class/* , EquipmentTest.class */ })
public class AllTests {

}