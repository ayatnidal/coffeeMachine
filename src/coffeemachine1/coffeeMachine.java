/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachine1;

/**
 *
 * @author ayatnidal11
 */
public class coffeeMachine {
    private waterTank wt;
    private beansContener beans;
    private wastTray wtray;
    private Grinder grinder;
    private Logger log;

    public coffeeMachine() {
    }

    public coffeeMachine(waterTank wt, beansContener beans, wastTray wtray, Grinder grinder, Logger log) {
        this.wt = wt;
        this.beans = beans;
        this.wtray = wtray;
        this.grinder = grinder;
        this.log = log;
    }

    public waterTank getWt() {
        return wt;
    }

    public void setWt(waterTank wt) {
        this.wt = wt;
    }

    public beansContener getBeans() {
        return beans;
    }

    public void setBeans(beansContener beans) {
        this.beans = beans;
    }

    public wastTray getWtray() {
        return wtray;
    }

    public void setWtray(wastTray wtray) {
        this.wtray = wtray;
    }

    public Grinder getGrinder() {
        return grinder;
    }

    public void setGrinder(Grinder grinder) {
        this.grinder = grinder;
    }

    public Logger getLog() {
        return log;
    }

    public void setLog(Logger log) {
        this.log = log;
    }
    
    
    
    
}
