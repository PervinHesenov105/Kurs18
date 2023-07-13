/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopLessons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Parvin
 */
public class Main {

    public static void main(String[] args) {
        HashMap<Integer,String> list = new HashMap<>();
     list.put(1, "Baki");
       list.put(2 , "Seki");
         list.put(1, "Gence");
         
       for(Integer i : list.keySet()){
           System.out.println(list.get(i));
       }
         
    }

}
