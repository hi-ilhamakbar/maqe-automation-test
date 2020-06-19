/*
 * @copyright ©2020. All rights reserved. Trade Secret, Confidential, and Proprietary.
 *
 * @author    Ilham Akbar Adhiguna Erlangga <hi.ilhamkabar@gmail.com>
 */
package utilities.suites;

import org.openqa.selenium.WebDriver;
import tests.AddToCart;
import static utilities.setup.Setup.getDriver;

/**
 * This class handles properties to run the test in sequence.
 */
public class SuitesPageTest {
    private static AddToCart addToCart = new AddToCart();

    // This function is calling WebDriver
    private static WebDriver webDriver;


    /**
     * This will run some setSuites function.
     */
    public static void main (String[] args) {
        setSuites();
    }

    /**
     * This function will run some commands by calling another functions in the sequences during testing in the Suites scenario.
     */
    private static void setSuites() {
        webDriver = getDriver();

        addToCart.setAddToCart();
    }
}
