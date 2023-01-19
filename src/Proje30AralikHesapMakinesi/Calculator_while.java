package Proje30AralikHesapMakinesi;

import java.util.Scanner; // Scanner sınıfını içe aktarıyoruz

public class Calculator_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Girdi almak için Scanner nesnesi oluşturuyoruz
        double result = 0; // Sonuç değişkeni
        boolean continueCalculating = true; // İşlemlerin devam etip etmeyeceğini tutan değişken

        while (continueCalculating) { // İşlemler devam ederse
            System.out.println("Lütfen bir işlem seçin (+, -, * veya /):");
            String operation = sc.next(); // İşlem seçimi için girdi alıyoruz

            System.out.println("Lütfen ilk sayıyı girin:");
            double num1 = sc.nextDouble(); // İlk sayı için girdi alıyoruz

            System.out.println("Lütfen ikinci sayıyı girin:");
            double num2 = sc.nextDouble(); // İkinci sayı için girdi alıyoruz

            // İşlemleri yapıyoruz
            if (operation.equals("+")) {
                result = num1 + num2;
            } else if (operation.equals("-")) {
                result = num1 - num2;
            } else if (operation.equals("*")) {
                result = num1 * num2;
            } else if (operation.equals("/")) {
                result = num1 / num2;
            } else {
                System.out.println("Geçersiz işlem seçimi. Lütfen tekrar deneyin.");
            }

            // Sonucu ekrana yazdırıyoruz
            System.out.println("Sonuç: " + result);

            // İşlemlerin devam etip etmeyeceğini soruyoruz
            System.out.println("Yeni bir işlem yapmak ister misiniz? (E/H)");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("H")) { // Kullanıcı işlem yapmak istemiyorsa
                continueCalculating = false; // İşlemlerin devam etmemesi için değişkeni false yapıyoruz
            }
        }
    }
}
