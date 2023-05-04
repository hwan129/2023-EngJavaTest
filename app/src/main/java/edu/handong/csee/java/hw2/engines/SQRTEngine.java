package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;
/**
 * Calculate square root
 */
public class SQRTEngine implements Computable {
    private static final String engineName ="SQRT";

    private double input;
    private double result;

    /**
     * Return the name of the engine, SQRT
     * @return
     */
    public static String getEnginename() {
        return engineName;
    }
    /**
     * Return the input number
     */
    public double getInput(){
        return input;
    }
    /**
     * Check the input for erros and set input
     */
    public void setInput(String[] num) {
        if(Double.parseDouble(num[1]) < 0) InputChecker.printErrorMessageForNegativeInputsAndExit(engineName);
        else if(num.length < 2) InputChecker.printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(engineName, 1);
        else if(num.length > 2) InputChecker.printErrorMessageForTheNumberOfRequiredInputsAndExit(engineName, 1); 
        else input = Double.parseDouble(num[1]);
    }
    /**
     * Calculate square root
     */
    public void compute() {
        result = Math.sqrt(input);
    }
    /**
     * Result the output
     */
    public double getResult(){
        return result;        
    }
    /**
     * Set the result
     */
    public void setResult(String result){
        this.result = Double.parseDouble(result);
    }
}
