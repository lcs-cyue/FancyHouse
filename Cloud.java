
/**
 * Makes a cloud at a certain location.
 *
 * @author C. Yue
 * @version January 14, 2019
 */
public class Cloud
{
    // instance variables - replace the example below with your own
    private Circle smoke;
    private Circle smoke1;
    private Circle smoke2;
    private Circle smoke3;
    private Circle smoke4;
    private Circle smoke5;

    /**
     * Constructor for objects of class Cloud
     */
    public Cloud(int x, int y)
    {
        // initialise instance variables
       smoke = new Circle();
       smoke1 = new Circle();
       smoke2 = new Circle();
       smoke3 = new Circle();
       smoke4 = new Circle();
       smoke5 = new Circle();
       
       // Draw the cloud
       drawCloud(x, y);
    }

    /**
     * Draws a cloud at a specific location.
     *
     * @param  x  horizontal location
     * @param  y  vertical location
     * 
     */
    public void drawCloud(int x, int y)
    {
        // put your code here
        smoke.makeVisible();
        smoke.changeColor("black");
        smoke.changeSize(20);
        smoke.moveHorizontal(200);
        smoke.moveVertical(-30);
        
        // Make first circle move based on x and y
        smoke.moveHorizontal(x);
        smoke.moveVertical(y);
        
        smoke1.makeVisible();
        smoke1.changeColor("black");
        smoke1.changeSize(20);
        smoke1.moveHorizontal(210);
        smoke1.moveVertical(-20);
        
        // Make first circle move based on x and y
        smoke1.moveHorizontal(x);
        smoke1.moveVertical(y);
        
        smoke2.makeVisible();
        smoke2.changeColor("black");
        smoke2.changeSize(20);
        smoke2.moveHorizontal(195);
        smoke2.moveVertical(-15);
        
        // Make first circle move based on x and y
        smoke2.moveHorizontal(x);
        smoke2.moveVertical(y);
        
        
        smoke3.makeVisible();
        smoke3.changeColor("black");
        smoke3.changeSize(20);
        smoke3.moveHorizontal(200);
        smoke3.moveVertical(-5);
        
        // Make first circle move based on x and y
        smoke3.moveHorizontal(x);
        smoke3.moveVertical(y);
        
        
        smoke4.makeVisible();
        smoke4.changeColor("black");
        smoke4.changeSize(20);
        smoke4.moveHorizontal(212);
        smoke4.moveVertical(-10);
        
        // Make first circle move based on x and y
        smoke4.moveHorizontal(x);
        smoke4.moveVertical(y);
        
        
        smoke5.makeVisible();
        smoke5.changeColor("black");
        smoke5.changeSize(25);
        smoke5.moveHorizontal(185);
        smoke5.moveVertical(-20);
        
        // Make first circle move based on x and y
        smoke5.moveHorizontal(x);
        smoke5.moveVertical(y);
        
    }
}
