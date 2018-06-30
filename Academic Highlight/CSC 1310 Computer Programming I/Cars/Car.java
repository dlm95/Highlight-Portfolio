
/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car
{
//Variables 
private int year; //the year model of the car 
private String  brand; // the make of the car 
private int speed; //the speed of the car 
private int accelerate; //the acceleration of the car 
private int brake; //the brake of the car 

/**
 * constructor for the objects of class Car
 */

//initializes information about a Car's year model and make 
// remaining values of speed, accelerate, and brake are initialized also 
public void Car(String make, int year_model)
{
    year = year_model;
    brand = make; 
}
//the accesor methods get values stored in an objects's year model, make, and speed fields 
public int getYear()
{
    return year;
}
public String getBrand()
{
    return brand;
}
public int getSpeed()
{
    return speed;
}
public void increaseSpeed()
{
    speed += 5;
}
public void decreaseSpeed()
{ 
    speed -= 5;
}

}
  
