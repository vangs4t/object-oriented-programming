package com.java.oop.data;

public class Static {
    /**
     * Untuk penggunaan static itu biasanya bisa digunakan tanpa perlu membuat object nya terlebih dahulu
     */
    public static String listrik;
    public static String tegangan;
    public static Integer angsuran;

    /**
     * Penggunaan static method juga sama kita bisa memangil method tersebut tanpa perlu
     * membuat object nya terlebih dahulu
     * @param angsuranDesa
     */
    public static void diDesa(Integer angsuranDesa){
        if (angsuranDesa <= angsuran){
            tegangan = "20A";
            System.out.println(tegangan);
        }
    }
    public void diKota(Integer angsuranKota){
        if (angsuranKota >= angsuran){
            tegangan = "40A";
            System.out.println(tegangan);
        }
    }

    /**
     * Penggunaan static block yaitu akan di panggil pertamakali saat class ini digunakan
     */
    static {
        System.out.println("Listrik Milik Bersama");
    }
}
