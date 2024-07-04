class Castle {
    /**
     * Disini kita akan membuat pewarisan, pewarisan bisa membuat class child yang kita buat
     * bisa menggunakan method apapun dari class parent
     * class parent bisa memiliki banyak child, namun tidak sebaliknya class child hanya bisa memiliki satu parent
     */
    String king;
    String army;
//    Integer armyQuantity;

    Castle(String engladKing, String englandArmy){
        this.king = engladKing;
        this.army = englandArmy;
    }

    void mainCastle(){
        System.out.println("My Highness " + king + " king of Englads, We have " + army + " ready for wars");
    }

}
