package day05_ifstatement;

import java.util.Scanner;

public class C04_IfStatement {
    public static void main(String[] args) {

//Kullanici 0'dan kucuk 120'den buyuk deger giremiyecek sekilde degerleri aldiktan sonra ;
// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
// calisan erkekse 65 yasindan buyukse emekli olabilir seklinde yazdiran bir kod yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz"+"\n Kadin icin K \n erkek icin E harfini giriniz");
        char cinsiyet=input.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        double yas= input.nextDouble();
        if(cinsiyet =='K'){
            if(yas<0||yas>120)
            {
                System.out.println("Lutfen dogru yas degeri giriniz");
            }else if(yas>60){
                System.out.println("Emekli olabilirsin");

            }else{
                System.out.println("Emekli olamazsin "+(60-yas)+" yil daha calismalisiniz");
            }
        }else if(cinsiyet =='E'){
            if(yas<0||yas>120){
                System.out.println("Lutfen dogru yas degeri giriniz");
            }else if(yas>65){
                System.out.println("Emekli olabilirsin");
            }else{
                System.out.println("Emekli olamazsin "+(65-yas)+ " yil daha calismalisiniz");
            }
        }else System.out.println("Lutfen gecerli bir harf giriniz");

//2.yol
//        System.out.println("Lütfen yaşınızı giriniz");
//        int yas1 = input.nextInt();
//        System.out.println("Lütfen cinsiyetinizi seçiniz: \n Kadın için K \n Erkek için E harfi");
//        char cinsiyet1 = input.next().toUpperCase().charAt(0);
//
//        if(yas<0 || yas>120){
//            System.out.println("Geçersiz yaş girdiniz.");
//        }else if (cinsiyet=='K' && yas>60){
//            System.out.println("Emekli olabilirsin");
//        } else if (cinsiyet=='E' && yas>65) {
//            System.out.println("Emekli olabilirsin");
//        }else {
//            System.out.println("Emekli olamazsın");
//        }
//
//
//




    }
}
