/*
 * @copyright ©2020. All rights reserved. Trade Secret, Confidential, and Proprietary.
 *
 * @author    Ilham Akbar Adhiguna Erlangga <hi.ilhamakbar@gmail.com>
 */
package utilities.general;

/**
 * This class handles properties to set a thread in the sleeping mode in a certain time.
 */
public class GeneralUtilities {
    /**
     * User triggers an action to wait the process for seconds.
     */
    public static boolean setThreadSleep(int milliSecond) {
        try {
            Thread.sleep(milliSecond);

            return true;
        } catch (InterruptedException e) {
            e.printStackTrace();

            return false;
        }
    }
}
