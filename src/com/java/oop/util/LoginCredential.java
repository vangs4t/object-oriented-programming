package com.java.oop.util;

import com.java.oop.anotation.NotBlank;
import com.java.oop.data.UserLogin;
import com.java.oop.error.CredentialExeption;
import com.java.oop.error.FatalErrorException;

import java.lang.reflect.Field;

public class LoginCredential {
    /**
     * Ini merupakan jenis exception yang mewarisi class throwable
     * @throws CredentialExeption
     */
    public static UserLogin login = new UserLogin("Kanjut", "Admin#1234");

    public void logCredential() throws CredentialExeption {

        if (login.getUsername() == null){
            throw new NullPointerException("Username tidak boleh null");
        } else if (login.getUsername().isBlank()) {
            throw new CredentialExeption("Username tidak boleh blank");
        } else if (login.getPassword() == null){
            throw new NullPointerException("Password tidak boleh null");
        } else if (login.getPassword().isBlank()) {
            throw new CredentialExeption("Password tidak boleh blank");
        }
    }

    /**
     * Untuk exception Runtime itu tidak diharus kan melakuakn
     * throws pada header method sebenarnya
     */

    public void illegalLogin(){

        if (login.getUsername() == null){
            throw new NullPointerException("Username tidak boleh null");
        } else if (login.getUsername().isBlank()) {
            throw new IllegalArgumentException("Username tidak boleh blank");
        } else if (login.getPassword() == null){
            throw new NullPointerException("Password tidak boleh null");
        } else if (login.getPassword().isBlank()) {
            throw new IllegalArgumentException("Password tidak boleh blank");
        }

    }
    /**
     * untuk penggunaan error itu tidak perlu memanggil try catch dll
     * karena ini di gunaan jika ada system yang error banget maka aplikasi sebaiknya dihentikan
     */
    public static void AsystemError(){
        if (login.getUsername().equals("Kanjut")){
            throw new FatalErrorException("Hacker menjauh");
        }
    }

    /**
     * Penggunaan stack trace digunakan agar memudahkan kita melakukan
     * debugging pada suatu program
     */
    public void stackTraceUseable(){
        String[] asepSedunia = {
                "asepSandi","asepYamsik","asepAwirawir"
        };

        System.out.println(asepSedunia[100]);
    }

    public void generalFramework(Object object){
        Class aClass = object.getClass();
        Field[] fields = object.getClass().getDeclaredFields();

        for (var fild : fields){
            fild.setAccessible(true);

            if (fild.getAnnotation(NotBlank.class) != null){
                try{
                    String value = (String) fild.get(object);

                    if (value == null || value.isBlank()){
                        throw new IllegalArgumentException("Field " + fild.getName() + " is blank");
                    }
                } catch (IllegalAccessException e){
                    System.out.println("Tidak bisa mengakses field" + fild.getName());
                }
            }

        }
    }


}





















