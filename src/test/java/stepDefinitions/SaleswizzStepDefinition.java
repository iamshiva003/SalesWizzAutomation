package stepDefinitions;

import automation.SaleswizzAutomation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

import java.awt.*;
import java.util.Map;

public class SaleswizzStepDefinition {

    SaleswizzAutomation saleswizzAutomation = new SaleswizzAutomation();

    @Given("User sets up the driver")
    public void setupDriver() {
        saleswizzAutomation.setupDriver();
    }

    @When("User opens and login to saleswizz application")
    public void userOpensAndLoginToSaleswizzApplication(DataTable table) {
        Map<String, String> data = table.asMap(String.class, String.class);
        saleswizzAutomation.login(data);
    }

    @And("User creates catalogue group")
    public void userCreatesCatalogueGroup(DataTable table) throws InterruptedException, AWTException {
        Map<String, String> data = table.asMap(String.class, String.class);
        saleswizzAutomation.addCatalogueGroupDetails(data);
    }

    @And("User creates catalogue")
    public void userCreatesCatalogue(DataTable table) throws InterruptedException, AWTException {
        Map<String, String> data = table.asMap(String.class, String.class);
        saleswizzAutomation.addCatalogueDetails(data);
    }

    @Then("User adds the product")
    public void userAddsTheProduct(DataTable table) throws InterruptedException, AWTException {
        Map<String, String> data = table.asMap(String.class, String.class);
        saleswizzAutomation.addProduct(data);
    }
}
