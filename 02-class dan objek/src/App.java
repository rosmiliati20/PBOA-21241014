class Mahasiswa {
    String nama;
    String NIM;
    String Prodi;
    String Fakultas;
    double IPK;

}

public class App {
    public static void main(String[] args) throws Exception {

        Mahasiswa MHS = new Mahasiswa();

        MHS.nama = "Sunarti";
        MHS.NIM = "20201213";
        MHS.Prodi = "PTI";
        MHS.Fakultas = "FSTT";
        MHS.IPK = 3.67;

        System.out.println(MHS.nama);
        System.out.println(MHS.NIM);
        System.out.println(MHS.Prodi);
        System.out.println(MHS.Fakultas);
        System.out.println(MHS.IPK);

        Mahasiswa mhs2 = new Mahasiswa();

        mhs2.nama = "Mily";
        mhs2.NIM = "21241014";
        mhs2.Prodi = "PTI";
        mhs2.Fakultas = "FSTT";
        mhs2.IPK = 3.36;

        System.out.println(mhs2.nama);
        System.out.println(mhs2.NIM);
        System.out.println(mhs2.Prodi);
        System.out.println(mhs2.Fakultas);
        System.out.println(mhs2.IPK);

    }
}
