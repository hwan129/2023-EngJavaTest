package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;
/**
 * Calculate the Fibonacci
 */
public class FibonacciEngine implements Computable {
    private static final String engineName ="FIBONACCI";
    private int input;
    private double result;

    /**
     * Return the name of the engine, FIBONACCI
     * @return
     */
    public static String getEnginename() {
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
     * Calculate the fibonacci
     */
    public void compute() {
        double preprenum = 1;
        double prenum = 1;
        double num = 0;

        if(input < 3){
            result = 1;
        }
        else{
            for(int i = 3; i <= input; i++){
                num = preprenum + prenum;
                preprenum = prenum;
                prenum = num;
            }
            result = num;
        }
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
