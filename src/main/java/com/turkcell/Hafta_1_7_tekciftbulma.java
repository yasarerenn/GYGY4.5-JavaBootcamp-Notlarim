package com.turkcell;
import java.util.Scanner;

public class Hafta_1_7_tekciftbulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Tek Çift Kontrol Programı ===");
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();
        kontrolEt(sayi);
        scanner.close();
    }

    public static void kontrolEt(int sayi)
    {
        if (sayi % 2 == 0) {
            System.out.println(sayi + " çift sayıdır.");
        } else {
            System.out.println(sayi + " tek sayıdır.");
        }
    }
}
