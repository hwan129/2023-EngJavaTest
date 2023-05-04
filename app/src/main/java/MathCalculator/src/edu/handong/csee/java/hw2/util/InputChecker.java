package edu.handong.csee.java.hw2.util;
/**
 * Check for incorrect input.
 */
public class InputChecker {
    /**
     * input too many numbers -> error
     * @param engineName
     * @param numOfRequiredInputs
     */
    public static void printErrorMessageForTheNumberOfRequiredInputsAndExit(String engineName, int numOfRequiredInputs) {
        System.out.println("You need " + numOfRequiredInputs + " input values for " + engineName.toUpperCase() + ".");
        System.exit(1);
    }
    /**
     * input too few numbers -> error
     * @param engineName
     * @param numOfRequiredMinInput
     */
    public static void printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(String engineName, int numOfRequiredMinInput){
        System.out.println("You need at least " + numOfRequiredMinInput + " input values for " + engineName.toUpperCase() + ".");
        System.exit(1);
    }
    /**
     * input negative number -> error
     * @param engineName
     */
    public static void printErrorMessageForNegativeInputsAndExit(String engineName){
        System.out.println("The input value cannot be negative for " + engineName.toUpperCase() + ".");
        System.exit(1);
    }
}
