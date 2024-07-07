package com.java.oop.app;

import com.java.oop.data.Laptop;
import com.java.oop.data.Smartphone;

public class Tech {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        /*
        Jadi disini kita hanya perlu memanggil method set untuk mengubah field yang akan di ubah
         */
        laptop.setChipset("Intel I5 Gen 8");
        laptop.setFirmware("Windows 10");

        /*
        Dan juga memanggil method get untuk mendapatkan field tersebut
        getter dan setter juga menjadi hal yang lumrah atau umum digunakan para programmer java
         */
//        System.out.println(laptop.getChipset());
//        System.out.println(laptop.getFirmware());

        Smartphone hp = new Smartphone();
        hp.setBrand("Smasnug");
        hp.setFirmware("One UI 6.0");
        hp.setChipset("Exynos 1301");
        hp.setRilis("2023");
        hp.setSsd(128);

        hp.spesifikasi();

        System.out.println(hp.jamanNow());
        if (hp.equals(laptop)){
            System.out.println("sama");
        } else {
            System.out.println("beda");
        }
    }
}
