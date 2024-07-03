public class Main {
    public static void main(String[] args) {

        // Nah untuk memanggil class lain kalian harus membuat object nya terlebih dahulu
        //dan ada juga berbagai macam cara pemanggilan

        /**
         * Untuk penggunan Constructor kalian bisa menggunakan nya saat object dari class tersebut dibuat
         */

        var laptop = new Computers();
        laptop.casing = "Acer"; // Kalian juga bisa mengatur value dari sebuah field dengan memanggil object yang sudah di buat
                                // dengan menambahkan tanda '.' titik lalu tinggal tulis aja nama variable nya

        laptop.motherboard = "Amd intels";
        System.out.println(laptop.casing);
        System.out.println(laptop.motherboard);
        laptop.racing();


        Computers smartphone = new Computers("Smasnug", "Exynos");
        System.out.println(smartphone.casing);
        System.out.println(smartphone.motherboard);


        Computers pc;
        pc = new Computers("Politron");
        System.out.println(pc.casing);


    }
}
