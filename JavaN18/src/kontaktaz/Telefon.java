/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kontaktaz;

/**
 *
 * @author Parvin
 */
public class Telefon extends Product{

    int ram;
    int cam;

    public void zeng() {
        System.out.println("zeng edilir!");
    }
    
    @Override
    public void sat(){
        System.out.println("telefonlar kreditle satilir!");
    }

}
