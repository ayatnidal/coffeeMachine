/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachine1;

/**
 *
 * @author ayatnidal11
 */
public class Brew {
    private int waterCapacity;
    private int beansCapacity;
    private int caffeineContent;
    private int calorieContent;

    public Brew(int waterCapacity, int beansCapacity, int caffeineContent, int calorieContent) {
        this.waterCapacity = waterCapacity;
        this.beansCapacity = beansCapacity;
        this.caffeineContent = caffeineContent;
        this.calorieContent = calorieContent;
    }

    public int getWaterCapacity() {
        return waterCapacity;
    }

    public void setWaterCapacity(int waterCapacity) {
        this.waterCapacity = waterCapacity;
    }

    public int getBeansCapacity() {
        return beansCapacity;
    }

    public void setBeansCapacity(int beansCapacity) {
        this.beansCapacity = beansCapacity;
    }

    public int getCaffeineContent() {
        return caffeineContent;
    }

    public void setCaffeineContent(int caffeineContent) {
        this.caffeineContent = caffeineContent;
    }

    public int getCalorieContent() {
        return calorieContent;
    }

    public void setCalorieContent(int calorieContent) {
        this.calorieContent = calorieContent;
    }
    
    
    public void brewCoffee(int amount, String type) {
    try {
        if (type.equals("espresso")) {
            if (amount == 1) {
                if (beansCapacity < 7) {
                    throw new Exception("Not enough beans in the machine to make a single shot of espresso");
                }
                if (waterCapacity < 30) {
                    throw new Exception("Not enough water in the machine to make a single shot of espresso");
                }
                System.out.println("Brewing a single shot of espresso...");
                caffeineContent += 64;
                calorieContent += 9;
                beansCapacity -= 7;
                waterCapacity -= 30;
            } else if (amount == 2) {
                if (beansCapacity < 14) {
                    throw new Exception("Not enough beans in the machine to make a double shot of espresso");
                }
                if (waterCapacity < 60) {
                    throw new Exception("Not enough water in the machine to make a double shot of espresso");
                }
                System.out.println("Brewing a double shot of espresso...");
                caffeineContent += 128;
                calorieContent += 18;
                beansCapacity -= 14;
                waterCapacity -= 60;
            } else {
                throw new Exception("Invalid amount of espresso shots requested");
            }
        } else if (type.equals("americano")) {
            if (amount == 1) {
                if (beansCapacity < 7) {
                    throw new Exception("Not enough beans in the machine to make a single shot of americano");
                }
                if (waterCapacity < 170) {
                    throw new Exception("Not enough water in the machine to make a single shot of americano");
                }
                System.out.println("Brewing a single shot of americano...");
                caffeineContent += 47;
                calorieContent += 9;
                beansCapacity -= 7;
                waterCapacity -= 170;
            } else if (amount == 2) {
                if (beansCapacity < 14) {
                    throw new Exception("Not enough beans in the machine to make a double shot of americano");
                }
                if (waterCapacity < 220) {
                    throw new Exception("Not enough water in the machine to make a double shot of americano");
                }
                System.out.println("Brewing a double shot of americano...");
                caffeineContent +=94;
                calorieContent += 18;
                beansCapacity -= 14;
                waterCapacity -= 220;
            } else {
                throw new Exception("Invalid amount of americano shots requested");
            }
        } else {
            throw new Exception("Invalid coffee type requested");
        }
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
}
    
}
