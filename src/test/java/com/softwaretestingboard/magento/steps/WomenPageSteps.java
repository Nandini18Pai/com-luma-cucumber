package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.WomenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WomenPageSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I Mouse Hover on Women Menu")
    public void iMouseHoverOnWomenMenu() {
        new WomenPage().mouseHooverOnWomenMenu();
    }

    @And("I Mouse Hover on Tops")
    public void iMouseHoverOnTops() {
        new WomenPage().mouseHooverOnWomenTop();
    }

    @And("I click on Jackets")
    public void iClickOnJackets() {
        new WomenPage().clickOnJackets();
    }

    @And("I select Sort By filter {string}")
    public void iSelectSortByFilter(String sortBy) {
        new WomenPage().selectSortByFilterProductName(sortBy);

    }

    @Then("I should able to see the products name display in alphabetical order")
    public void iShouldAbleToSeeTheProductsNameDisplayInAlphabeticalOrder() throws InterruptedException {
        Assert.assertEquals("Product not sort by name", new WomenPage().productListBeforeSorting(), new WomenPage().productListAfterSorting());


    }
    @And("I selected sort By filter {string}")
    public void iSelectedSortByFilter(String sortBy) {
        new WomenPage().selectSortByFilterProductPrice(sortBy);
    }

    @Then("I should able to see the products price display in Low to High")
    public void iShouldAbleToSeeTheProductsPriceDisplayInLowToHigh() throws InterruptedException {
        Assert.assertEquals("Products not sort by price", new WomenPage().priceListBeforeSorting(), new WomenPage().priceListAfterSorting());
    }



}
