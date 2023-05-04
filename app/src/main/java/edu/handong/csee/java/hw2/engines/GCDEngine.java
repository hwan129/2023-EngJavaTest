package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;
/**
 * Calculate the greatest common denominator(GCD)
 */
public class GCDEngine implements Computable {
    private static final String engineName ="GCD";
    private int[] input;
    private int result = 0;

    /**
     * Return the name of the engine, GCD
     * @return
     */
    public static String getEnginename() {
        return engineName;
    }
    /**
     * Return the inputs
     * @return
     */
    public int[] getInput() {
        return input;
    }
    /**
     * Check the inputs for erros and set the inputs
     */
    public void setInput(String[] input) {
        this.input = new int[input.length-1];
        for(int i = 1; i < input.length-1; i++){
            if(Integer.parseInt(input[i]) < 0){
                InputChecker.printErrorMessageForNegativeInputsAndExit(engineName);
            }
        }
        if(input.length < 3) InputChecker.printErrorMessageForTheNumberOfMinimumRequiredInputsAndExit(engineName, 2);
        
        else{
            for(int i = 0; i <input.length-1; i++){
                this.input[i] = Integer.parseInt(input[i+1]);
            }
        }
    }
    /**
     * Calculate the greatest common denominator(GCD)
     */
    public void compute() {
        int gcd = input[0];
        for(int i = 1; i < input.length; i++){
            int b = input[i];
            while (b != 0) {
                int temp = gcd;
                gcd = b;
                b = temp % b;
            }
        }
        result = gcd;
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
        this.result = Integer.parseInt(result);
    }
}
