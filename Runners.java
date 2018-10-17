
/**
 * Runners class
 */
public class Runners {
    //Establish attributes

    private String runner1;
    private String runner2;
    private String runner3;
    private double time1;
    private double time2;
    private double time3;

    /**
     * The setRunner1 method sets the name of the first runner.
     */
    public void setRunner1(String r) {
        runner1 = r;
    }

    /**
     * The setRunner2 method sets the name of the second runner.
     */
    public void setRunner2(String r) {
        runner2 = r;
    }

    /**
     * The setRunner3 method sets the name of the third runner.
     */
    public void setRunner3(String r) {
        runner3 = r;
    }

    /**
     * The setTime1 method sets the time of the first runner.
     */
    public void setTime1(double t) {
        time1 = t;
    }

    /**
     * The setTime2 method sets the time of the second runner.
     */
    public void setTime2(double t) {
        time2 = t;
    }

    /**
     * The setTime3 method sets the time of the third runner.
     */
    public void setTime3(double t) {
        time3 = t;
    }

    /**
     * The getRunner1 method returns the name of the first runner.
     */
    public String getRunner1() {
        return runner1;
    }

    /**
     * The getRunner2 method returns the name of the second runner.
     */
    public String getRunner2() {
        return runner2;
    }

    /**
     * The getRunner3 method returns the name of the third runner.
     */
    public String getRunner3() {
        return runner3;
    }

    /**
     * The getTime1 method returns the time of the first runner.
     */
    public double getTime1() {
        return time1;
    }

    /**
     * The getTime2 method returns the time of the second runner.
     */
    public double getTime2() {
        return time2;
    }

    /**
     * The getTime3 method returns the time of the third runner.
     */
    public double getTime3() {
        return time3;
    }

    /**
     * The getFirstPlace method returns the name of the first place runner.
     *
     */
    public String getFirstPlace() {
        if (time1 < time2 && time1 < time3) {
            return runner1;
        } else if (time2 < time3 && time2 < time1)  {
            return runner2;
        } else {
            return runner3;      
        }       
    }

    /**
     * The getSecondPlace method returns the name of the second place runner.
     *
     */
    public String getSecondPlace() {
        if ((time1 > time2 && time1 < time3) || (time1 > time3 && time1 < time2)) {
            return runner1;
        } else if ((time2 > time1 && time2 < time3) || (time2 > time3 && time2 < time1))  {
            return runner2;
        } else {
            return runner3;
        }
    }

    /**
     * The getThirdPlace method returns the name of the third place runner.
     * Note: This method does NOT check for ties!
     */
    public String getThirdPlace() {
        if (time1 > time2 && time1 > time3) {
            return runner1;
        } else if (time2 > time3 && time2 > time1)  {
            return runner2;
        } else {
            return runner3;      
        }
    }
}
