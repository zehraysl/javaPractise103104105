package day04_ifsatatement;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {
        //Kullanicidan bir gun alin
        // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
        // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
        // “Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir gün giriniz..");
        String gunIsmi = scan.next().toUpperCase();

//        if (gunIsmi.equalsIgnoreCase("Cuma") ){
//           System.out.println("Muslumanlar icin kutsal gun..." );
//       } else if (gunIsmi.equalsIgnoreCase("Cumartesi" )){
//            System.out.println("Yahudiler icin kutsal gun..." );     }
//        else if (gunIsmi.equalsIgnoreCase("Pazar") ){
//            System.out.println("Hiristiyanlar icin kutsal gun...");
//      } else {
//            System.out.println("Uzaylısınız :D");
//        }

        switch (gunIsmi){
            case "Cuma":
                System.out.println("Muslumanlar icin kutsal gun...");
                break;
            case "Cumartesi":
                System.out.println("Yahudiler icin kutsal gun..." );
                break;
            case "Pazar":
                System.out.println("Hiristiyanlar icin kutsal gun...");
                break;
            default:
                System.out.println("Uzaylısınız :D");
        }
}}
