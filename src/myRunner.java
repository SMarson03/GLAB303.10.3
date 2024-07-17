public class myRunner {
    public static void main(String[] args) {

        Circle c = new Circle(100);
        System.out.println("Area of Circle " + c.getArea());

        //Shape sObj = new Shape(); //This will give Error, we can not instantiate
        //Abstract class

        System.out.println("+++++++++++++++++");

        Shape shapeCircleObj = new Circle(100);
        shapeCircleObj.displayshapName();
        System.out.println("Area of Circle " + shapeCircleObj.getArea());
        System.out.println(shapeCircleObj);
        //Use instanceof operator for Validation
        System.out.println(shapeCircleObj instanceof Circle);//true

        System.out.println("+++++++++++++++++");
        Shape shapeRectangleObj = new Rectangle("Red");
        shapeRectangleObj.displayshapName();
        shapeRectangleObj.setHeight(2);
        shapeRectangleObj.setWidth(4);
        System.out.println("Area of Rectangle is " + shapeRectangleObj.getArea());
        System.out.println(shapeRectangleObj);
//Run Rectangles
        //Use instanceof operator for Validation
        System.out.println(shapeCircleObj instanceof Rectangle);
        System.out.println("--------------------");
        Shape shapeTriangleObj = new Triangle("Blue");
        shapeTriangleObj.displayshapName();
        shapeTriangleObj.setHeight(10);
        shapeTriangleObj.setBase(15);
        System.out.println("Area of Triangle is " + shapeTriangleObj.getArea());
        System.out.println(shapeTriangleObj);

    }
}
