package day02_variables;

import java.util.Scanner;

public class C05_Scanner {
    //  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz
    //         *   Ex :
    //         *   input  : 12345==>1+2+4+5=12
    //         *   output : 12
    public static void main(String[] args) {


    Scanner input= new Scanner(System.in);
        System.out.println("bes basamakli bir sayi giriniz");

        int sayi=input.nextInt();
        int birler=sayi%10;
        int onlar=(sayi/10)%10;
        int sonIkiTop=birler+onlar;
        System.out.println("sonIkiTop = " + sonIkiTop);
        int binler=(sayi/1000)%10;
        int onbinler=(sayi/10000);
        int ilkIkiTop=binler+onbinler;
        System.out.println("ilkIkiTop = " + ilkIkiTop);
        System.out.println("ilkIkitop+sonIkiTop:  "+(ilkIkiTop+sonIkiTop));








}}
