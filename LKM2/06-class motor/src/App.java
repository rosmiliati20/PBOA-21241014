class MOTOR{
    String merk;
    int tahun;
    String noPolisi;
    String warna;

    MOTOR(String merk,int tahun, String noPolisi, String warna){
        this.merk=merk;
        this.tahun=tahun;
        this.noPolisi=noPolisi;
        this.warna=warna;
        
    }
    void showInfoMotor(){
        System.out.println("Merk : "+this.merk);
        System.out.println("Tahun : "+this.tahun);
        System.out.println("No Polisi: "+this.noPolisi);
        System.out.println("Warna : "+this.warna);
    }
}


 class Motorku {
    public static void main(String[] args) {
        MOTOR motorku = new MOTOR ("Honda Beat Stret",2020, "EA, 2356 NM", "SILVER");
        motorku.showInfoMotor();
    
    }
}
