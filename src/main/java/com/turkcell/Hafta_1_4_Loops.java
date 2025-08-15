package com.turkcell;

public class Hafta_1_4_Loops {
    public static void main(String[] args) {
        // iterasyon kodun birden fazla kez çalıştırılmasına denir.
        // Döngüler iterasyon yapılmasını sağlar.
        System.out.println("Merhaba");

        // Programlamada liste eleman sayısı 0'dan başlanarak yazılır.
        int[] numbers = {10, 20, 30, 40}; // Buna bir dizi-array denir.
        // Diziler sabit boyutludur sonradan değişemez index bazlı erişim vardır.
        // İlk eleman 0
        System.out.println(numbers[1]);

        for (int i = 0; i < 10; i++) {   //sırasıyla değişken, şart, aksiyon
            System.out.println(i);
            System.out.println("Merhaba");
        }
        // for blokları şartı sağlayana kadar çalışır.

        /*
        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i] * 5);
        }
        Bu da dizideki bütün sayıları 5 ile çarpıp yazdırıyor ama aşağıdaki kullanım daha iyi.
        */

        for (int number : numbers) {
            System.out.println(number * 5);
        } // Dizideki bütün sayıları 5 ile çarpıp yazdırdık.


        // Koşulu kontrol eder çalışmaya başlar.
        int a = 0;
        while (a < 5) {
            a++; // a'nın değerini 1 arttırıyor. a 5 olana kadar çalışacak.
            System.out.println("While çalıştı..");
        } //içindeki koşul bozulana dek kadar çalıştırır.


        // Çalışır sonra koşulu kontrol etmeye başlar.
        int i = 0;
        do {
            System.out.println("Do while çalıştı");
            i++;
        } while (i < 5);


        String[] ogrenciler = {"Utku", "Muzaffer", "Seçil", "Özgür"};
        for (String ogrenci : ogrenciler) {
            // Muzaffer isimli öğrenci es geçilsin.
            if (ogrenci.equals("Muzaffer")) {
                continue; // Bu iterasyonu burada bitir sonrakine geç demektir.
            }
            System.out.println("Öğrenci: " + ogrenci);
        }

        String[] ogrenciler2 = {"Utku", "Muzaffer", "Seçil", "Özgür"};
        for (String ogrenci : ogrenciler2) {
            // Muzaffer isimli öğrenci es geçilsin.
            if (ogrenci.equals("Muzaffer")) {
                break; // Bu iterasyonu burada bitirir. Devamı gelmez döngü sonlanır.
            }
            System.out.println("Öğrenci: " + ogrenci);
        }
    }
}

