package Proje30AralikHesapMakinesi;

import java.util.Scanner;

    public class Calculator_main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Kullanıcıdan işlem sembolünü al
            System.out.print("Lütfen işlem sembolünü giriniz (+, -, * veya /): ");
            String symbol = sc.next();

            // Kullanıcıdan ilk sayıyı al
            System.out.print("Lütfen ilk sayıyı giriniz: ");
            double num1 = sc.nextDouble();

            // Kullanıcıdan ikinci sayıyı al
            System.out.print("Lütfen ikinci sayıyı giriniz: ");
            double num2 = sc.nextDouble();

            // İşlem sembolüne göre işlemi gerçekleştir ve sonucu değişkene ata
            double result;
            if (symbol.equals("+")) {
                result = num1 + num2;
            } else if (symbol.equals("-")) {
                result = num1 - num2;
            } else if (symbol.equals("*")) {
                result = num1 * num2;
            } else if (symbol.equals("/")) {
                result = num1 / num2;
            } else {
                System.out.println("Geçersiz işlem sembolü!");
                return;
            }

            // Sonucu ekrana yazdır
            System.out.println("Sonuç: " + result);

            // Yeni bir işlem yaptırmak için kullanıcıdan işlem sembolünü al
            System.out.print("Yeni bir işlem yaptırmak ister misiniz? (E/H): ");
            String repeat = sc.next();

            // Eğer kullanıcı "E" yazarsa, tekrar işlem yaptır
            if (repeat.equalsIgnoreCase("E")) {
                main(args);
            }
        }
    }
