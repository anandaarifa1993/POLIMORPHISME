
public class Anjing extends Hewan implements Makanan {
    public Anjing(String nama){
        super(nama);
    }
    
    @Override
    public void bersuara(){
        System.out.println("GUK-GUK-GUK!!!!!!!!!!!");
    }
    @Override
    public void konsumsi(){
        System.out.println(getnama()+" makan daginggggg");
    }
}
