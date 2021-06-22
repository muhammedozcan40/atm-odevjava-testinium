package com.testinium.atmodev.musteriler;

import java.util.HashMap;

public class Musteriler {

    public static Musteri bireyselMusteri1() {
        return new BireyselMusteri("25889171214", "Muhammed Ali Ozcan", 1500.0f, "100001", "Aşıkpaşa Mahallesi");
    }

    public static Musteri bireyselMusteri2() {
        return new BireyselMusteri("23439328383", "Resul Güzel", 300.3f, "100002", "Cacabey Mahallesi");
    }

    public static Musteri kurumsalMusteri1() {
        return new KurumsalMusteri("35229321234", "Elon Musk", 750.5f, "100003", "Tesla");
    }

    public static Musteri kurumsalMusteri2() {
        return new KurumsalMusteri("35423321287", "Feyza Yağmur", 3750.5f, "100004", "Bahçeşehir Üniversitesi");
    }

    public static Musteri kurumsalMusteri3() {
        return new KurumsalMusteri("4329321235", "Rahmi Koç", 1750.5f, "100005", "Koç Holding");
    }

    public static HashMap<String, Musteri> musteriListesi() {
        HashMap<String, Musteri> musteriHashMap = new HashMap<String,Musteri>();
        musteriHashMap.put(Musteriler.bireyselMusteri1().getMusteriNo(), Musteriler.bireyselMusteri1());
        musteriHashMap.put(Musteriler.bireyselMusteri2().getMusteriNo(), Musteriler.bireyselMusteri2());
        musteriHashMap.put(Musteriler.kurumsalMusteri1().getMusteriNo(), Musteriler.kurumsalMusteri1());
        musteriHashMap.put(Musteriler.kurumsalMusteri2().getMusteriNo(), Musteriler.kurumsalMusteri2());
        musteriHashMap.put(Musteriler.kurumsalMusteri3().getMusteriNo(), Musteriler.kurumsalMusteri3());
        return musteriHashMap;
    }

}
