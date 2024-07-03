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

    String casing;
    String motherboard;

    /**
     * Constructor merupakan method yang dipanggil pertamakali saat method itu di implementasikan
     * untuk membuat constructor kalian cukup membuat method dari nama class tersebut
     * constructor tidak menggunakan fungsi static maupun void
     * constructor juga bisa melakukan overriding atau membuat duplikat namun parameternya harus berbeda2
     * kalian juga bisa memanggil constructor lain dengan kata kunci this
     */

    Computers(String iniCasing, String iniMotherboard){
        casing = iniCasing;
        motherboard = iniMotherboard;
    }

    Computers(String iniCasing){

        this(iniCasing, null); // ini merupakan kata kunci this untuk memanggil constructor yang lain
        this.racing(); // ini merupakan kata kunci untuk memanggil method yang ada di class ini
        this.casing = iniCasing; // this juga bisa di gunakan untuk memanggil field

    }

    Computers(){
    }

    public void racing(){
        System.out.println(casing);
        System.out.println(motherboard);
    }
}
