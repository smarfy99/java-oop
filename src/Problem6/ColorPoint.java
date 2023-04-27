package Problem6;

public class ColorPoint extends Point{
    private String color;

//    overloading
    public ColorPoint() {
        super(0,0);
        this.color = "black";
    }

    public ColorPoint(int x, int y) {
        super(x,y);
        this.color = "black";
    }

    public ColorPoint(int x, int y, String color) {
        super(x,y);
        this.color = color;
    }

    public void setXY(int x,int y){
        move(x, y);
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString() {
        return ("The "+color+" point at ("+getX()+","+getY()+")");
    }
}
