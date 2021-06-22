package com.testinium.atmodev.musteriler;

public class BireyselMusteri extends Musteri {
    private String evAdresi;


    public BireyselMusteri(String tcNo, String adSoyad, float bakiye, String musteriNo, String evAdresi) {
        super(tcNo, adSoyad, bakiye, musteriNo);
        this.evAdresi = evAdresi;

    }

    public String getEvAdresi() {
        return evAdresi;
    }


    @Override
    public void bilgileriYazdir() {
        super.bilgileriYazdir();
        System.out.println("Ev adresi" + getEvAdresi());

    }
}
