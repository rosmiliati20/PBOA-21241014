class keliling {
    private double nilaiR;
    private double nilaiPhi = 3.14;
    private double luasLingkaran;
    private double kelilingLingkaran;

    public void setNilaiR(double nilaiR) {
        this.nilaiR = nilaiR;
    }

    public double getNilaiR() {
        return nilaiR;
    }

    public void hitungLuasDanKeliling() {
        this.luasLingkaran = nilaiR * nilaiR * nilaiR;
        this.kelilingLingkaran = 2 * nilaiPhi * nilaiR;

        System.out.println("Luas lingkaran : " + luasLingkaran);
        System.out.println("keliling lingkaran : " + kelilingLingkaran);
    }
}

class main {
    public static void main(String[] args) throws Exception {
        keliling keliling = new keliling();
        keliling.setNilaiR( 20.0);
        System.out.println(keliling.getNilaiR());
        keliling.hitungLuasDanKeliling();
    }
}

