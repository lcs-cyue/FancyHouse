
/**
 * Creates an image of a house
 *
 * @author Chelsea Yue
 * @version January,11,2019
 */
public class MyHouse
{
    //fields a.k.a
    // instance variables - replace the example below with your own
    //ACCESS_MODIFIER TYPE NAME
    private Circle ground;
    private Circle ground2;
    private Square base;
    private Triangle roof;
    private Square chimney;
    private Square chimney2;
    private Square window;
    private Square window1;
    private Square window2;
    private Square window3;
    private Square window4;
    private Square window5;
    private Cloud smoke;
    private Cloud rainyCloud;
    private Cloud rainyCloud2;
    private Square door;
    private Square door2;
    private Circle doorknob;
    private Bird bird;
    private Circle road1;
    private Circle road2;
    private Circle road3;
    private Circle road4;
    
   
    
  
    
    

    /**
     * Constructor for objects of class MyHouse
     */
    public MyHouse()
    {
        // initialise instance variables
       ground = new Circle();
       ground2 = new Circle();
       base = new Square();
       roof = new Triangle();
       chimney = new Square();
       chimney2 = new Square();
       window = new Square();
       window1 = new Square();
       window2 = new Square();
       window3 = new Square();
       window4 = new Square();
       window5 = new Square();
       smoke = new Cloud(0, 0);
       rainyCloud = new Cloud(-200, 30);
       rainyCloud2 = new Cloud(-150, -30);
       door = new Square();
       door2 = new Square();
       doorknob = new Circle();
       road1 = new Circle();
       road2 = new Circle();
       road3 = new Circle();
       road4 = new Circle();
       
     
       // draw the rest of the house automatically
       drawHouse();
       
       // Draw the bird
       bird = new Bird(0, 100);
       bird = new Bird(200, 100);
       bird = new Bird(300, 50);
       bird = new Bird(170, 0);


    
    }

    /**
     * Draws the house
     */
    public void drawHouse() 
    {
        //Arrange each object
        
        //Set up the sun (Ctrl+Space）
        
        ground2.makeVisible();
        ground2.changeColor("red");
        ground2.changeSize(1000);
        ground2.moveVertical(138);
        ground2.moveHorizontal(-269);
        
        
        ground.makeVisible();
        ground.changeColor("yellow");
        ground.changeSize(1000);
        ground.moveVertical(140);
        ground.moveHorizontal(-270);
        
        
        
        road1.makeVisible();
        road1.changeSize(430);
        road1.changeColor("white");
        road1.moveVertical(150);
        road1.moveHorizontal(-145);
        
        road3.makeVisible();
        road3.changeSize(430);
        road3.changeColor("red");
        road3.moveVertical(32);
        road3.moveHorizontal(-296);
        
        road2.makeVisible();
        road2.changeSize(430);
        road2.changeColor("yellow");
        road2.moveVertical(35);
        road2.moveHorizontal(-295);
        
        
        
        
        
        
        chimney.makeVisible();
        chimney.changeSize(70);
        chimney.moveHorizontal(115);
        chimney.moveVertical(25);
        chimney.changeColor("yellow");
        
        chimney2.makeVisible();
        chimney2.changeSize(70);
        chimney2.moveHorizontal(143);
        chimney2.moveVertical(25);
        chimney2.changeColor("white");
        
        
        base.makeVisible();
        base.moveHorizontal(40);
        base.moveVertical(95);
        base.changeSize(100);
        base.changeColor("black");
        
        roof.makeVisible();
        roof.changeSize(100, 120);
        roof.moveVertical(35);
        roof.moveRight();
        roof.moveRight();
        roof.moveHorizontal(60);
        roof.changeColor("red");
        
        window.makeVisible();
        window.changeSize(32);
        window.moveVertical(110);
        window.moveHorizontal(48);
        window.changeColor("yellow");
        
        window1.makeVisible();
        window1.changeSize(13);
        window1.changeColor("red");
        window1.moveVertical(127);
        window1.moveHorizontal(50);
        
        window5.makeVisible();
        window5.changeSize(13);
        window5.changeColor("white");
        window5.moveVertical(127);
        window5.moveHorizontal(65);
        
        window2.makeVisible();
        window2.changeSize(13);
        window2.changeColor("black");
        window2.moveVertical(112);
        window2.moveHorizontal(50);
        
        window3.makeVisible();
        window3.changeSize(13);
        window3.changeColor("black");
        window3.moveVertical(112);
        window3.moveHorizontal(65);
        
        door.makeVisible();
        door.moveVertical(152);
        door.moveHorizontal(85);
        door.changeColor("red");
        door.changeSize(43);
        
        door2.makeVisible();
        door2.moveVertical(152);
        door2.moveHorizontal(55);
        door2.changeColor("black");
        door2.changeSize(43);
        
        doorknob.makeVisible();
        doorknob.changeSize(6);
        doorknob.changeColor("yellow");
        doorknob.moveHorizontal(161);
        doorknob.moveVertical(165);
      
      
        

       
        
        
        
     
        

    }
}
