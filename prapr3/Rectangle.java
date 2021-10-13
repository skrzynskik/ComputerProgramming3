
public class Rectangle
{
    double width;
    double height;
    
    double perimeter(){
        return 2*width + 2*height;
    }
    double surfaceArea(){
        return width*height;
    }
    void displayDimensions(){
        System.out.println("Height: " + height + "\nWidth: " + width);
    }
}
