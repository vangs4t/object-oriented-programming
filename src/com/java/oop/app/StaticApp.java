package com.java.oop.app;
/**
 * Kita juga bisa menambahkan static pada saat akan mengimport class static
 * agar kita bisa memanggil object yang ada di class itu tanpa perlu mewarisi dan membuat object static nya
 * terlebih dahulu tapi itu juga harus di tambahkan tanda bintang setelah nama class
 * contoh Static.*
 */

import com.java.oop.data.Static;

import static com.java.oop.data.Static.*;

public class StaticApp{
    public static void main(String[] args) {
        Static st = new Static();
        angsuran = 13000;
        diDesa(12000);
        st.diKota(13000);
        System.out.println(listrik = "PLN");
    }
}
