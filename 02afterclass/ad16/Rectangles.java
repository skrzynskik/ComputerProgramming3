class Rectangles
{
    int width = 0;
    int height = 0;
    
    void displayDimensions(){
        System.out.println("The dimensions are: " + width + "x" + height);
    }
    
    void displayPerimeter(){
        int perimeter = 0;
        perimeter = (2*width + 2*height);
        System.out.println("The perimeter is: " + perimeter);
    }
    
    void displaySurface(){
        int surface = 0;
        surface = width*height;
        System.out.println("The surface is: " + surface);
    }
}