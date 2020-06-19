/*
 * @copyright ©2020. All rights reserved. Trade Secret, Confidential, and Proprietary.
 *
 * @author    Ilham Akbar Adhiguna Erlangga <hi.ilhamkabar@gmail.com>
 */
package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.constants.Notification;
import utilities.general.GeneralUtilitiesPageTest;
import utilities.print.PrintUtilitiesPageTest;
import static utilities.setup.Setup.getDriver;

/**
 * This class handles properties to add a certain item to the shopping cart.
 */
public class AddToCart {
    private static PrintUtilitiesPageTest printUtilitiesPageTest = new PrintUtilitiesPageTest();
    private static GeneralUtilitiesPageTest generalUtilitiesPageTest = new GeneralUtilitiesPageTest();
    private static WebDriver webDriver = getDriver();

    /**
     * This will run setAddToCart function.
     */
    public static void main (String[] args) {
        setAddToCart();
    }

    /**
     * This function will run some commands by calling another functions in the sequences during testing.
     */
    public static void setAddToCart() {
        printUtilitiesPageTest.print(new String[] {Notification.ADD_TO_CART + Notification.BEGINS});

        chooseItem();
        generalUtilitiesPageTest.setThreadSleep(10000);
        chooseSize();
        clickAddToCart();
        clickProceed();

        printUtilitiesPageTest.print(new String[] {Notification.ADD_TO_CART + Notification.ENDS + "\n"});
    }

    /**
     * User triggers an action to choose an item in the catalogue.
     */
    private static void chooseItem() {
        WebElement txtItemName = webDriver.findElement(By.xpath("//*[@title=\"Blouse\"]"));

        txtItemName.click();
    }

    /**
     * User triggers an action to choose item's size.
     */
    private static void chooseSize() {
        WebElement drdSize = webDriver.findElement(By.name("group_1"));
        WebElement drdSizeList = webDriver.findElement(By.xpath("//*[@title=\"M\"]"));

        drdSize.click();
        drdSizeList.click();
    }

    /**
     * User triggers an action to add the item to shopping cart.
     */
    private static void clickAddToCart() {
        WebElement btnAddToCart = webDriver.findElement(By.id("add_to_cart"));

        btnAddToCart.click();
    }

    /**
     * User triggers an action to proceed to checkout page.
     */
    private static void clickProceed() {
        WebElement btnProceed = webDriver.findElement(By.className("button-medium"));

        btnProceed.click();
    }
}
