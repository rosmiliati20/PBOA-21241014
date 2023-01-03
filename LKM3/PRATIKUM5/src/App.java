class identitas {
    private String universitas = "Universitas Pendidikan Mandalika";
    private String jurusan = "Pendidikan Teknologi Informasi";
    private String name;
    private String nim;

    // konsrtuktor
    public identitas(String nama, String nim) {
        this.name = nama;
        this.nim = nim;
    }

    // method
    public void info() {
        System.out.println("Perguruan Tinggi : " + universitas);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Nama : " + name);
        System.out.println("Nim : " + nim);
    }
}

// klass extends
class Keterangan extends identitas {
    protected String angkatan;
    protected String alamat;

    // konstruktor
    public Keterangan(String nama, String nim, String angkatan, String alamat) {
        super(nama, nim);
        this.angkatan = angkatan;
        this.alamat = alamat;
    }

    // method
    public void info() {
        super.info();
        System.out.println("Angkatan : " + angkatan);
        System.out.println("Alamat : " + alamat);
    }
}

// main class
class ConstruktorSuperKlass {
    public static void main(String[] args) {
        Keterangan mahasiswa = new Keterangan("Al Fatih", "24851453", "Tahun 1453", "Istanbul/Konstationopel");
        mahasiswa.info();
    }
}
