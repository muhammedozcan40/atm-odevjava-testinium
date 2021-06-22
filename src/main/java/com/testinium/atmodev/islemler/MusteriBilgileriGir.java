package com.testinium.atmodev.islemler;

import com.testinium.atmodev.musteriler.Musteriler;

import java.util.Scanner;

public class MusteriBilgileriGir {
    static Scanner scanner = new Scanner(System.in);

    public static String musteriNoGir() {

            String musteriNo;
            while (true) {
                musteriNo = scanner.nextLine();
                if (Musteriler.musteriListesi().containsKey(musteriNo)) {
                    Musteriler.musteriListesi().get(musteriNo).bilgileriYazdir();

                    break;
                } else {
                    System.out.println("Müşteri bulunamadı.\n Lütfen Tekrar Deneyiniz");

                }

            }
            return musteriNo;
        }
        }








