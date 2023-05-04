package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;
/**
 * Calculate the Factorial
 */
public class FactorialEngine implements Computable {
    private static final String engineName ="FACTORIAL";
    private int input;
    private double result = 1;

    /**
     * Return the name of the engine, FACTORIAL
     * @return
     */
    public static String getEngineName() {
        return engineName;
    }
    /**
     * Return the input
     */
    public double getInput(){
        return input;
    }
    /**
     * Check the input for erros and set the input
     */
    public void setInput(String[] input) {
        if(Double.parseDouble(input[1]) < 0) InputChecker.printErrorMessageForNegativeInputsAndExit(engineName);
        else if(input.length < 2) InputChecker.printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(engineName, 1);
        else if(input.length > 2) InputChecker.printErrorMessageForTheNumberOfRequiredInputsAndExit(engineName, 1); 
        else this.input = Integer.parseInt(input[1]);
    }
    /**
     * Calculate the factorial
     */
    public void compute() {
        for(int i = input; i > 1; i--){
            result *= i;
        }
    }
    /**
     * return the result
     */
    public double getResult() {
        return result;
    }
    /**
     * Set the result
     */
    public void setResult(String result){
        this.result = Double.parseDouble(result);
    }
}
