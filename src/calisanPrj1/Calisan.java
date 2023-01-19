package calisanPrj1;


public class Calisan {

    public int no=0;
    public String isim="isim girilmedi";
    public String soyIsim="soy isim girilmedi";
    public int tecrube=0;
    public int maas=12000;

    public Calisan(int no, String isim, String soyIsim, int tecrube, int maas) {
        this.no = no;
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.tecrube = tecrube;
        this.maas = maas;

    }


    public void calisanBilgileriGoster() {
        System.out.println("Calisan Bilgiler");
        System.out.println("No " + no);
        System.out.println("Isim " + isim);
        System.out.println("soyIsim " + soyIsim);
        System.out.println("tecrube " + tecrube);
        System.out.println("maas " + maas);


    }

    public void zamYap(int zamDegeri) {
        System.out.println("maasiniza yapilan zam: " + zamDegeri);
        System.out.println("Yeni maasiniz: " + (maas + zamDegeri));
    }

    public void formatAt(String isletimSistemi, String kim) {
        System.out.println(kim + " su anda " + isletimSistemi + " e format atiyor.");
    }


}
