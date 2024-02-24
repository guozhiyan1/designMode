interface  shape{
    void draw();
}
class Rectangle implements shape{

    @Override
    public void draw() {
        System.out.println("Recctangle");
    }
}
class Circle implements shape{

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
class Square implements shape{

    @Override
    public void draw() {
        System.out.println("Square");
    }
}
//class shapeFactory{
//
//        }

public class FactoryPatternDemo {
    public static void main(String[] args) {

    }
}
