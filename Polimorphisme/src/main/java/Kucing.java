
public class Kucing extends Hewan implements Makanan {
    public Kucing(String nama){
        super(nama);
    }
     @Override
     public void bersuara(){
         System.out.println("MEOWWWWW!!!!!!!!!");
     }
     
     @Override
     public void konsumsi(){
         System.out.println(getnama()+" makan royal canin");
     }
}
