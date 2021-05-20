package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before("@MobileTest")
	public void beforevalidation() {
		System.out.println("BEFORE Mobile hook");
	}
	
	@After("@MobileTest")
	public void aftervalidation() {
		System.out.println("AFTER Mobile hook");
	}
	
	@Before("@SmokeTest")
	public void beforeSmokevalidation() {
		System.out.println("BEFORE Smoke hook");
	}
	
	@After("@SmokeTest")
	public void afterSmokevalidation() {
		System.out.println("AFTER Smoke hook");
	}
}
