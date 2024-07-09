package com.java.oop.data;

public class Castle {
    /**
     * Disini kita akan membuat pewarisan, pewarisan bisa membuat class child yang kita buat
     * bisa menggunakan method apapun dari class parent
     * class parent bisa memiliki banyak child, namun tidak sebaliknya class child hanya bisa memiliki satu parent
     */
    public String king;
    public String army;
//    Integer armyQuantity;

    public Castle(String elfKing, String elfArmy){
        this.king = elfKing;
        this.army = elfArmy;
    }

    public void mainCastle(){
        System.out.println("My Highness " + king + " king of Englads, We have " + army + " ready for wars");
    }

    /**
     * Innerclass adalah membuat class di dalam class
     * innerclass juga bisa menggunaakn hampir semua isi kode di dalam parent nya
     */
    public static class Barrack {
        public String prajurit;
        public void printOut(){

        }
    }

}
