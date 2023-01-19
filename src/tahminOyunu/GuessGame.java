package tahminOyunu;

import java.util.Scanner;


    public class GuessGame {
        /*
    Projects_05.GameGuess paketinde
    GuessGame classi olusturunuz...

       randomGenerator ()  methodunu oluşturalım.
       Bu method 0 ile 100 arasında random bir sayı oluşturmalı.
       Bu method random sayıyı return etmelı.
       Return türü int olmalı


        LetsGuess ()  methodunu oluşturalım.
        Bu method parametre olarak bir int almalı.
       Return türü void olsun.
       Bu method da, doğru sayıyı tahmin edene kadar sayıları tahmin etmeye devam etmelisiniz.
       Numaranız random sayıdan küçükse "Your number is too low" yazdıralım.
       Numaranız random sayıdan büyükse "Your number is too high" yazdıralım.
       Tahmin numaranız  random sayıya eşit olduğunda "You got it !!" yazdıralım
       Ve execution durdurun.
       Tahmin girişiminiz maksimum 5'tir.
       Eğer tahmininiz  5'e ulaşırsa "Anlamadım dostum !!!"
       Not:
        1) Sayıları tahmin ederken Scanner Class kullanmanız gerekir.
        2) Bu methodların her ikisi de statik bir method değildir
*/


        public static void main(String[] args) {

            GuessGame obj = new GuessGame();
            int sayi = obj.RandomGenerator();

            obj.LetsGuess(sayi);

            System.out.println(sayi);
        }

        public int RandomGenerator() {

            int rndmsayi = (int) (Math.random() * ((100 - 0) + 1)) + 0;

            return rndmsayi;

        }

        public void LetsGuess(int sayi) {
            Scanner scan = new Scanner(System.in);
            int tahmin = 0;
            for (int i = 0; i < 5; i++) {
                System.out.println(i + 1 + " . sayi giriniz");
                tahmin = scan.nextInt();
                if (tahmin < sayi) {
                    System.out.println("Your number is too low");
                } else if (tahmin > sayi) {
                    System.out.println("Your number is too high");
                } else if (tahmin == sayi) {
                    System.out.println("You got it !!");
                    break;
                }

            }
            if (tahmin != sayi) {
                System.out.println("anlamadım dostum! ");
            }
        }
    }
