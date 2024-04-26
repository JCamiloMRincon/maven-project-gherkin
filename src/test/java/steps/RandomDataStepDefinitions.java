package steps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class RandomDataStepDefinitions {

    private final Faker faker = new Faker();
    private int a;
    private int b;
    private int sum;
    private int product;
    private double squareRootA;
    private double squareRootB;

    @Given("I have two random int positive numbers")
    public void generateTwoRandomIntPositiveNumbers() {
        a = faker.random().nextInt(1, 50);
        b = faker.random().nextInt(1, 50);
    }

    @When("I add the numbers")
    public void addNumbers() {
        sum = a + b;
    }

    @When("I multiply the numbers")
    public void multiplyNumbers() {
        product = a * b;
    }

    @When("I get the square root of the numbers")
    public void getSquareRootOfNumbers() {
        squareRootA = Math.sqrt(a);
        squareRootB = Math.sqrt(b);
    }

    @Then("I verify that the sum is positive")
    public void verifyThatTheSumIsPositive() {
        Assertions.assertTrue(sum > 0);
    }

    @Then("I verify that the product is positive")
    public void verifyThatTheProductIsPositive() {
        Assertions.assertTrue(product > 0);
    }

    @Then("I verify that the square roots are positive")
    public void verifyThatTheSquareRootsArePositive() {
        Assertions.assertAll(
                () -> Assertions.assertTrue(squareRootA > 0),
                () -> Assertions.assertTrue(squareRootB > 0)
        );
    }
}
