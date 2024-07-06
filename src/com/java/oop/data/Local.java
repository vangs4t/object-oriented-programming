package com.java.oop.data;

public class Local extends Rokok{
    public Local (String merek){
        super.merk = merek;
    }
    @Override
    public Integer price() {
        super.merk = "Sendang Biru";
        return 16000;
    }
    /**
     * Getter dan setter digunakan untuk mendapatkan field agar dapat dengan mudah mengubah isi field tersebut
     * dan juga untuk menjaga keamanan field agar tida bisa di ubah sesukanya dengan orang lain
     */

    /**
     * Inteface digunakan untuk membuat kontrak turunan, meskipun abstract class juga bisa melakukan hal yang sama
     * namun di anjurkan menggunakan interface karena penulisan kode nya lebih mudah dan maintenance lebih mudah juga
     * interface juga bisa di wariskan, dan hanya bisa ke interface lagi
     * namun akan tetapi tetap saja class yang mengimplement interface tersebut juga harus meng override interface yang id warisi
     *
     * di interface juga bisa menggunakan default method dan menambahkan fungsi di dalam method tersebut
     * artinya default method itu bisa di gunakan class yang meng implement, bisa juga tidak
     */

    /**
     * to string digunakan untuk mengubah object dari suatu class menjadi string
     * equals itu digunakan untuk mengecek apakah object nya sama atau tidak
     * bukan seperti kata kunci "==" yang hanya mengecek apakah object tersebut ada di dalam memori yang sama atau tidak
     * hashCode digunakan untuk
     */
}








