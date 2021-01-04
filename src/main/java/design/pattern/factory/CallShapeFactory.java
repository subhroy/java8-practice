package design.pattern.factory;

public class CallShapeFactory {
    public static void main(String[] args) {
        String s ="Circle";

        Shape shapeObj = new design.pattern.factory.ShapeFactory().drawShape(s);
        shapeObj.draw();

    }
}
