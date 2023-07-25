package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.MenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MenPageSteps {
    @When("I Mouse Hover on Men Menu")
    public void iMouseHoverOnMenMenu() {
        new MenPage().mouseHooverOnMenMenu();
    }

    @And("I Mouse Hover on Bottoms")
    public void iMouseHoverOnBottoms() {
        new MenPage().mouseHooverOnBottoms();
    }

    @And("I click on Pants")
    public void iClickOnPants() {
        new MenPage().clickOnPants();
    }

    @And("I Mouse Hover on product name Cronus Yoga Pant’")
    public void iMouseHoverOnProductNameCronusYogaPant() {
        new MenPage().mouseHooverOnCronusYogaPant();
    }

    @And("I click on size.")
    public void iClickOnSize() {
        new MenPage().clickOnSize32();
    }


    @And("I click on colour Black")
    public void iClickOnColourBlack() {
        new MenPage().clickOnBlackColour();
    }


    @And("I click on Add To Cart Button")
    public void iClickOnAddToCartButton() {
        new MenPage().clickOnAddToCart();
    }

    @And("I Should verify the text {string}")
    public void iShouldVerifyTheText(String expectedMessage) {
        Assert.assertEquals(new MenPage().verifyYouHaveAddedToShoppingCartText(), expectedMessage);
    }

    @And("I Click on shopping cart link into  message.")
    public void iClickOnShoppingCartLinkIntoMessage() {
        new MenPage().clickOnShoppingCartLink();
    }

    @And("I Should able to verify the text {string}.")
    public void iShouldAbleToVerifyTheText(String expectedShoppingCartText) {
        Assert.assertEquals(new MenPage().verifyTheTextShoppingCart(), expectedShoppingCartText);
    }

    @And("I Should able to verify the product name {string}")
    public void iShouldAbleToVerifyTheProductName(String expectedProductName) {
        Assert.assertEquals(new MenPage().verifyProductNameCronusYogaPant(), expectedProductName);
    }

    @And("I Should able to verify the product size {string}.")
    public void iShouldAbleToVerifyTheProductSize(String expectedProductSize) {
        Assert.assertEquals(new MenPage().verifyProductSize(), expectedProductSize);
    }

    @Then("I Should able to verify the product colour {string}.")
    public void iShouldAbleToVerifyTheProductColour(String expectedProductColour) {
        Assert.assertEquals(new MenPage().verifyProductColourBlack(), expectedProductColour);
    }


}
