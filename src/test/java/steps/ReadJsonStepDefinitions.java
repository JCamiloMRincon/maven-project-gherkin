package steps;

import entities.UserJson;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import utilities.JsonReader;

public class ReadJsonStepDefinitions {

    private UserJson user;

    @Given("I read the JSON of user")
    public void readUserJson() {
        user = JsonReader.getUserJson("src/main/resources/data/user.json");
    }

    @Then("I verify that the ID is positive")
    public void verifyThatTheIdIsPositive() {
        Assertions.assertTrue(user.getId() > 0);
    }

    @Then("I verify that the longitude is {double}")
    public void verifyThatTheLongitudeIs(double expectedLongitude) {
        Assertions.assertEquals(user.getAddress().getGeo().getLng(), expectedLongitude);
    }

    @Then("I verify that the company bs length is greater than {int}")
    public void verifyThatTheCompanyBsLengthIsGreaterThan(int expectedLength) {
        Assertions.assertTrue(user.getCompany().getBs().length() > expectedLength);
    }

}
