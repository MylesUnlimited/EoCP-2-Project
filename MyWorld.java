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
        player mainPerson = new player();
        addObject(mainPerson,300,200);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    
    private void prepare()
    {
        enemy enemy = new enemy();
        addObject(enemy,121,98);
        enemy enemy2 = new enemy();
        addObject(enemy2,130,264);
        enemy enemy3 = new enemy();
        addObject(enemy3,130,270);
        enemy.speed = 3;
        enemy2.speed = 4;
        enemy3.speed = 6;
    }
}
