package calisanPrj2;

import java.util.Scanner;

public class Calisan2 {

    // ???? ustanin ismini yazdirmayi halledecem ????

    // 1- instance variablelari olusturun
    public String musIsimSoyIsim;
    public String musTelNo;
    public String aracMarka;


    public static String ustaIsimSoyIsim;
    public int tecrubeYil;
    public String ustaTelNo;

    // 2- bu variablelari iceren constroctor olusturun.
    public Calisan2(String ustaIsimSoyIsim, String ustaTelNo, int tecrubeYil) {
        this.ustaIsimSoyIsim = ustaIsimSoyIsim;
        this.ustaTelNo = ustaTelNo;
        this.tecrubeYil = tecrubeYil;

    }

    public Calisan2(String musIsimSoyIsim, String musTelNo, String aracMarka) {
        this.musIsimSoyIsim = musIsimSoyIsim;
        this.musTelNo = musTelNo;
        this.aracMarka = aracMarka;
    }

    //calisan Bilgilerini Gosteren methodu yazin.

    public void musteriBilgileriniGoster(){
        System.out.println("******MUSTERI BILGILERI*******");
        System.out.println("MUSTERI ISIM SOYISIM:"+ musIsimSoyIsim);
        System.out.println("MUSTERI TEL NO: "+ musTelNo);
        System.out.println("MUSTERI ARAC MARKA: "+aracMarka);
    }


    public void ustaBilgileriniGoster(){
        System.out.println("******USTA BILGILERI*******");
        System.out.println("USTA ISIM SOYISIM: "+ ustaIsimSoyIsim);
        System.out.println("ISTA TEL NO: "+ ustaTelNo);
        System.out.println("USTA TECRUBE YILI: "+tecrubeYil);
    }

    //yapilacak isi sectiren methodu yazin

    public static void yapilacakIs(){

        Scanner scan=new Scanner(System.in);
        System.out.println("yapilmasini istediginiz islemi secin: \n" +
                "1-Rot ayari\n" +
                "2-Balans ayari\n" +
                "3-Lastik tamiri\n");
        int secim= scan.nextInt();

        switch (secim){
            case 1:
                // ???? ustanin ismini yazdirmayi halledecem ????
                System.out.println("Rot ayari icin "+ustaIsimSoyIsim+"'ya 250 tl odeme yapilacak");
                break;

            case 2:
                System.out.println("Balans ayari icin "+ustaIsimSoyIsim+"'ya 200 tl odeme yapilacak");
                break;

            case 3:
                System.out.println("Lastik tamiri icin "+ustaIsimSoyIsim+"'ya 70 tl odeme yapilacak");
                break;
            default:
                System.out.println("hatali secim");
        }


    }

}
