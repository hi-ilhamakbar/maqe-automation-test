/*
 * @copyright ©2020. All rights reserved. Trade Secret, Confidential, and Proprietary.
 *
 * @author    Ilham Akbar Adhiguna Erlangga <hi.ilhamkabar@gmail.com>
 */
package utilities.environments;

/**
 * This class handles environment in this automation test.
 */
public class LoginCredentials {
    // Set Chrome Setup Location
    public static String USER_DIRECTORY = "user.dir";
    public static String WEB_DRIVER = "webdriver.chrome.driver";
    public static String CHROME_DRIVER = "\\chromedriver\\chromedriver.exe";

    // Base URL for The Edge running in different environments
    public static String WEBSITE_URL = "http://automationpractice.com/";
}
