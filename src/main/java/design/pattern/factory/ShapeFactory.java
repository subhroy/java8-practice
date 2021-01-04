package design.pattern.factory;

public class ShapeFactory {

    public Shape drawShape(String shapeStr){

        if("Circle".equalsIgnoreCase(shapeStr)){
           return  new Circle();

        }else if("Rectangle".equalsIgnoreCase(shapeStr)){
           return new Rectangle();

        }
        return null;
    }
}
