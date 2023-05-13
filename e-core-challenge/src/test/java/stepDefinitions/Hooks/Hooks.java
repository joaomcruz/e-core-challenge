package stepDefinitions.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static Driver.DriverFactory.cleanupDriver;
import static Driver.DriverFactory.getDriver;

public class Hooks {

    @Before
    public void setup() {
        getDriver();
    }


    @After
    public void tearDown() {
        cleanupDriver();
    }
}