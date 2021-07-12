package StructureDesignPattern.AdapterDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<IShape> shapes = new ArrayList<IShape>();
        shapes.add(new LineAdapter(new LegacyLine()));
        shapes.add(new RetangleAdapter(new LegacyRectangle()));
        int x1 = 5, y1 = 10, x2 = -3, y2 = 2;

        for (IShape iShape : shapes) {
            iShape.draw(x1, x2, y1, y2);
        }
    }
}



class RetangleAdapter implements IShape {

    private final LegacyRectangle legacyRectangle;
    public RetangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }
    @Override
    public void draw(int x1, int x2, int y1, int y2) {
        int x = Math.min(x1, x2);
        int y = Math.min(y1, y2);
        int w = Math.abs(x1 - x2);
        int h = Math.abs(y1 - y2);
        legacyRectangle.draw(x, y, w, h);
    }

}

class LineAdapter implements IShape {

    private final LegacyLine legacyLine;

    public LineAdapter(LegacyLine legacyLine) {
        this.legacyLine = legacyLine;
    }

    @Override
    public void draw(int x1, int x2, int y1, int y2) {
        legacyLine.draw(x1, x2, y1, y2);
    }

}

class LegacyRectangle implements IShape {
    @Override
    public void draw(int x, int y, int w, int h) {
        System.out.println("Drawing Rectangle: " + x + "-" + y + "-" + w + "-" + h);
    }
}

class LegacyLine implements IShape {

    @Override
    public void draw(int x1, int x2, int y1, int y2) {
        System.out.println("Drawing Line: " + x1 + "-" + x2 + "-" + y1 + "-" + y2);
    }

}

interface IShape {
    void draw(int x1, int x2, int y1, int y2);
}


