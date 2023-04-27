package Problem6;

public class Point3D extends Point{
    private int z;
    public Point3D(int x,int y,int z) {
        super(x,y);
        this.z = z;
    }

    public void moveUp() {
        this.z += 1;
    }

    public void moveDown() {
        this.z -= 1;
    }

    @Override
    public void move(int x, int y) {
        super.move(x,y);
    }

    public void move(int x, int y, int z) {
        super.move(x,y);
        this.z = z;
    }

    public String toString() {
        return ("The point at ("+getX()+","+getY()+","+z+")");
    }
}
