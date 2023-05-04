package edu.handong.csee.java.hw2.engines;

import edu.handong.csee.java.hw2.util.InputChecker;
/**
 * Calculate the least common multiple(LCM)
 */
public class LCMEngine implements Computable{
    private static final String engineName ="LCM";
    private int[] input;
    private int result;

    /**
     * Return the name of the engine, LCM
     * @return
     */
    public static String getEnginename() {
        return engineName;
    }
    /**
     * Return the inputs
     */
    public int[] getInput(){
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
     * Calculate the least common multiple(LCM)
     */
    public void compute() {
        int max = input[0];
        for(int i = 1; i < input.length; i++) {
            if(input[i] > max) {
                max = input[i];
            }
        }
        int lcm = max;
        while(true) {
            boolean isLCM = true;
            for(int i = 0; i < input.length; i++) {
                if(lcm % input[i] != 0) {
                    isLCM = false;
                    break;
                }
            }
            if(isLCM) {
                break;
            }
            lcm += max;
        }
        result = lcm;
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
