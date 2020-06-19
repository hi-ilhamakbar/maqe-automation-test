/*
 * @copyright ©2020. All rights reserved. Trade Secret, Confidential, and Proprietary.
 *
 * @author    Ilham Akbar Adhiguna Erlangga <hi.ilhamakbar@gmail.com>
 */
package utilities.print;

/**
 * This class handles properties to print specific utilities.
 */
public class PrintUtilitiesPageTest {
    /**
     * User triggers an action to print a certain system message.
     */
    public static void print(String[] arguments) {
        for (int i = 0; i < arguments.length; i++) {
            System.out.println(arguments[i]);
        }
    }
}
