package com.turkcell;

public class operatorler {
    public static void main(String[] args) {
        //Aritmetik Operatörler
        System.out.println(10 + 10); // Toplama işlemi
        System.out.println(11 - 10); // Çıkartma işlemi
        System.out.println(10 * 10); // Çarpma işlemi
        System.out.println(10 / 10); // Bölme işlemi
        System.out.println(100 % 3); // % işareti mod operatörüdür kalanı verir.


        // Atama Operatörleri
        int a = 10;
        a = 15;
        a += 5; // A'nın değeri üzerine 5 eklemek.
        // a= a + 5 olarak da kullanılabilir.
        a -= 5; // A'nın değerinden 5 çıkar.
        a *= 5; // A'yı 5 ile çarp.
        a /= 5; // A'yı 5'e böl.
        System.out.println(a);


        // Karşılaştırma Operatörleri -> Sonuç olarak boolean değerler dönen operatörlerdir.
        System.out.println(a == 15); // A 15' e eşit mi sorusunu sorar.
        // sağlanıyorsa true sağlanmıyorsa false döner.
        // sonucu doğrulamak diyebiliriz.
        System.out.println(a != 15); // A 15'e eşit değil mi?
        System.out.println(a == 16); // A 16'ya eşit değil mi?
        System.out.println(a > 15); // A 15'den büyük mü?
        System.out.println(a >= 15); // A 15'e büyük veya eşit mi?
        System.out.println(a < 15); // A 15'den küçük mü?
        System.out.println(a <= 15); // A 15'e eşit veya küçük mü?


        // Mantık Operatörleri
        // Ve => && (İki değerde true dönerse true çıkarır.
        int yas = 17;
        System.out.println(a == 15 && yas > 18); // A 15'e eşit ve yas 18'den büyük mü?
        // Veya => || (İki değerden herhangi biri true ise true döner. İkiside false ise false döner.
        System.out.println(a == 15 || yas < 18);
    }
}
