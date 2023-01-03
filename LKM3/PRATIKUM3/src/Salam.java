public class Salam {
    String slm = "Assalamuaikum...";

    public void info1() {
        System.out.println(slm);
    }
}

class PanggilanSalam extends Salam {
    String salamku = "Salam Sejahtera Untuk Kita Semua";

    public void info2() {
        System.out.println(salamku);
    }

    public static void main(String[] args) {
        PanggilanSalam obj = new PanggilanSalam();
        obj.info1();
        obj.info2();
    }
}