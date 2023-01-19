package kelimeOyunu_06ocak;

import java.util.Scanner;

public class KelimeOyunu_tmm {  /*
    Constructor Sorusu:
1. Aşama: Başlangıçta İlk Oyuncuya oyunu başlatmak için bir kelime girmesini iste.
2. Aşama: Sonra oyuncuyu degiştir ve ikinci oyuncuya geç. Yeni oyuncuya verilen kelimenin geçerli olup olmadıgını sor
   2.1) Eğer yeni oyuncu verilen kelimeyi kabul ederse : kelimeyi yazan oyuncuya puan olarak kelimedeki harf sayısını ekleyin ve 3. adıma gidin
  2.2) Eğer yeni oyuncu verilen kelimeyi	geçerli olarak kabul etmezse "Geçersiz kelime, oyuncu X(Mevcut oyuncu) oyunu kazandı" yazıp oyunu bitirin.
3. Aşama: Kullanıcılara oyuna devam etmek isteyip istemediklerini sor: Eğer devam etmek isterlerse:
  3.1) Kullanıcıdan kelimeye eklemek için bir harf isteyin
  3.2) Ve kullanıcıya hangi tarafa eklemek istedigini sorun (Başa veya Sona)
  3.3) Daha sonra harfi kelimeye ekleyin ve 2.Aşamaya geçin Eğer devam etmek istemezlerse: "Game Finished" yazdırın.
  Puanları ve kazananı ekrana yazdırın

     */
    public static void main(String[] args) {
        int oyuncu1Puan=0;
        int oyuncu2Puan=0;
        String kelime="";

       // 1. Aşama: Başlangıçta İlk Oyuncuya oyunu başlatmak için bir kelime girmesini iste.
        Scanner scan=new Scanner(System.in);
        System.out.println("1. oyuncu ilk kelimeyi girin");
        kelime= scan.nextLine();
        int harfSayisi = kelime.length();
        //2. Aşama: Sonra oyuncuyu degiştir ve ikinci oyuncuya geç. Yeni oyuncuya verilen kelimenin geçerli olup olmadıgını sor
        System.out.println("2. oyuncu kelimeyi kabul ediyor musun: E/H");
        char onay2=scan.next().charAt(0);
        //2.1) Eğer yeni oyuncu verilen kelimeyi kabul ederse :
        // kelimeyi yazan oyuncuya puan olarak kelimedeki harf sayısını ekleyin ve 3. adıma gidin

       if(onay2=='e'||onay2=='E') {
           oyuncu1Puan+=harfSayisi;

           //2.2) Eğer yeni oyuncu verilen kelimeyi	geçerli olarak kabul etmezse "Geçersiz kelime, oyuncu X(Mevcut oyuncu) oyunu kazandı" yazıp oyunu bitirin.
       }else if (onay2=='h'||onay2=='H') {
           System.out.println("Geçersiz kelime, oyuncu 2. oyuncu oyunu kazandı");
        }
do {
//3. Aşama: Kullanıcılara oyuna devam etmek isteyip istemediklerini sor: Eğer devam etmek isterlerse:
    System.out.println("1. oyuncu devam etmek istiyor musun: E/H");
    char onay1 = scan.next().charAt(0);
    System.out.println("2. oyuncu devam etmek istiyor musun: E/H");
    onay2 = scan.next().charAt(0);

    // 3.1) Kullanıcıdan kelimeye eklemek için bir harf isteyin
    if ((onay1 == 'e' || onay1 == 'E') && (onay2 == 'e' || onay2 == 'E')) {
        System.out.println("2. oyuncu kelimeye eklenecek harf ya da harfleri girin");
        scan = new Scanner(System.in);
        String eklenenHarfler = scan.nextLine();
        harfSayisi = eklenenHarfler.length();
        oyuncu2Puan += harfSayisi;

        //  3.2) Ve kullanıcıya hangi tarafa eklemek istedigini sorun (Başa veya Sona
        //3.3) Daha sonra harfi kelimeye ekleyin ve 2.Aşamaya geçin Eğer devam etmek istemezlerse: "Game Finished" yazdırın.
        System.out.println("harfleri basa mi sona mi eklensin: B/S");
        char basSonOnay = scan.next().charAt(0);
        if (basSonOnay == 'S' || basSonOnay == 's') {
            kelime = kelime + eklenenHarfler;
            System.out.println(kelime);
        } else if (basSonOnay == 'B' || basSonOnay == 'b') {
            kelime = eklenenHarfler + kelime;
            System.out.println(kelime);
        }
    } else if ((onay1 == 'h' || onay1 == 'H') || (onay2 == 'H' || onay2 == 'h')) {
        System.out.println("oyun bitmistir");
        System.out.println("1. oyuncu puani: "+oyuncu1Puan);
        System.out.println("2. oyuncu puani: "+oyuncu2Puan);
        break;
    }
    //3. Aşama: Kullanıcılara oyuna devam etmek isteyip istemediklerini sor: Eğer devam etmek isterlerse:
    System.out.println("2. oyuncu devam etmek istiyor musun: E/H");
    onay2 = scan.next().charAt(0);
    System.out.println("1. oyuncu devam etmek istiyor musun: E/H");
    onay1 = scan.next().charAt(0);

    // 3.1) Kullanıcıdan kelimeye eklemek için bir harf isteyin
    if ((onay1 == 'e' || onay1 == 'E') && (onay2 == 'e' || onay2 == 'E')) {
        System.out.println("1. oyuncu kelimeye eklenecek harf ya da harfleri girin");
        scan = new Scanner(System.in);
        String eklenenHarfler = scan.nextLine();
        harfSayisi = eklenenHarfler.length();
        oyuncu2Puan += harfSayisi;

        //  3.2) Ve kullanıcıya hangi tarafa eklemek istedigini sorun (Başa veya Sona
        //3.3) Daha sonra harfi kelimeye ekleyin ve 2.Aşamaya geçin Eğer devam etmek istemezlerse: "Game Finished" yazdırın.
        System.out.println("harfleri basa mi sona mi eklensin: B/S");
        char basSonOnay = scan.next().charAt(0);
        if (basSonOnay == 'S' || basSonOnay == 's') {
            kelime = kelime + eklenenHarfler;
            System.out.println(kelime);
        } else if (basSonOnay == 'B' || basSonOnay == 'b') {
            kelime = eklenenHarfler + kelime;
            System.out.println(kelime);
        }
    } else if ((onay1 == 'h' || onay1 == 'H') || (onay2 == 'H' || onay2 == 'h')) {
        System.out.println("oyun bitmistir");
        System.out.println("1. oyuncu puani: "+oyuncu1Puan);
        System.out.println("2. oyuncu puani: "+oyuncu2Puan);
        break;
    }
    System.out.println("1. oyuncu puani: "+oyuncu1Puan);
    System.out.println("2. oyuncu puani: "+oyuncu2Puan);

        }while(true);
    }
}
