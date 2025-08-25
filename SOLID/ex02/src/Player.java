package src;

public class Player {
    private Frame last;
    DrawUi drawui;
    Cache cachebytes;

    public Player(DrawUi drawui, Cache cache) {
        this.drawui=drawui;
        this.cachebytes=cache;
    }
    void play(byte[] fileBytes){


        // decode
        Frame f = new Frame(fileBytes); // pretend decoding
        last = f;
        // draw UI
        // System.out.println("\u25B6 Playing " + fileBytes.length + " bytes");
        // cache
        // System.out.println("Cached last frame? " + (last!=null));

        //the player should not care abt how does it draws UI or caches this
        drawui.draw(fileBytes);
        cachebytes.cacheBytes(fileBytes);


    }
}