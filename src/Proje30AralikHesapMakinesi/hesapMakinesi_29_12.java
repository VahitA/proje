package Proje30AralikHesapMakinesi;
import java.util.Scanner;

public class hesapMakinesi_29_12 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Islem seciniz: (+ - * /)");

        char ilkIslem=scan.next().charAt(0);// islem secilir

        System.out.println("islem yapmak istediginiz iki sayiyi giriniz:");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        hesapMak(ilkIslem,sayi1,sayi2); // ilk method
        double ilkSonuc=hesapMak(ilkIslem,sayi1,sayi2);
        System.out.println("Ilk islemin sonucu: "+hesapMak(ilkIslem,sayi1,sayi2));
        //System.out.println(sayi1+" "+ilkIslem+" "+sayi2+" = "+hesapMak(ilkIslem,sayi1,sayi2));

        boolean tekrarCalis=true;

        while (tekrarCalis){
            System.out.println();
            System.out.println(ilkSonuc+" sayisiyla islem yapmak isterseniz: E"+
                    "\nYeni bir islem icin : D" +
                    "\nIslemi bitirmek icin : H ye basiniz");
            String tekrarIslemOnay=scan.next();

            if(tekrarIslemOnay.equalsIgnoreCase("E")){ // e, E girildigi muddetce calisir

                System.out.println("Yapacaginiz islemi secin (+ - * /)");
                char islem2=scan.next().charAt(0);

                System.out.println("Islem yapmak istediginiz sayiyi girin:");
                double sayi3=scan.nextDouble();
                hesapMakTekrar(islem2,ilkSonuc,sayi3); // tekrar islemleri yapacak method

                System.out.println("Son islemin sonucu: "+ hesapMakTekrar(islem2,ilkSonuc,sayi3));
                ilkSonuc=hesapMakTekrar(islem2,ilkSonuc,sayi3);
            }else if (tekrarIslemOnay.equalsIgnoreCase("D")){
                System.out.print("Yeni ");
                main(args);

            }else if (tekrarIslemOnay.equalsIgnoreCase("H")){
                tekrarCalis=false;


            }else {System.out.println("Hatali giris, tekrar deneyin."); tekrarCalis=true;}
        }
    }

    private static double hesapMakTekrar(char islem2, double ilkSonuc, double sayi3) {//tekrar islem methodu

        switch (islem2){
            case '+':
                return ilkSonuc+sayi3;
            case '-':
                return ilkSonuc-sayi3;
            case '*':
                return ilkSonuc*sayi3;
            case '/':
                return ilkSonuc/sayi3;
            default:

                System.out.println("Hatali giris");
                return 0;  // yanlis giris yapildiginda 0 yazar
        }
    }

    private static double hesapMak(char ilkIslem, double sayi1, double sayi2) {//ilk method

        switch (ilkIslem){
            case'+':
                return sayi1 + sayi2;
            case'-':
                return sayi1 - sayi2;
            case'*':
                return sayi1 * sayi2;
            case'/':
                return sayi1 / sayi2;
            default:
                System.out.println("Hatali giris");
                return 0;  // yanlis giris yapildiginda 0 yazar
        }

    }

}


