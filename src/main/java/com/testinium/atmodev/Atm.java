package com.testinium.atmodev;

import com.testinium.atmodev.islemler.BakiyeIslemleri;
import com.testinium.atmodev.islemler.MusteriBilgileriGir;
import com.testinium.atmodev.musteriler.Musteriler;

public class Atm {

    // TODO: 22.06.2021  Bu uygulamada oluşturulan müşteri numaraları 100001,100002,100003,10004,10005 şeklindedir
    // TODO: 22.06.2021   Virgüllü bakiye girilebilir.
     

    public static void main(String[] args) {
        try {
            
            System.out.println("Ozcan Bank'a hoşgeldiniz...\n Lütfen müşteri numarası giriniz");
            String musteriNo = MusteriBilgileriGir.musteriNoGir();
            BakiyeIslemleri.islemGerceklestir(Musteriler.musteriListesi().get(musteriNo));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
