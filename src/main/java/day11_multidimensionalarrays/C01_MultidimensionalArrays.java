package day11_multidimensionalarrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class C01_MultidimensionalArrays {
    public static void main(String[] args) {
        //Kullanicidan alinan bir Stringde gecen sesli harfleri console yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen String bir ifade giriniz");
        String str = input.nextLine();

        String arr[] = str.split("");//cumleyi arraya donusturduk.
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase("a") ||
                    arr[i].equalsIgnoreCase("e") ||
                    arr[i].equalsIgnoreCase("i") ||
                    arr[i].equalsIgnoreCase("u") ||
                    arr[i].equalsIgnoreCase("o")) {


                    System.out.print(arr[i]);
            }
        }}}
