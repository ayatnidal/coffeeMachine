/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachine1;

/**
 *
 * @author ayatnidal11
 */
public class Grinder {
    private int beansCapacity;

    public Grinder(int beansCapacity) {
        this.beansCapacity = beansCapacity;
    }

    public int getBeansCapacity() {
        return beansCapacity;
    }

    public void setBeansCapacity(int beansCapacity) {
        this.beansCapacity = beansCapacity;
    }
    

    public void grindBeans(int amount) {
    try {
        if (amount > beansCapacity) {
            throw new Exception("Not enough beans in the machine");
        }

        System.out.println("Grinding " + amount + "g of beans...");
        beansCapacity -= amount;
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
}
}
