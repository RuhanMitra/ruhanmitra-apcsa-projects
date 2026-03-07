package polygon;

import java.awt.geom.Point2D;

public class Main {
    public static void main(String [] args)
    {
        IrregularPolygon myPolygon = new IrregularPolygon();

        myPolygon.add(new Point2D.Double(0, 0));
        myPolygon.add(new Point2D.Double(50, 0));
        myPolygon.add(new Point2D.Double(40, 40));
        myPolygon.add(new Point2D.Double(0, 30));

        myPolygon.draw();

        TestSuite.run();
    }
}
