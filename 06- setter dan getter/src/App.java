class ling {
    private double diameter;

    public ling(double diameter) {
        this.diameter = diameter;

    }

    // membuat method setter untuk mengubah nilai diameter
    public void setDiameter(double diameter) {
        this.diameter = diameter;

    }

    // membuat method getter untuk mendapatkan nilai jari2
    public double getjari2() {
        return this.diameter / 2;

    }

    // membuat method getter untuk menghitung luas lingkaran
    public double getHitungLuas() {
        return 3.14 * getjari2() * getjari2();
    }

    // membuat method getter untuk menghitung keliling lingkaran
    public double getKeliling() {
        return 2 * 3.14 * getjari2();

    }

    public void display() {
        System.out.println("Jari - Jari : " + getjari2());
        System.out.println("Luas Lingkaran: " + getHitungLuas());
        System.out.println("Keliling Lingkaran : " + getKeliling());

    }
}

public class App {
    public static void main(String[] args) throws Exception {
        ling lingkaran1 = new ling(45.5);

        lingkaran1.display();
        lingkaran1.setDiameter(25.);
        lingkaran1.display();

        System.out.println("Hello, World!");
    }
}
