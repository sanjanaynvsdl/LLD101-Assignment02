package src;

public class Demo05 {
    static int areaAfterResize(Rectangle r) {
        r.setWidth(5);
        r.setHeight(4);
        return r.area();
    }

    static int areaAfterResize(Square s) {
        s.setLen(4);
        return s.area();
    }

    public static void main(String[] args) {
        // Rectangle rect = new Rectangle();
        // int rcArea = areaAfterResize(rect);
        // System.out.println("Area of rect : "+rcArea);

        // Square square = new Square();
        // int sqArea = areaAfterResize(square);
        // System.out.println("Area of sq :"+sqArea);

        //same method but diff, singmaure -> method over laoding
        System.out.println(areaAfterResize(new Rectangle())); // 20
        System.out.println(areaAfterResize(new Square())); // 16 (!) violates expectation

    }
}
