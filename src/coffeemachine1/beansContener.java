/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachine1;

/**
 *
 * @author ayatnidal11
 */
public class beansContener {
    private int beansCapacity;
    private static final int Max_Beans_Capacity = 500;

    public beansContener(int beansCapacity) {
        this.beansCapacity = beansCapacity;
    }

    public int getBeansCapacity() {
        return beansCapacity;
    }

    public void setBeansCapacity(int beansCapacity) {
        this.beansCapacity = beansCapacity;
    }

    public void addBeans(int amount) {
    try {
        if (beansCapacity + amount > Max_Beans_Capacity) {
            throw new Exception("Bean capacity exceeded");
        }

        System.out.println("Adding " + amount + "g of beans...");
        beansCapacity += amount;
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
}
}