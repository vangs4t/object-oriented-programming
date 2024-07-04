public class CastleGames {
    public static void main(String[] args) {
        Castle castle = new Castle("Arthurs", "Assasins");
        castle.mainCastle();

        OrcCastle orc = new OrcCastle("Galdar");
        orc.king = "Galdar"; // bisa kita liat disini class orcCastle bisa menggunakan bahkan field yang ada di class castle
        orc.army = "Hellasshd";

        orc.mainCastle(); // bisa juga menggunakan method yang ada di class castle

    }
}
