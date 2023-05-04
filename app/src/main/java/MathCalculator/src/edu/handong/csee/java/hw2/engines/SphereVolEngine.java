package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;;
/**
 * Calculate the volum of a sphere
 */
public class SphereVolEngine implements Computable {
    private static final String engineName ="SPHEREVOL";
    
    private double input;
    private double result;

    /**
     * Return the name of the engine, SPHEREVOL
     * @return
     */
    public static String getEnginename() {
        return engineName;
    }
    /**
     * Return the radius
     */
    public double getInput(){
        return input;
    }
    /**
     * Check the input for erros and set input
     */
    public void setInput(String[] input) {
        if(Double.parseDouble(input[1]) < 0) InputChecker.printErrorMessageForNegativeInputsAndExit(engineName);
        else if(input.length < 2) InputChecker.printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(engineName, 1);
        else if(input.length > 2) InputChecker.printErrorMessageForTheNumberOfRequiredInputsAndExit(engineName, 1); 
        else this.input = Integer.parseInt(input[1]);
    }
    /**
     * Calculate the volum of a sphere
     */
    public void compute() {
        result = 4*Math.PI*input*input*input/3;
    }
    /**
     * Return the result
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
