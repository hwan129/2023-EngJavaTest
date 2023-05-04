package edu.handong.csee.java.hw2.engines;
/**
 *  Interface of Computable
 */
public interface Computable {
    /**
     * Set the input
     * @param intput
     */
    public void setInput(String[] intput);
    /**
     * Calculate
     */
    public void compute();
    /**
     * Result output
     * @return
     */
    public double getResult();
}
