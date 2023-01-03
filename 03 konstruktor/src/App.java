class Mahasiswa {
    String Nama;
    String NIM;
    String Prodi;
    String Fakultas;
    double IPK;

    Mahasiswa(String Inputnama, String InputNIM, String Inputprodi, String Inputfakultas, Double InputIPK) {

        Nama = Inputnama;
        NIM = InputNIM;
        Prodi = Inputprodi;
        Fakultas = Inputfakultas;
        IPK = InputIPK;

        System.out.println(Nama);
        System.out.println(NIM);
        System.out.println(Prodi);
        System.out.println(Fakultas);
        System.out.println(NIM);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa MHS = new Mahasiswa("Mili", "21241014", "PTI", "FSTT", 3.36);
    }
}
