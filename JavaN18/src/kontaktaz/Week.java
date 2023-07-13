/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kontaktaz;

/**
 *
 * @author Parvin
 */
public enum Week {
    MONDAY(1),TUESDAY(2 ),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);
    
    private int a;

    private Week(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
    
    
}

