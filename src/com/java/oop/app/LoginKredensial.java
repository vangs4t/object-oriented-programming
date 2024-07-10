package com.java.oop.app;

import com.java.oop.data.UserLogin;

public class LoginKredensial {
    /**
     * Jadi exception digunakan untuk memberitahu user kalau saat login ada yang eror maka akan diberitahu bahwa aplikasi tersebut error
     * dan program akan di hentikan sementara
     * @param args
     * @throws Exception
     */
    public static UserLogin login = new UserLogin(null,null);
    public static void main(String[] args) {
//        if (login.getUsername() == null || login.getUsername() == null){
//            throw new NullPointerException();
//        } else if (login.getUsername().isBlank() || login.getPassword().isBlank()) {
//            throw new IllegalArgumentException();
//        }

        testLogin();
    }
    public static void testLogin(){
        try {
            login.getUsername().isEmpty();
        } catch (IllegalArgumentException e){
            System.out.println("Username jangan kosong " + e);
        } catch (NullPointerException e){
            System.out.println("Password jangan kosong" + e);
        }
    }
}
