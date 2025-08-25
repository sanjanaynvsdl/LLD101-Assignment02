package src;

public class Square implements Shape {
    int len;

    public int area() {
        return len * len;
    }

    public void setLen(int size) {
        this.len = size;
    }
}