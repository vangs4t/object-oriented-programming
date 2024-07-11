package com.java.oop.app;

import com.java.oop.anotation.Fancy;
import com.java.oop.data.Local;
@Fancy("Kanjut")
public class MerkRokok {
    public static void main(String[] args) {
        Local local = new Local("Sendang biru");
        System.out.println(local.price());
    }
}
