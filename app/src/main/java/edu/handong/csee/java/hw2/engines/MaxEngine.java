package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;
import java.util.Arrays;
/**
 * Calculate the maximum number
 */
public class MaxEngine implements Computable {
    private static final String engineName ="MAX";
    
    private double[] input;
    private double result;

    /**
     * Return the name of the engine, MAX
     * @return
     */
    public static String getEnginename() {
        return engineName;
    }
    /**
     * Return the inputs
     */
    public double[] getInput(){
        return input;
    }
    /**
     * Check the inputs for erros and set the inputs
     */
    public void setInput(String[] input) {
        this.input = new double[input.length-1];
        if(input.length < 3){
            InputChecker.printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(engineName, 2);
        }
        for(int i = 0; i <input.length-1; i++){
            this.input[i] = Double.parseDouble(input[i+1]);
        }
    }
    /**
     * Find the largest number
     */
    public void compute() {
        Arrays.sort(input);
        result = input[input.length-1];
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
