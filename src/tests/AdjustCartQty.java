/*
 * @copyright ©2020. All rights reserved. Trade Secret, Confidential, and Proprietary.
 *
 * @author    Ilham Akbar Adhiguna Erlangga <hi.ilhamakbar@gmail.com>
 */
package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.constants.Notification;
import utilities.print.PrintUtilitiesPageTest;
import static utilities.setup.Setup.getDriver;

/**
 * This class handles properties to adjust item's qty the shopping cart.
 */
public class AdjustCartQty {
    private static PrintUtilitiesPageTest printUtilitiesPageTest = new PrintUtilitiesPageTest();
    private static WebDriver webDriver = getDriver();

    /**
     * This will run setAdjustCart function.
     */
    public static void main (String[] args) {
        setAdjustCart();
    }

    /**
     * This function will run some commands by calling another functions in the sequences during testing.
     */
    public static void setAdjustCart() {
        printUtilitiesPageTest.print(new String[] {Notification.ADJUST_CART + Notification.BEGINS});

        adjustQtyByClickingButton();
        adjustQtyByTyping();
        removeItem();

        printUtilitiesPageTest.print(new String[] {Notification.ADJUST_CART + Notification.ENDS + "\n"});
    }

    /**
     * User triggers an action to adjust the item qty by clicking the plus and minus button.
     */
    private static void adjustQtyByClickingButton() {
        WebElement btnPlus = webDriver.findElement(By.cssSelector("[wfd-id=63]"));
        WebElement btnMinus = webDriver.findElement(By.cssSelector("[wfd-id=64]"));

        btnPlus.click();
        btnPlus.click();
        btnPlus.click();
        btnMinus.click();
    }

    /**
     * User triggers an action to adjust the item qty by typing the qty in the text box.
     */
    private static void adjustQtyByTyping() {
        WebElement txbQty = webDriver.findElement(By.name("quantity_2_7_0_0"));

        txbQty.click();
        txbQty.sendKeys("4");
    }

    /**
     * User triggers an action to remove item from the shopping cart.
     */
    private static void removeItem() {
        WebElement btnTrash = webDriver.findElement(By.name("3_13_0_0"));

        btnTrash.click();
    }
}
