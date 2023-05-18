package Problem8;

public class Main {
    public static void main(String[] args) {
        Shape[] shapeList = new Shape[3];
        shapeList[0] = new Circle(10);
        shapeList[1] = new Oval(20,30);
        shapeList[2] = new Rect(10,40);

        for (int i=0; i< shapeList.length; i++) shapeList[i].redraw();
        for (int i=0; i< shapeList.length; i++) System.out.println("Area:" + shapeList[i].getArea());

        Angular[] angularList = new Angular[2];
        angularList[0] = new Rect(20,30);
        angularList[1] = new Line(10,40);

        for (int i=0; i< angularList.length; i++) angularList[i].printVertex();
    }
}
