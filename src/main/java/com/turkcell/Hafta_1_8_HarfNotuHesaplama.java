package com.turkcell;
import java.util.Scanner;

public class Hafta_1_8_HarfNotuHesaplama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== Harf Notu Hesaplama Programı ===");
        System.out.println("Notunuzu girin (0-100):");

        int not = sc.nextInt();
        harfnotuhesapla(not);
        sc.close();
    }
    public static void harfnotuhesapla(int not) {
        if (not >=90 && not <= 100) {
            System.out.println("Harf Notunuz: AA");
        } else if (not >= 80 && not <= 89) {
            System.out.println("Harf Notunuz: BA");
        } else if (not >= 70 && not <= 79) {
            System.out.println("Harf Notunuz: BB");
        } else if (not >= 60 && not <= 69) {
            System.out.println("Harf Notunuz: CB");
        } else if (not >= 50 && not <= 59) {
            System.out.println("Harf Notunuz: CC");
        } else if (not >= 0 && not <= 49) {
            System.out.println("Harf Notunuz: FF");
        } else {
            System.out.println("Geçersiz Not! Notunuz 0-100 arasında olmalı!");
        }
    }
}
