package steps;

import entities.Product;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import utilities.ExcelReader;

import java.util.List;

public class ReadExcelStepDefinitions {

    private List<Product> productList;
    private Product currentProduct;
    private int listSize;

    @Given("I read the Excel products list")
    public void readExcelProductsList() {
        productList = ExcelReader.getProductsList();
    }

    @When("I get the element with index {int}")
    public void getThirdElement(int index) {
        currentProduct = productList.get(index);
    }

    @When("I get the last element")
    public void getLastElement() {
        currentProduct = productList.get(productList.size() - 1);
    }

    @When("I get the list size")
    public void getListSize() {
        listSize = productList.size();
    }

    @Then("I verify that its name is {string} and its price is {double}")
    public void verifyThatItsNameIsAndItsPriceIs(String expectedName, double expectedPrice) {
        Assertions.assertAll(
                () -> Assertions.assertEquals(currentProduct.getName(), expectedName),
                () -> Assertions.assertEquals(currentProduct.getPrice(), expectedPrice)
        );
    }

    @Then("I verify that its price is {double} and it is NOT perishable")
    public void verifyThatItsPriceIsAndItIsNotPerishable(double expectedPrice) {
        Assertions.assertAll(
                () -> Assertions.assertEquals(currentProduct.getPrice(), expectedPrice),
                () -> Assertions.assertFalse(currentProduct.isPerishable())
        );
    }

    @Then("I verify that the list size is {int}")
    public void verifyThatTheListSizeIs(int expectedListSize) {
        Assertions.assertEquals(listSize, expectedListSize);
    }

    @Then("I verify that it has {string}, {double}, {int}")
    public void verifyProductInformation(String expectedName, double expectedPrice, int expectedStock) {
        Assertions.assertAll(
                () -> Assertions.assertEquals(currentProduct.getName(), expectedName),
                () -> Assertions.assertEquals(currentProduct.getPrice(), expectedPrice),
                () -> Assertions.assertEquals(currentProduct.getStock(), expectedStock)
        );
    }
}
