package src;

public class Rectangle implements Shape {
    int h, w;

    void setWidth(int w) {
        this.w = w;
    }

    void setHeight(int h) {
        this.h = h;
    }

    public int area() {
        return h * w;
    }

}