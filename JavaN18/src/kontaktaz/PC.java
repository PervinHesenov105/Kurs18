/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kontaktaz;

/**
 *
 * @author Parvin
 */
public class PC extends Product implements TezSatilan, Dozumlu {

 
    int monitor;
    int ram;
    int vga;

    class Ram {
        int gb;
        
    }

    static class S {
static int a;
    }

    public void on() {

        System.out.println("pc on");
    }

    @Override
    public void sat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void tezSat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
