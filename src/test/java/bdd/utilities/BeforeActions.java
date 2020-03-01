package bdd.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions {

	@Before
	public void beforeAction(Scenario scen){
		System.out.println(">> Initializing Chrome Driver");//setting up a method which will run before running every feature file
		SetupDrivers.setupDriver(); //before running any test call the setup driver 
		System.out.println(scen.getName()); //whichever driver call it 
		
	}
}
