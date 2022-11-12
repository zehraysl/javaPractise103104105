package day02_variables;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //  Soru 1)   Kullanicinin  girdigi 4 basamakli sayinin ilk ve son rakaminin
        //   toplamini ekrana yazdiran programi yazdiriniz.


        //Scanner scan = new Scanner(System.in);
     /*   System.out.println("Lutfen dort basmakli bir sayi giriniz.");
       int sayi= scan.nextInt();
       //bir sayinin birler basamagindaki rakami %10 ile hesaplatabiliriz.

        int sonRakam=sayi%10;
        int ilkRakam=sayi/1000;
        System.out.println("ilk rakam + son rakam "+ (ilkRakam+sonRakam));*/


        //  Soru 2) Kullanicidan uc basamakli bir sayi alin ve
        //  sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

        /*System.out.println("uc basamakli bir sayi giriniz.");
        int sayi = scan.nextInt();
        //birler basamagindaki rakami bulmak icin 10 a boleriz.
        int birler = sayi % 10;
        System.out.println("Girdiginiz sayinin birler basamagi:  " + birler);

        int yeniSayi = sayi /= 10;
        System.out.println("yeniSayi:  " + yeniSayi);

        int onlar = sayi % 10;
        System.out.println("girdiginiz sayinin onlar basamagi:  " + onlar);

        int yuzler = sayi /= 10;
        System.out.println("Girdiginiz sayinin yuzler basamagi:  " + yuzler);*/


        //  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz
        //         *   Ex :
        //         *   input  : 12345==>1+2+4+5=12
        //         *   output : 12



        Scanner scan=new Scanner(System.in);
        System.out.println("bes basamakli bir sayi giriniz");
        int sayi= scan.nextInt();
        int birler=sayi%10;
        System.out.println("birler = " + birler);
        int onlar= (sayi/10)%10;
        System.out.println("onlar = " + onlar);
        int binler=(sayi/1000)%10;
        System.out.println("binler = " + binler);
        int onbinler=(sayi/10000);
        System.out.println("onbinler = " + onbinler);
        int toplam=birler+onlar+binler+onbinler;
        System.out.println("toplam = " + toplam);


    }}







