package javan18;

import java.util.Scanner;

public class JavaN18 {

    public static void main(String[] args) {

    }

    public static void kargo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Perfect Cargoya xos gelmisiniz!");
        System.out.println("Bizim kargo xidmetdinden necenci istifadenizdir?");
        int say = sc.nextInt();

        System.out.println("Hesablama ucun catdirilacaq mesafeni daxil edin:");
        double km = sc.nextDouble();
        double mesafeOdenisi = 0;

        if (km > 2) {
            mesafeOdenisi = km * 0.40;
        }

        System.out.println("Hesablama ucun catdirilacaq mehsulun cekisini daxil edin:");
        double kq = sc.nextDouble();
        double cekiOdenisi = 0;

        if (kq > 0 && kq <= 1) {
            cekiOdenisi = kq * 0.5;
        } else if (kq > 1 && kq <= 3) {
            cekiOdenisi = kq * 1;
        } else if (kq > 3 && kq <= 7) {
            cekiOdenisi = kq * 1.50;
        } else if (kq > 7 && kq <= 10) {
            cekiOdenisi = kq * 2.50;
        } else if (kq > 10) {
            System.out.println("bu ceki ucun basqa xidmet secin");
        }

        double yekun = (cekiOdenisi + mesafeOdenisi) + (cekiOdenisi + mesafeOdenisi) * 0.18;

        if (say > 0 && say > 3) {
            System.out.println("siz endirim qazandiniz:");
            System.out.println("Odeyeceniz mebleg: " + (yekun - yekun * 0.2));
        } else if (say < 3) {

            System.out.println("Odeyeceniz mebleg: " + yekun);
        }
    }
}
