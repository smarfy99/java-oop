package Problem4.Problem41;

public class RectangleAnsw {
    int pos_x;
    int pos_y;
    int width;
    int height;

    RectangleAnsw(int pos_x, int pos_y, int width, int height) {
        this.pos_x = pos_x;
        this.pos_y = pos_y;
        this.width = width;
        this.height = height;
    }

    void show() {
        System.out.println("A rectangle with " + width + "x" + height + " at (" + pos_x + "," + pos_y + ")");
    }

    int square() {
        return width * height;
    }

    boolean contains(RectangleAnsw r) {
        return pos_x < r.pos_x && pos_y < r.pos_y && pos_x + width > r.pos_x + r.width && pos_y + height > r.pos_y + r.height;
    }



}

