/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachine1;

/**
 *
 * @author ayatnidal11
 */

public class Machine {
    private coffeBeans beans;
    private double water,waterCapacity,beansCapacity;
    private int cup,dripTray;
    //private int amountOfCoffee;
    //private int caffeineContent;
    //private boolean needsCleaning;

    public Machine() {
    }

    public Machine(coffeBeans beans, double water, double waterCapacity, double beansCapacity, int cup, int dripTray) {
        this.beans = beans;
        this.water = water;
        this.waterCapacity = waterCapacity;
        this.beansCapacity = beansCapacity;
        this.cup = cup;
        this.dripTray = dripTray;
    }

    public coffeBeans getBeans() {
        return beans;
    }

    public void setBeans(coffeBeans beans) {
        this.beans = beans;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getWaterCapacity() {
        return waterCapacity;
    }

    public void setWaterCapacity(double waterCapacity) {
        this.waterCapacity = waterCapacity;
    }

    public double getBeansCapacity() {
        return beansCapacity;
    }

    public void setBeansCapacity(double beansCapacity) {
        this.beansCapacity = beansCapacity;
    }

    public int getCup() {
        return cup;
    }

    public void setCup(int cup) {
        this.cup = cup;
    }

    public int getDripTray() {
        return dripTray;
    }

    public void setDripTray(int dripTray) {
        this.dripTray = dripTray;
    }
    
    public void fillWater(){
        
    }
    
    public void fillBeans(){
        
    }
    
    //public int calculateCaffeine(int amountOfCoffee) {   
    //return caffeineContent;
    //}
    
    //public boolean needsCleaning() { 
    //return needsCleaning;
    //}

    public String getInfo() {
        return "Machine{" + "beans=" + beans + ", water=" + water + ", waterCapacity=" + waterCapacity + ", beansCapacity=" + beansCapacity + ", cup=" + cup + ", dripTray=" + dripTray + '}';
    }
    
    
}
