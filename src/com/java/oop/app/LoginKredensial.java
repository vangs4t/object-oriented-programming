package com.java.oop.app;

import com.java.oop.data.UserLogin;
import com.java.oop.error.CredentialExeption;
import com.java.oop.util.LoginCredential;

import java.io.*;

public class LoginKredensial {
    /**
     * Jadi exception digunakan untuk memberitahu user kalau saat login ada yang eror maka akan diberitahu bahwa aplikasi tersebut error
     * dan program akan di hentikan sementara
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) {
        UserLogin login = new UserLogin();
        login.setUsername("Naufal");
        login.setPassword("Abdul");
        new LoginCredential().generalFramework(login);
    }
    public static void throwableException(){
        try{
            new LoginCredential().logCredential();
            System.out.println("Login Sukses");
        } catch (CredentialExeption exeption){
            System.out.println("Gagal login : " + exeption);
        }
    }

    public static void systemEror(){
        new LoginCredential().AsystemError();
    }

    public static void runtimeException(){
        /**
         * Sebernarnua tidak papa tanpa melakukan try catch
         * namun kebanyakan pengguna java akan selalu melakukan try catch
         * mau exception yang throwable maupun runtime
         */
        try{
            new LoginCredential().illegalLogin();
            System.out.println("Login succes");
        } catch (IllegalArgumentException exception){
            System.out.println("Percobaan gagal : "+ exception);
        } catch (NullPointerException exception){
            System.out.println("Input gagal : " + exception);
        }
    }

    public void readmeMd(){
        try (Reader reader = new FileReader("README.md")){

        } catch (IllegalArgumentException | FileNotFoundException e){
            System.out.println("Gak boleh gitu dong " + e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
