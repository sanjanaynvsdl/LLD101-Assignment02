package src;

public class Demo02 {
    public static void main(String[] args) {

        DrawUi drawui = new DrawUi();
        Cache cache = new Cache(); 

        Player ply=new Player(drawui, cache);
        ply.play(new byte[]{1,2,3,4});
       
    }
}
