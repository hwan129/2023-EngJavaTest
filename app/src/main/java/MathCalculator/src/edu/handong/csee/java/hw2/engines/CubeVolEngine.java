package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;
/**
 * Calculate the volume of a cube.
 */
public class CubeVolEngine implements Computable {
    private static final String engineName ="CUBEVOL";
    private double input;
    private double result;
    
    /**
     * Return the name of the engine, CUBEVOL
     * @return
     */
    public static String getEnginename() {
        return engineName;
    }
    /**
     * Return the side length
     */
    public double getInput() {
        return input;
    }
    /**
     * Check the input number for erros and set the side length
     */
    public void setInput(String[] input) {
        if(Double.parseDouble(input[1]) < 0) InputChecker.printErrorMessageForNegativeInputsAndExit(engineName);
        else if(input.length < 2) InputChecker.printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(engineName, 1);
        else if(input.length > 2) InputChecker.printErrorMessageForTheNumberOfRequiredInputsAndExit(engineName, 1); 
        else this.input = Double.parseDouble(input[1]);
    }
    /**
     * Calculate the volume of a cube
     */
    public void compute() {
        result = input*input*input;
    }
    /**
     * Return the result
     */
    public double getResult() {
        return result;
    }
    /**
     * Set the volume
     */
    public void setResult(String result){
        this.result = Double.parseDouble(result);
    }
}
