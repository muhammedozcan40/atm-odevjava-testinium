package com.testinium.atmodev.musteriler;

public class KurumsalMusteri extends Musteri {
    private String sirketAdi;


    public KurumsalMusteri(String tcNo, String adSoyad, float bakiye, String musteriNo, String sirketAdi) {
        super(tcNo, adSoyad, bakiye, musteriNo);
        this.sirketAdi = sirketAdi;
    }

    public String getSirketAdi() {
        return sirketAdi;
    }


    @Override
    public void bilgileriYazdir() {
        super.bilgileriYazdir();
        System.out.println("Sirket adi:"+ getSirketAdi());
    }
}
