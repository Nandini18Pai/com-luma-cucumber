package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.GearPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class GearSteps {
    @When("I Mouse Hover on Gear Menu")
    public void iMouseHoverOnGearMenu() {
        new GearPage().mouseHooverOnGearMenu();
    }

    @And("I click on Bags")
    public void iClickOnBags() {
        new GearPage().clickOnBags();
    }

    @And("I click  on product name Overnight Duffle.")
    public void iClickOnProductNameOvernightDuffle() {
        new GearPage().clickOnOvernightDuffle();

    }

    @And("I should able to see text {string}.")
    public void iShouldAbleToSeeText(String expectedTextMessage) {
        Assert.assertEquals(new GearPage().verifyTheTextOvernightDuffle(),expectedTextMessage);
    }

    @And("I change quantity to {string}")
    public void iChangeQuantityTo(String quantity) {

        new GearPage().clearTheQuantityAndChangeTo3(quantity);

    }

    @And("I click on Add To Cart Button.")
    public void iClickOnAddToCartButton() {
        new GearPage().clickToAddToCart();
    }

    @And("I Should able to verify the text {string}")
    public void iShouldAbleToVerifyTheText(String expectedText)throws InterruptedException {
        Thread.sleep(1000);
      Assert.assertEquals(new GearPage().verifyMessageYouHaveAddedToShoppingCartTex(),expectedText);
    }

    @And("I Click on the shopping cart link into  message.")
    public void iClickOnTheShoppingCartLinkIntoMessage()throws InterruptedException {
        Thread.sleep(1000);
        new GearPage().clickToShoppingCartLink();
    }

    @And("I Should able to verify the Bag text {string}.")
    public void iShouldAbleToVerifyTheBagText(String expectText)throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(new GearPage().verifyTextOvernightDuffleToShoppingCartTex(),expectText);
    }

    @And("I Should able to verify quantity is {string}")
    public void iShouldAbleToVerifyQuantityIs(String expectedQuantity)throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals("Dos not show the quantity as 3",expectedQuantity,new GearPage().verifyQuantityInTheShoppingCart());
    }

    @And("I Should able to verify product price is {string}")
    public void iShouldAbleToVerifyProductPriceIs(String expectedValue)throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(new GearPage().verifySubTotalInTheShoppingCart(),expectedValue);
    }

    @And("I change the quantity to {string}")
    public void iChangeTheQuantityTo(String quantity)throws InterruptedException {
        Thread.sleep(1000);
        new GearPage().changeTheQuantityTo5(quantity);

    }

    @And("I click on the update shopping cart button.")
    public void iClickOnTheUpdateShoppingCartButton() throws InterruptedException{
       Thread.sleep(500);
        new GearPage().clickOnUpdateShoppingCartLink();
    }

    @Then("I Should able to verify the total price of product  {string}.")
    public void iShouldAbleToVerifyTheTotalPriceOfProduct(String expectedPrice)throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals(new GearPage().verifyTotalOf5BagsInTheShoppingCart(),expectedPrice);

    }


}
