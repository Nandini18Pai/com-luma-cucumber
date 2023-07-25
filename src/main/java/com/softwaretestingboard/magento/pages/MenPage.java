package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MenPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "  //span[contains(text(),'Men')]")
    WebElement menMenu;

    @FindBy(xpath = "  //a[@id='ui-id-18']//span[contains(text(),'Bottoms')]")
    WebElement Bottoms;

    @FindBy(xpath = "  //a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pants;

    @FindBy(xpath = "  //a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYogaPant;

    @FindBy(xpath = "  //div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']")
    WebElement size;

    @FindBy(xpath = "   //div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']")
    WebElement blackColor;

    @FindBy(xpath = "(//span[contains(text(),'Add to Cart')])[1]")
    WebElement addToCart;

    @FindBy(xpath =  "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
     WebElement  verifyTheShoppingText;

    @FindBy(xpath =  "//a[normalize-space()='shopping cart']")
    WebElement  shoppingCartLink;

    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYogaPantText;

    @FindBy(xpath = "//span[@class='base']")
    WebElement shoppingCartText;

    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement size32;

    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement colourBlack;


    public void mouseHooverOnMenMenu() {
        mouseHoverToElement(menMenu);
    }

    public void mouseHooverOnBottoms() {
        mouseHoverToElement(Bottoms);
    }

    public void clickOnPants() {
        clickOnElement(pants);

    }

    public void mouseHooverOnCronusYogaPant() {
        mouseHoverToElement(cronusYogaPant);
    }

    public void clickOnSize32() {
        clickOnElement(size);
    }

    public void clickOnBlackColour() {
        clickOnElement(blackColor);

    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);

    }

    public String verifyYouHaveAddedToShoppingCartText(){
        return getTextFromElement(verifyTheShoppingText);
    }

    public void clickOnShoppingCartLink(){
        clickOnElement(shoppingCartLink);
    }


    public String verifyTheTextShoppingCart(){
        return getTextFromElement(shoppingCartText);
    }


    public String verifyProductNameCronusYogaPant(){
        return getTextFromElement(cronusYogaPant);
    }

    public String verifyProductSize(){
        return getTextFromElement(size32);
    }

    public String verifyProductColourBlack(){
        return getTextFromElement(colourBlack);
    }






}

