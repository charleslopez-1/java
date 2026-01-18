
import java.io.*;

class Shape {
    double calculateArea(){
        return 0;
    }
}

class Circle extends Shape {

    double radius;

    Circle (double radius){
        this.radius = radius;
    }

    @Override
    double calculateArea(){

        double areaCircle = Math.PI * radius * radius;

        return areaCircle;
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea(){

        double areaRectangle = height * width;

        return areaRectangle;

    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea(){

        double areaTriangle = (base * height) / 2;
        return areaTriangle;

    }

}

public class PolymorphismArea {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 3; i++){
        while (true){
            System.out.println();
            System.out.print("\nEnter shape type: ");
            String strShapeType = br.readLine();

            if (strShapeType.equalsIgnoreCase("Circle")){
                System.out.print("Enter radius: ");
                double dblRadius = Double.parseDouble(br.readLine());

                Circle c = new Circle(dblRadius);

                System.out.printf("Area of Circle: %.2f", c.calculateArea());

            } else if (strShapeType.equalsIgnoreCase("Rectangle")){
                System.out.print("Enter Width: ");
                double dblWidth  = Double.parseDouble(br.readLine());

                System.out.print("Enter Height: ");
                double dblHeight = Double.parseDouble(br.readLine());

                Rectangle rec = new Rectangle(dblWidth, dblHeight);

                System.out.println("Area of Rectangle: " + rec.calculateArea());

            } else if (strShapeType.equalsIgnoreCase("Triangle")){
                System.out.print("Enter Base: ");
                double dblBase  = Double.parseDouble(br.readLine());

                System.out.print("Enter Height: ");
                double dblHeight = Double.parseDouble(br.readLine());

                Triangle tri = new Triangle(dblBase, dblHeight);

                System.out.println("Area of Triangle: " + tri.calculateArea());
            } else {
                System.out.println("Invalid shape! please enter either Circle, Rectangle, or Triangle");
                continue;
                }
            break;
            }
        }
    }
}
