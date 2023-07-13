/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javan18;

import java.util.Scanner;

/**
 *
 * @author Parvin
 */
public class Test2 {

    public static void main(String[] args) {
        yazdir(-9);
    } 

    public static double faiziHesabla(double mebleg, double faiz) {
        double yekun = (mebleg * faiz) / 100;
        return yekun;
    }

   
   public static void yazdir(int a){
       if(a>0){
           System.out.println("musbet ededdir");
       }
       else{
           return;
       }
       
       System.out.println("metodun sonu");
   }

}
