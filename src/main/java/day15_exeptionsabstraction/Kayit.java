package day15_exeptionsabstraction;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit extends Runner {

    static List<String> listKullaniciID = new ArrayList<>(); //list interface oldugu icin constructor yoktur bu yuzden arraylist kullaniyoruz.
    static List<Integer> listKullaniciSaniye=new ArrayList<>();
    static Scanner input= new Scanner(System.in);

    static int counter=0;

    public void kayit(){

        String kullaniciID="";
        System.out.println("Lutfen kullanici ID giriniz");
        kullaniciID=input.nextLine();
        
        int kullaniciSaniye= LocalDateTime.now().getSecond();//0 ile 60 arasinda bir deger verir.
        System.out.println("kullanici saniye = " + kullaniciSaniye);
        listKullaniciID.add(kullaniciID);
        listKullaniciSaniye.add(kullaniciSaniye);

        tamamMiDevamMi();



    }//kayit()

    private void tamamMiDevamMi() {
        String tmmMDvmM="";

        do{
            System.out.println("Baska kayit var mi? (E/H) ");
            tmmMDvmM =input.next();
            if(tmmMDvmM.equalsIgnoreCase("e")){
                kayit();

            }else if (tmmMDvmM.equalsIgnoreCase("h")){
                System.out.println("Gule gule");
                break;
            }


        }while(!tmmMDvmM.equalsIgnoreCase("e")&&!tmmMDvmM.equalsIgnoreCase("h"));
        counter++;
        if(counter==1){//bunu yazdirmazsak Arrayi tekrar tekrar yazdirir.

            SansliKullanici snslKlnc= new SansliKullanici();
            snslKlnc.sansliKullaniciYazdir(listKullaniciID,listKullaniciSaniye);

        }

    }


}
