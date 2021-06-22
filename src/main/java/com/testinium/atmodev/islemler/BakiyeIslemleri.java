package com.testinium.atmodev.islemler;

import com.testinium.atmodev.musteriler.Musteri;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BakiyeIslemleri {


    static Scanner scanner = new Scanner(System.in);

    public static float bakiyeGir(Musteri musteri) {
        while (true) {
            try
            {
                return scanner.nextFloat();

            }
            catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Lütfen bir sayı giriniz");
            }
        }

    }

    public static void paraYatir(Musteri musteri) {

        System.out.println("Yatırmak istediğiniz tutarı giriniz:");
        float artirilacakBakiye = bakiyeGir(musteri);
        float bakiye = musteri.getBakiye();
        if (artirilacakBakiye < 0) {
            System.out.println("Lütfen pozitif bir değer giriniz.");
        } else {
            musteri.setBakiye(bakiye + artirilacakBakiye);
        }
        System.out.println("Güncel Bakiyeniz : " + musteri.getBakiye());
    }

    public static void paraCek(Musteri musteri) {
        System.out.println("Çekmek istediğiniz tutarı giriniz : ");
        float azaltilacakBakiye = bakiyeGir(musteri);
        float bakiye = musteri.getBakiye();

        if (azaltilacakBakiye < 0) {
            System.out.println("NEGATİF BAKİYE GİREMEZSİNİZ!");
        } else if (azaltilacakBakiye > bakiye) {
            System.out.println("Hesabınızda olmayan miktarda parayı çekemezsiniz!");
        } else {
            musteri.setBakiye(bakiye - azaltilacakBakiye);
        }
        System.out.println("Bakiyeniz: " + musteri.getBakiye());


    }

    public static void islemGerceklestir(Musteri musteri) {
        System.out.println("İşleminizi secin:\n" + "Para Yatırma için 1\n" + "Para Çekme için 2 \n");
        String islemNo = scanner.nextLine();

        switch (islemNo) {
            case "1":
                BakiyeIslemleri.paraYatir(musteri);
                scanner.nextLine();
                break;

            case "2":
                BakiyeIslemleri.paraCek(musteri);
                scanner.nextLine();
                break;
            default:
                System.out.println("Hatalı işlem yaptınız");
                scanner.nextLine();
                break;
        }
        sonrakiislem(musteri);

    }

    private static void sonrakiislem(Musteri musteri) {
        System.out.println("Lütfen çıkış yapmak için Q tuşuna basınız \n" +
                "Ana menüye dönmek için lütfen  M yi tuşlayınız\n");
        String islem = scanner.nextLine();
        switch (islem) {
            case "Q": case "q":
                System.out.println("İyi Günler Dileriz :" + musteri.getAdSoyad());
                break;

            case "M": case "m":
                System.out.println("Ana Menüye Yönlendiriliyorsunuz Sn." + musteri.getAdSoyad());
                islemGerceklestir(musteri);

            default:
                System.out.println("Hatalı Tuşlama Yaptınız.");
                sonrakiislem(musteri);
                break;

        }

    }
}



