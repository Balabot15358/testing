package org.firstinspires.ftc.teamcode;

public class PIDController {

    // Create proportional gain
    public double P;
    // Create integral gain
    public double I;
    // Create derivative gain
    public double D;

    // Setting all data and creating the ability to retrieve data

    /**
     * This is weirded in a weird way but whatever:
     * Takes in the class P, I, and D gains and makes them public class variables to get all data for
     * created objects
     *
     * @param p The proportional gain given by user
     * @param i The integral gain given by user
     * @param d The derivative gain given by user
     * @return null
     */
    public PIDController(double p, double i, double d){
        this.P = p;
        this.I = i;
        this.D = d;
    }

    /**
     * Set class P gain alone
     *
     * @param p The proportional gain given by user
     * @return null
     */
    public void setP(double p){
        this.P = p;
    }

    /**
     * Set class I gain alone
     *
     * @param i The integral gain given by user
     * @return null
     */
    public void setI(double i){
        this.I = i;
    }

    /**
     * Set class D gain alone
     *
     * @param d The derivative gain given by user
     * @return null
     */
    public void setD(double d){
        this.D = d;
    }

    /**
     * Returns class P gain to use in other classes for some reason
     *
     * @return The class proportional gain
     */
    public double getP(){
        return P;
    }

    /**
     * Returns class I gain to use in other classes for some reason
     *
     * @return The class integral gain
     */
    public double getI(){
        return I;
    }

    /**
     * Returns class D gain to use in other classes for some reason
     *
     * @return The class derivative gain
     */
    public double getD(){
        return D;
    }

    // Calculate all data needed by user





}

