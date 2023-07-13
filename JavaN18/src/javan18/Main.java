/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javan18;

import java.util.Scanner;
import kontaktaz.PC;

/**
 * metod 2 string goturur eger 1ci 2ciden boyukdurse 1 qaytarsin eksine oalrsa
 * -1 beraber 0
 *
 * @author Parvin
 */
public class Main {

    public static void main(String[] args) {

        if (array1() > array2()) {
            System.out.println("max=" + array1());

        } else {
            System.out.println("max=" + array2());
        }
    }

    public static int array1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("massiv daxil edin");
        int a = sc.nextInt();
        int[] b = new int[a];
        int sum1 = 0;
        for (int i = 0; i < b.length; i++) {
            b[i] = i + 3;
            sum1 += b[i];
        }
        return sum1;

    }

    public static int array2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("massiv daxil edin");
        int c = sc.nextInt();
        int[] d = new int[c];
        int sum2 = 0;
        for (int i = 0; i < d.length; i++) {
            d[i] = i + 6;
            sum2 += d[i];
        }
        return sum2;
    }

}
