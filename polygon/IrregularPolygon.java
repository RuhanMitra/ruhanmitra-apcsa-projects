package polygon;

import java.awt.geom.*; // for Point2D.Double
import java.util.ArrayList; // for ArrayList
import gpdraw.*; // for DrawingTool

public class IrregularPolygon {
    private ArrayList<Point2D.Double> myPolygon = new ArrayList<Point2D.Double>();

    // constructor
    public IrregularPolygon() {}

    // public methods
    public void add(Point2D.Double aPoint)
    {
        myPolygon.add(aPoint);
    }

    public double perimeter() {
        double total = 0;

        for (int i = 0; i < myPolygon.size(); i++) {
            Point2D.Double p1 = myPolygon.get(i);
            Point2D.Double p2 = myPolygon.get((i + 1) % myPolygon.size());

            total += p1.distance(p2);
        }

        return total;
    }

    public double area() {
        double area = 0.0;

        for (int i = 0; i < myPolygon.size(); i++) {
            Point2D.Double p1 = myPolygon.get(i);
            Point2D.Double p2 = myPolygon.get((i + 1) % myPolygon.size());

            area += (p1.x * p2.y) - (p1.y * p2.x);
        }

        return Math.abs(area) / 2.0;
    }

    public void draw()
    {
        try {
            DrawingTool myDrawingTool = new DrawingTool(new SketchPad(500, 500));

            if (myPolygon.size() == 0) return;

            myDrawingTool.up();
            myDrawingTool.move(myPolygon.get(0).x, myPolygon.get(0).y);
            myDrawingTool.down();

            for (int i = 1; i < myPolygon.size(); i++) {
                myDrawingTool.move(myPolygon.get(i).x, myPolygon.get(i).y);
            }

            myDrawingTool.move(myPolygon.get(0).x, myPolygon.get(0).y);

        } catch (java.awt.HeadlessException e) {
            System.out.println("Exception: No graphics support available.");
        }
    }

}
