package exception;

public class Rectangle
{
    Double x;
    Double y;
    Double width; 
    Double height;
    
    public Rectangle(Double x, Double  y, Double width, Double height) throws IllegalSizeException
    {
        if(width <= 0 || height <=0)
        {
            throw new IllegalSizeException("Can not create a rectangle with the specified parameters: Width :" + width.toString() + " and Height: " + height.toString());
        }
        
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    } 
    
    public void draw()
    {
        System.out.println("Rectangle( x: " + x.toString() + " y: " + y.toString() + " width: " + width.toString() + " height: " + height.toString() + " ) was drawn.");        
    }
}
