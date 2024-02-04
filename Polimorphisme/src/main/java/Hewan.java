
public abstract class Hewan {
    private String nama;
    
    public Hewan(String nama){
        this.nama = nama;
    }
    public String getnama(){
        return nama;
    }
    public abstract void bersuara();
    
}
