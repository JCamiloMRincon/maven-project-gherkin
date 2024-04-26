package utilities;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks {

    @BeforeAll
    public static void beforeAllHook() {
        Logs.info("Executed at the beginning of everything...");
    }

    @Before
    public static void beforeHook() {
        Logs.info("Executed at the beginning of each scenario...");
    }

    @After
    public void afterHook(Scenario scenario) {
        Logs.info("Executed at the end of each scenario, the result is: %s", scenario.getStatus());
    }

    @AfterAll
    public static void afterAllHook() {
        Logs.info("Executed at the end of everything...");
    }

}
