package com.turkcell;

public class Hafta_1_3_sartkosulbloklari {
    public static void main(String[] args) {
        int  yas = 19;
        // Yaş 18'den büyükse ekrana kişi reşit yazsın değilse değil yazsın.
        // Şart-Koşul Blokları
        if (yas > 18)
        {
            System.out.println("Kişi reşit."); // X
        }
        else if (yas == 18) // 18'den büyük değil ama 18' e eşit mi?
        {
            System.out.println("Kişi tam 18, ay kontrolü yapılmalı");
        }
        else // if içersisindeki koşuluğun gerçekleşmediği durumlarda yapılacak işlem.
        {
            System.out.println("Kişi reşit değil."); // Y
        }


        // Bir if bloğu sadece if ile de çalışabilir. else if, else olmasada çalışabilir.
        boolean admin = true;
        if(admin) //admin true ise if blogu calisir.
        {
            System.out.println("Logla");
        }

    }
}
