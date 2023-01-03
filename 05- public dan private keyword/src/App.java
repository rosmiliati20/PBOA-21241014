class player { // keyword defult, bisa dibaca dan ditulis oleh class lain
    public String nama; // keyword public, bisa dibaca dan ditulis oleh class yang lain
    private double power; // keyword private, hanya bisa dibaca dan ditulis oleh classnya saja

    player(String nama, double power) {
        this.nama = nama;
        this.power = power;

    }

    void display() {
        System.out.println("Nama player : " + this.nama);
        System.out.println("power:" + this.power);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // instansiasi atau membuat objek
        player player1 = new player("messi", 95.5);

        System.out.println("player1.nama");
        System.out.println("player1.power");

    }
}
