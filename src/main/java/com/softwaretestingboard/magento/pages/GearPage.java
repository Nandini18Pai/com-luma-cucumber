package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GearPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "  //span[normalize-space()='Gear']")
    WebElement gearMenu;

    @FindBy(xpath = "   //span[normalize-space()='Bags']")
    WebElement bags;

    @FindBy(xpath = " //a[normalize-space()='Overnight Duffle']")
    WebElement overnightDuffle;

    @FindBy(xpath = " //span[@class='base']")
    WebElement overnightDuffleText;

    @FindBy(xpath = "//input[@id='qty']")
    WebElement quantityBox;

    @FindBy(xpath = "//span[normalize-space()='Add to Cart']")
    WebElement addToCartButton;

    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement youHaveAddedToShoppingCartText;

    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCartLink;

    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement overnightDuffleTextInTheCart;

    @FindBy(xpath = "//input[@id='cart-271354-qty']")                      //input[@title='Qty']
    WebElement quantityInTheCart;

    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']")
    WebElement subTotalOf3quantity;

    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppingCart;

    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']")
    WebElement totalOf5Bags;





    public void mouseHooverOnGearMenu() {
        mouseHoverToElement(gearMenu);
    }


    public void clickOnBags() {
        clickOnElement(bags);
    }

    public void clickOnOvernightDuffle() {
      clickOnElement(overnightDuffle);
    }

    public String verifyTheTextOvernightDuffle() {
        return getTextFromElement(overnightDuffleText);

    }

    public void clearTheQuantityAndChangeTo3(String quantity) {
        clearTextFromField(quantityBox);
        sendTextToElement(quantityBox, quantity);
    }


    public void clickToAddToCart() {
        clickOnElement(addToCartButton);

    }

    public String verifyMessageYouHaveAddedToShoppingCartTex() {
        return getTextFromElement(youHaveAddedToShoppingCartText);


    }

    public void clickToShoppingCartLink() {
        clickOnElement(shoppingCartLink);

    }

    public String verifyTextOvernightDuffleToShoppingCartTex() {
        return getTextFromElement(overnightDuffleTextInTheCart);
    }

    public String verifyQuantityInTheShoppingCart() {
        return getTextFromElement(quantityInTheCart);

    }


    public String verifySubTotalInTheShoppingCart() {
        return getTextFromElement(subTotalOf3quantity);

    }

    public void changeTheQuantityTo5(String quantity){
        clearTextFromField(quantityInTheCart);
        sendTextToElement(quantityInTheCart,quantity);
    }

    public void clickOnUpdateShoppingCartLink() {
        clickOnElement(updateShoppingCart);

    }


    public String verifyTotalOf5BagsInTheShoppingCart() {
        return getTextFromElement(totalOf5Bags);

    }

}