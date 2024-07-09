package com.java.oop.data;

/**
 * Jadi Penggunaan kata kunci final itu agar sebuah object atau class menjadi immutable
 * untuk penggunaan final class agar class itu tidak bisa di wariskan lagi
 * sedangkan untuk field setelah menggunakan kata kunci final
 * dan kita mengisi field tersebut dengan suatu index, maka field tersebut tidak bisa di ubah lagi dan juga
 * jika kita menambahkan final di field maka harus langusng di inisialisasikan
 *
 */
public final class ProductElektronik {
    public final String marketplace = "Lazada";
    public final String seller = "Asus Store";
    public final Integer totalProduct = 223;


    public ProductElektronik(String marketplace){
        if (marketplace != this.marketplace){
            System.out.println("Salah sponsor woi");
        }
    }


}




















