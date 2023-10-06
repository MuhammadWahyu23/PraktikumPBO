import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Counter counter = new Counter();
        addObject(counter,53,23);
        bola bola = new bola();
        addObject(bola,176,30);
        bola bola2 = new bola();
        addObject(bola2,324,32);
        bola bola3 = new bola();
        addObject(bola3,490,39);
        bola bola4 = new bola();
        addObject(bola4,504,163);
        bola bola5 = new bola();
        addObject(bola5,347,178);
        bola bola6 = new bola();
        addObject(bola6,139,190);
        bola bola7 = new bola();
        addObject(bola7,499,291);
        bola bola8 = new bola();
        addObject(bola8,337,291);
        bola bola9 = new bola();
        addObject(bola9,174,294);
        flight flight = new flight();
        addObject(flight,78,316);
    }
}
