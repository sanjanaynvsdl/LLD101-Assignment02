package src;


public class Aviary {
    public void release(Flyyable b) {
        b.fly();
        System.out.println("Released");
    }
}