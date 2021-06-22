package com.testinium.atmodev.musteriler;

public class Musteri {
    private String tcNo;
    private String adSoyad;
    private float bakiye;
    private String musteriNo;


    public Musteri(String tcNo, String adSoyad, float bakiye, String musteriNo) {
        this.tcNo = tcNo;
        this.adSoyad = adSoyad;
        this.bakiye = bakiye;
        this.musteriNo = musteriNo;
    }

    public String getTcNo() {
        return tcNo;
    }


    public String getAdSoyad() {
        return adSoyad;
    }


    public float getBakiye() {
        return bakiye;
    }

    public void setBakiye(float bakiye) {
        this.bakiye = bakiye;
    }

    public String getMusteriNo() {
        return musteriNo;
    }


    public void bilgileriYazdir() {
        System.out.println("TC Kimlik No" + getTcNo() + "\n"
                + "Ad Soyad" + getAdSoyad() + "\n" +
                "Bakiye:" + getBakiye() + "\n" +
                "Musteri No" + getMusteriNo() + "\n")
        ;
    }
}
