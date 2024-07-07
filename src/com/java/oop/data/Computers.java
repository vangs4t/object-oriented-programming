package com.java.oop.data;

/**
 * Ini merupakan class atau blue print untuk membuat, menjalankan, menulis kode dan sebagian nya
 * untuk mengimplementasikan sebuah class, nama class dengan nama file nya harus sama
 * kalian juga bisa membuat method apa saja di dalam sebuah class
 */

public class Computers {

    /**
     * nah di bawah class di dalam block kalian juga bisa membuat field
     * field juga bisa di panggil di main method
     */

    private String firmware;
    private String motherboard;
    private Integer ssd;


    /**
     * Getter dan setter digunakan untuk mendapatkan field dengan cara lebih aman agar tidak sembarang  orang bisa
     * mengubah index dari field tersebut
     * @return
     */

    public Integer getSsd() {
        return ssd;
    }

    public void setSsd(Integer ssd) {
        this.ssd = ssd;
    }

    public String getCasing() {
        return firmware;
    }

    public void setCasing(String firmware) {
        this.firmware = firmware;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    /**
     * Constructor merupakan method yang dipanggil pertamakali saat method itu di implementasikan
     * untuk membuat constructor kalian cukup membuat method dari nama class tersebut
     * constructor tidak menggunakan fungsi static maupun void
     * constructor juga bisa melakukan overloading atau membuat duplikat namun parameternya harus berbeda2
     * kalian juga bisa memanggil constructor lain dengan kata kunci this
     */

    public Computers(String iniCasing, String iniMotherboard){
        firmware = iniCasing;
        motherboard = iniMotherboard;
    }

    public Computers(String iniCasing){

        this(iniCasing, null); // ini merupakan kata kunci this untuk memanggil constructor yang lain
        this.racing(); // ini merupakan kata kunci untuk memanggil method yang ada di class ini
        this.firmware = iniCasing; // this juga bisa di gunakan untuk memanggil field

    }

    public Computers(){
    }

    public void racing(){
        System.out.println(firmware);
        System.out.println(motherboard);
    }
}
