package Proje30AralikHesapMakinesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjectCalculation {

    static Scanner scan = new Scanner((System.in));

    public static void main(String[] args) {
        menu();

    }


    public static void menu() {

        System.out.println("Lütfen yapacaginiz islemi seciniz : 1-Toplama  2-Cikarma 3-Carpma 4-Bolme");
        int secim = scan.nextInt();

        if (secim == 1) {
            toplama();
        } else if (secim == 2) {
            cikarma();
        } else if (secim == 3) {
            carpma();
        } else if (secim == 4) {
            bolme();
        } else {
            System.out.println("lütfen hesaplama menüsünde yer alan  sayi giriniz");
            menu();
        }

    }

    private static void bolme() {
        System.out.println("bölme islemi icin birinci sayiyi giriniz");
        double sayi1 = scan.nextDouble();
        System.out.println("ikinci sayiyi giriniz");
        double sayi2 = scan.nextDouble();
        if (sayi2 == 0) {
            System.out.println("0!! disinda bir sayi giriniz!!");
            bolme();
        } else {
            System.out.println("islemin sonucu :" + (sayi1 / sayi2));
        }

    }

    private static void carpma() {
        System.out.println("carpma islemi icin birinci sayiyi giriniz");
        double sayi1 = scan.nextDouble();
        System.out.println("ikinci sayiyi giriniz");
        double sayi2 = scan.nextDouble();
        System.out.println("islemin sonucu :" + (sayi1 * sayi2));
    }

    public static void cikarma() {
        System.out.println("cikram islemi icin birinci sayiyi giriniz");
        double sayi1 = scan.nextDouble();
        System.out.println("ikinci sayiyi giriniz");
        double sayi2 = scan.nextDouble();
        System.out.println("islemin sonucu :" + (sayi1 - sayi2));
    }


    public static void toplama() {

        System.out.println("toplama islemi icin birinci sayiyi giriniz");
        double sayi1 = scan.nextDouble();
        System.out.println("ikinci sayiyi giriniz");
        double sayi2 = scan.nextDouble();
        double sonuc = sayi1 + sayi2;
        System.out.println("islemin sonucu :" + (sonuc));
        devamMenusu(sonuc);

    }

    public static void devamMenusu(double sonuc) {

        List<Double> listem = new ArrayList<Double>();

        listem.add(sonuc);

        System.out.println("bu sayi ile hangi islemi yapmaya devam etmek istiyorsunuz? : " +
                "1-bu sayinin üstüne toplamaya devam");
        int secim1 = scan.nextInt();

        do {
            System.out.println("lütfen yeni bir sayi giriniz");

            double yeniSayi = scan.nextDouble();
            listem.add(yeniSayi);


            int toplam = 0;

            System.out.println("Girmis oldugunuz tüm sayilar" + listem);

            for (int i=0; i<listem.size(); i++) {
                toplam += listem.get(i);
                System.out.println(toplam);
            }

        } while (secim1 == 1);

        // return sonuc;
    }

}




    /*
Problem Tanımı :
Basit 4 işlem yapan bir hesap makinesi kodlayınız....
Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayinız.
Kullanicidan iki sayi girmesini isteyiniz.
Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.

cikan sonucla yeni bi islem yaptirmayi sectirip isleme devam ettirin
hesap makinesi ve islemler methodla calissin.
     */

