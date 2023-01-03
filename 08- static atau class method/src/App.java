import java.util.ArrayList;

class player{
    private static int numberOFPlayer;
    private static ArrayList<String>namaList = new ArrayList<String>();

    private String name;

    //membuat konstruktor 
    player(String name){
        this.name = name ;
        player.numberOFPlayer++;
        player.namaList.add(this.name);
        
    }

    void show(){
        System.out.println("player Name : " + this.name);

        }
    static void shownumberOFPlayer(){
        System.out.println("jumlah pemain : " + player.numberOFPlayer);
    }


    static ArrayList<String> getNames(){
        return player.namaList;
    }
        
    
    
}

public class App {
    public static void main(String[] args) throws Exception {
        
        //instansiasi atau penciptaan objek
        player player1 = new player("messi");
        player player2 = new player("Mbappe");
        player player3 = new player("neymar");
        player player4 = new player("Ronaldo");

        player.shownumberOFPlayer();
        System.out.println("Nama pemain : "  + player.getNames());


    

       
    }
}
