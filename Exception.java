package exception;
import java.util.*;

public class Exception {
    
    public static void main(String[] args) 
    {
        Double x = 0.0;
        Double y = 0.0;
        Double width = 0.0;
        Double height = 0.0;
        
        try(Scanner in = new Scanner(System.in))
        {
            x = in.nextDouble();
            y = in.nextDouble();
            width = in.nextDouble();
            height = in.nextDouble();
        }      
        
        try
        {
            Rectangle rect = new Rectangle(x, y, width, height);
            rect.draw();
        }
        catch(IllegalSizeException e)
        {
            System.out.println(e.toString());
        }
        
    }
    
}
