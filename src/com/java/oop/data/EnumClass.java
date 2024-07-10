package com.java.oop.data;

/**
 * Enum Class digunakan untuk membuat inisialisasi yang cukup sedernaha atau simple seperti
 * Gender male or female atau tingkatan membership standard premium atau vip
 * daripada menggunakan operasi string lebih baik menggunakan class enum
 * Enum Class juga tidak bisa di buat object nya secara langsung
 * Jadi Secara simple nya cara penggunaan enum class dibuat kan fieldnya terlebih dahulu
 */
public enum EnumClass {
    STANDARD("Untuk player free to play"),
    PREMIUM("Untuk player dengan vip 3"),
    VIP("Untuk Player dengan vip 12");

    String info;

    EnumClass(String info){
        this.info = info;
    }

    public String getInfo(){
        return info;
    }
}
