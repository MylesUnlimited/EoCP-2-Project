import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    /**
     * Act - do whatever the player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     moveAround();
     killEnemy();
    }  
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("down"))
        setLocation(getX(), getY() + 4);
        if(Greenfoot.isKeyDown("up"))
        setLocation(getX(), getY() - 4);
        if(Greenfoot.isKeyDown("right"))
        setLocation(getX() + 4, getY());
        if(Greenfoot.isKeyDown("left"))
        setLocation(getX() - 4, getY());
    }
    public void killEnemy()
    {
        Actor foundEnemy = getOneIntersectingObject(enemy.class);
        if((isTouching(enemy.class))&(Greenfoot.isKeyDown("F")))
            getWorld().removeObject(foundEnemy);
    }   
}
