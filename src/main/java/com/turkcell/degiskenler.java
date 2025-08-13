package com.turkcell;

public class degiskenler {
    public static void main(String[] args) {
        // Yorum satırı örneği.
        System.out.println("Yaşar EREN");

        /*
        Syntax => Söz dizim kuralları.
        Değişkenler => Programlamada verilerin bir isimle tanımlandıktan sonra tutulmasıdır.
        */

        int yas = 25; //Tam sayı tanımlar.
        yas = 30;
        System.out.println(yas);
        yas = 40;


        String isim = "Yaşar EREN"; // Metinsel değerler çift tırnak içinde yazılır.
        System.out.println(isim);
        isim = "Yaşar EREN.2";


        float sayi = 10.14F; // Ondalıklı sayı gösterirken float kullanılır ve sayı sonuna f eklenir.
        double sayi1 = 10.14; // Ondalıklı sayı gösterir.
        // Aralarındaki fark byte farkı 4-8

        long sayi2 = 10L; //Tam sayı tanımlar int gibi ama boyutu daha büyük. Java int range daha az longa göre.
        short sayi3 = 11; // int den daha küçük boyutu
        char karakter = 'K'; // ' ' şeklinde kullanılır tekil bir metinsel alan ifade eder.
        boolean aktif = true; // Boolean true/false iki değer alır.
    }
}
