/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kontaktaz;

/**
 *
 * @author Parvin
 */
public abstract class Product {

    String marka;
    String model;
    int qiymet;
    String reng;

    public abstract void sat();

    public void say(){
        sat();
    }
  
  
    
    
}
