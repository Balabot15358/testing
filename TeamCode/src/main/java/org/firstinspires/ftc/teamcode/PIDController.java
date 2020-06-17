package org.firstinspires.ftc.teamcode;

public class PIDController {

    // Create proportional value
    public double P;
    // Create integral value
    public double I;
    // Create derivative value
    public double D;

    /**
     * This is weirded in a weird way but whatever:
     * Takes in the class P, I, and D values and makes them public class variables to get all data for
     * created objects
     *
     * @param p The proportional value given by user
     * @param i The integral value given by user
     * @param d The derivative value given by user
     * @return null
     */
    public PIDController(double p, double i, double d){
        this.P = p;
        this.I = i;
        this.D = d;
    }

    /**
     * Set class P value alone
     *
     * @param p The proportional value given by user
     * @return null
     */
    public void setP(double p){
        this.P = p;
    }

    /**
     * Set class I value alone
     *
     * @param i The integral value given by user
     * @return null
     */
    public void setI(double i){
        this.I = i;
    }

    /**
     * Set class D value alone
     *
     * @param d The derivative value given by user
     * @return null
     */
    public void setD(double d){
        this.D = d;
    }

    /**
     * Returns class P value to use in other classes for some reason
     *
     * @return The class proportional value
     */
    public double getP(){
        return P;
    }

    /**
     * Returns class I value to use in other classes for some reason
     *
     * @return The class integral value
     */
    public double getI(){
        return I;
    }

    /**
     * Returns class D value to use in other classes for some reason
     *
     * @return The class derivative value
     */
    public double getD(){
        return D;
    }

}

