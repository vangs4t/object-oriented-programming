public class OrcCastle extends Castle{ /* Gunakan kata kunci extend untuk mewariskan class */
    OrcCastle(String orcKing){
        super(orcKing,null);
    }
    /**
     * Meskipun disini belum membuat method apapun mari kita coba implementasikan
     * nah disini kita juga bisa membuat ulang method yang ada di parent class untuk
     * mengubah isi method sesuai yang kita inginkan, namun jika kita membuat ulang method yang ada di parent class
     * kita tidak bisa lagi menggunakan method yang ada di parent melalui class child
     * kecuali kita menggunakan kata kunci "super"
     */
    void mainCastle(){
        System.out.println("My Highness " + king + " of abbyss, We Have " + army + " ready for wars");
    }

//    void enemyMainCastle(){
//        super.mainCastle(); // dengan menggunakan kata kunci super kita bisa memanggil method
//                            // yang sudah ter override di class child
//    }
}
