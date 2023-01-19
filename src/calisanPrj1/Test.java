package calisanPrj1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("HOSGELDINIZ");

        Scanner scan = new Scanner(System.in);

        System.out.println("No ");
        int no = scan.nextInt();

        scan.nextLine();

        System.out.println("Isim ");
        String isim = scan.nextLine();

        System.out.println("soyIsim ");
        String soyIsim = scan.nextLine();

        System.out.println("tecrube ");
        int tecrube = scan.nextInt();

        System.out.println("maas ");
        int maas = scan.nextInt();

        Calisan cls1 = new Calisan(no, isim, soyIsim, tecrube, maas);

        System.out.println("Islem sec \n" + "1-calisan bilgilerini goster\n" +
                "2-zamyap\n" +
                "3-format at");

        int islem = 0;
        islem = scan.nextInt();

        scan.nextLine();

        switch (islem) {
            case 1:
                cls1.calisanBilgileriGoster();
                break;

            case 2:
                System.out.println("zam miktarini giriniz");
                int zamDegeri = scan.nextInt();
                cls1.zamYap(zamDegeri);

                break;

            case 3:
                System.out.println("kim format atacak:");
                String kisi = scan.nextLine();

                System.out.println("isletim sistemi");
                String isletimSistemi = scan.nextLine();
                cls1.formatAt(kisi, isletimSistemi);

                main(args);
                break;

            default:
                System.out.println("hatali secim");
                main(args);
                break;

        }
    }
}
