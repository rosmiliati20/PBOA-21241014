class Display{
    private String nama;
    static String type = "layar";
    
    //membuat konstruktor
    Display(String nama){
        this.nama = nama;
    }

    void DisplayType(String type){
        Display.type = type;
    }

    void show(){
        System.out.println("Nama Display : " + this.nama);
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        
        //instansiasi atau pencipatan objek baru
        Display tampilan1 = new Display("monitor");
        Display tampilan2 = new Display("smartphone");

        tampilan1.show();
        tampilan2.show();

        //mengakss variable static
        System.out.println(tampilan1.type);
        System.out.println(tampilan2.type);
        System.out.println(Display.type); //paling disarankan

        //memanggil method setter
        Display.type = "videotrone";
        System.out.println(Display.type);

        Display.type = "laptop";
        System.out.println(Display.type);

    
    }
}
