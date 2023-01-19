package calisanPrj2;

import java.util.Scanner;

public class Test2 {


    public static void main(String[] args) {

        System.out.println("********HOS GELDINIZ*********");

        Scanner scan=new Scanner(System.in);
        System.out.print("Musteri isim soyisim: ");
        String musIsimSoyIsim= scan.nextLine();

        System.out.print("Musteri tel no: ");
        String musTelNo=scan.nextLine();

        System.out.print("Musteri arac marka: ");
        String aracMarka=scan.nextLine();

        Calisan2 must1= new Calisan2(musIsimSoyIsim, musTelNo, aracMarka);



        System.out.print("Isi yapacak ustani isim soyisim: ");
        String ustaIsimSoyIsim= scan.nextLine();

        System.out.print("Usta tel no: ");
        String ustaTelNo=scan.nextLine();

        System.out.print("Ustani tecrube yili: ");
        String tecrubeYil=scan.nextLine();

        Calisan2 usta1= new Calisan2(ustaIsimSoyIsim, ustaTelNo, tecrubeYil);


        must1.musteriBilgileriniGoster();

        System.out.println("****************");

        usta1.ustaBilgileriniGoster();

        System.out.println("****************");

        Calisan2.yapilacakIs ();
    }
}
