class pegawai {
    String Nama;
    String Jabatan;
    double Pajak;
    double gajipokok;
    double gajibersi;

    public pegawai(String InputNama, String Inputjabatan, double Inputpajak) {
        Nama = InputNama;
        Jabatan = Inputjabatan;
        Pajak = InputPajak;
    }

    public void setgajipokok(double gajipokok) {
        this.gajiPokok = gajipokok;
    }
    public double getgajiPokok() {
        return gajiPokok;
    }

    public void display() {
        System.out.println("Nama : " + this.Nama);
        System.out.println("jabatan : " + this.jabatan);
        system.out.println("Gaji bersih " + gajiBersih);
    }
    public static void main(String[] args) {




    
}
