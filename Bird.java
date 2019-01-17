
/**
 * Makes a cloud at a certain location.
 *
 * @author C. Yue
 * @version January 14, 2019
 */
public class Bird
{
    // instance variables - replace the example below with your own
    private Triangle bird1;
    private Circle bird2;
    private Triangle bird3;
    private Circle bird4;
    

    /**
     * Constructor for objects of class Bird
     */
    public Bird(int x, int y)
    {
        bird1 = new Triangle();
        bird2 = new Circle();
        bird3 = new Triangle();
        bird4 = new Circle();
        
    }

    /**
     * Draws a bird at a specific location.
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void drawBird(int x, int y)
    {
        bird1.makeVisible();
        bird1.changeColor("black");
        bird1.changeSize(5, 12);
        
        // Make first circle move based on x and y
        bird1.moveHorizontal(x);
        bird1.moveVertical(y);
        
        bird2.makeVisible();
        bird2.changeColor("white");
        bird2.changeSize(3);
        bird2.moveVertical(5);
        
        // Make first circle move based on x and y
        bird2.moveHorizontal(x);
        bird2.moveVertical(y);
        
        bird3.makeVisible();
        bird3.moveRight();
        bird3.changeColor("black");
        bird3.changeSize(5, 12);
        
        // Make first circle move based on x and y
        bird3.moveHorizontal(x);
        bird3.moveVertical(y);
        
        bird4.makeVisible();
        bird4.moveRight();
        bird4.changeColor("white");
        bird4.changeSize(3);
        bird4.moveVertical(5);
        
        // Make first circle move based on x and y
        bird4.moveHorizontal(x);
        bird4.moveVertical(y);
    }
}
