package com.java.oop.app;
import com.java.oop.data.*;
public class CastleGames {
    public static void main(String[] args) {
        Castle castle = new Castle("Arthurs", "Assasins");
        castle.mainCastle();

        OrcCastle orc = new OrcCastle("Galdar");
        orc.king = "Galdar"; // bisa kita liat disini class orcCastle bisa menggunakan bahkan field yang ada di class castle
        orc.army = "Hellasshd";

        orc.mainCastle(); // bisa juga menggunakan method yang ada di class castle

        Castle.Barrack tempur = new Castle.Barrack(){
            public static String hasilUlangan(){
                return "Ini adalah anonymouseClass kita tak perlu membuat class nya terlebih dahulu dan hanya perlu \n mengimplementasikan class anonymous setelah object nya di buat \nDan untuk memanggil class anonymous kita harus membuat method di superclas nya terlebih dahulu";
            }
            public void printOut(){
                System.out.println(hasilUlangan());
            }
        };
        System.out.println(tempur.prajurit = "Galgora");
        tempur.printOut();


    }
}
