package bdd.utilities;

import cucumber.api.java.After;

public class AfterActions {

	@After
	public void afterAction(){ //calling method 
		SetupDrivers.tearDownDriver();
		System.out.println("----------");
	}
}
