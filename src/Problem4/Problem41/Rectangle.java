package Problem4.Problem41;

public class Rectangle {
    double x;
    double y;
    double lenX;
    double lenY;

    Rectangle(double x, double y, double lenX, double lenY){
        this.x = x;
        this.y = y;
        this.lenX = lenX;
        this.lenY = lenY;
    }

    void show() {
        System.out.println("A rectangle with "+ lenX + "x" + lenY + " at " + "("+ x + "," + y +")");
    }
    double square() {
        return (lenX * lenY);
    }
    boolean contains(Rectangle Rec) {
        if(Rec.x > this.x && Rec.y > this.y && (Rec.x+Rec.lenX) < (this.x + this.lenX) && (Rec.y+Rec.lenY) < (this.y + this.lenY) ) return true;
        return false;
    }
}
