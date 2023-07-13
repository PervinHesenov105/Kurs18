/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopLessons;

/**
 *
 * @author Parvin
 */
public abstract class Masin {
 

    public  abstract void start();
   
    
       public  void stop(){
        System.out.println("tormuzla dayandi");
        start();
    }
    
    
    
 
}
