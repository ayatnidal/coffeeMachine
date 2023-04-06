/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachine1;

/**
 *
 * @author ayatnidal11
 */

public class coffeBeans {
    private String Type;

    public coffeBeans() {
    }

    public coffeBeans(String Type) {
        this.Type = Type;
    }
    
    public void grind(String type){
    }

    
    public String getInfo() {
        return "Beans{" + "Type=" + Type + '}';
    }
    
    
}