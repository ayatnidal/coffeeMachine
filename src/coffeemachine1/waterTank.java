/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachine1;

/**
 *
 * @author ayatnidal11
 */
public class waterTank {
    private int waterCapacity;
    private static final int Max_Water_Capacity = 1000;

    public waterTank(int waterCapacity) {
        this.waterCapacity = waterCapacity;
    }

    public int getWaterCapacity() {
        return waterCapacity;
    }

    public void setWaterCapacity(int waterCapacity) {
        this.waterCapacity = waterCapacity;
    }
    
   public void addWater(int amount) {
    try {
        if (waterCapacity + amount > Max_Water_Capacity) {
            throw new Exception("Water capacity exceeded");
        }
        System.out.println("Adding " + amount + "ml of water...");
        waterCapacity += amount;
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
}
    
}
