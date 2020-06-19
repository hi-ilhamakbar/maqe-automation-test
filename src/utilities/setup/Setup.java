/*
 * @copyright ©2020. All rights reserved. Trade Secret, Confidential, and Proprietary.
 *
 * @author    Ilham Akbar Adhiguna Erlangga <hi.ilhamakbar@gmail.com>
 */
package utilities.setup;

import utilities.constants.Notification;
import utilities.environments.LoginCredentials;
import utilities.print.PrintUtilitiesPageTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class is used to set default setup test for selenium automated test.
 */
public class Setup {
    private static PrintUtilitiesPageTest printUtilitiesPageTest = new PrintUtilitiesPageTest();
    static WebDriver webDriver;

    /**
     * User gets ChromeDriver, then will set an Selenium local server.
     */
    public static WebDriver getDriver() {
        setSystemPropertiesInChromeDriver();

        if (webDriver == null) {
            webDriver = new ChromeDriver();
            webDriver.get(LoginCredentials.WEBSITE_URL);
            webDriver.manage().window().maximize();
        }

        return webDriver;
    }

    /**
     * User triggers actions to run the ChromeDriver and its location.
     */
    public static void setSystemPropertiesInChromeDriver() {
        printUtilitiesPageTest.print(new String[] {Notification.CHROME_DRIVER + Notification.BEGINS + "\n"});

        String chromeLocation = System.getProperty(LoginCredentials.USER_DIRECTORY);
        System.setProperty(LoginCredentials.WEB_DRIVER, chromeLocation + LoginCredentials.CHROME_DRIVER);
    }
}
