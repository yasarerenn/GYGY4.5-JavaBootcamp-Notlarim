package com.turkcell;

public class Hafta_1_5_Methods {
    public static void main(String[] args) {
        veritabaninaBaglan("a"); //2 haneden küçük bağlantı yapmayacak.
        veritabaninaBaglan("abc123");
        veritabaninaBaglan("abc1234");
        veritabaninaBaglan("abc123");
        veritabaninaBaglan("abc123");
        veritabaninaBaglan("abc123");
        veritabaninaBaglan("abc123");

        int sayi1 = topla(5,5);
        System.out.println(sayi1);


        int sayi2 = topla(10,20);
        System.out.println(sayi2+50);
    }
    //erişim_belirleyici static dönüş_tipi fonksiyonAdı() {}
    public static void veritabaninaBaglan (String veritabaniAdi) {
        //Eğer veritabanı adı 2 haneden küçükse bağlanmaya çalışma
        if (veritabaniAdi.length()<=2) //ife scope vermeme sebebimiz ifte veya else de tek satırlık scope varsa vermek zorunda değiliz.
            return; //fonksiyonu bitirir.
        System.out.println(veritabaniAdi + " Veritabanı bağlantısı. x15");
    }
    public static int topla(int a, int b) {
        System.out.println(a + b);
        return a + b;
        //dönüş tipini void(boş) yapmazsan return ile bir değer döndürmek zorundasın.
        //void de de kullanılabilir.
    }
}
