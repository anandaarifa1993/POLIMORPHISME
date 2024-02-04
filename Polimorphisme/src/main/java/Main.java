
public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Mr.chief ");
        Anjing anjing = new Anjing("waldo ");
        
        kucing.bersuara();
        kucing.konsumsi();
        
        System.out.println();
        
        anjing.bersuara();
        anjing.konsumsi();
    }
    
}
