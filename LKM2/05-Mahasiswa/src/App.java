class Mahasiswa {
    String nama;
    int angkatan;
    String asal;

Mahasiswa(){
    nama = "Sunarti";
    angkatan = 2020;
    asal =  "Mataram";
}  
void ubah(String nm, int ak, String as) {
    nama = nm;
    angkatan = ak;
    asal = as;
}
void cetak(){
    System.out.println("nama : "+nama);
    System.out.println("angkatan : "+angkatan);
    System.out.println("asal : "+asal);
}
}




class TestMahasiswa {
    public static void main(String[] args) throws Exception {
        Mahasiswa MHS = new Mahasiswa();
        System.out.println("IDENTITAS AWAL :");
        MHS.cetak();

        MHS.ubah("Mili", 2021, "Bima");
        System.out.println("\nIDENTITTAS AKHIR ");
        MHS.cetak();

    }
}
