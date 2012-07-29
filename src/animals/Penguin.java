package animals;

import animals.parts.Beak;
import animals.parts.Eye;
import animals.parts.Foot;

/**
 * Author: Corey Leigh Latislaw
 * Date: 7/29/12
 * Purpose: GDI classroom example
 */
public class Penguin extends Animal
{
    String name;

    Eye  leftEye;
    Eye  rightEye;
    Foot rightFoot;
    Foot leftFoot;
    Beak beak;

    boolean isHungry;

    public Penguin( String name,
                    int age,
                    int weight,
                    String leftEyeColor,
                    String rightEyeColor,
                    float leftFootLength,
                    float rightFootLength,
                    float beakLength )
    {
        System.out.println( "Creating a penguin" );

        // Store values
        this.name =  name;
        this.age = age;
        this.weight = weight;

        isHungry = true;

        // Construct new objects from parameters
        leftEye = new Eye( leftEyeColor );
        rightEye = new Eye( rightEyeColor );
        rightFoot = new Foot( leftFootLength );
        leftFoot = new Foot( rightFootLength );
        beak = new Beak( beakLength );
    }

    public void waddle()
    {
        System.out.println( "Waddling" );
        leftFoot.moveForward();
        rightFoot.moveForward();
    }

    public void swim()
    {
        System.out.println( "Swimming" );
        rightFoot.flap();
        leftFoot.flap();
    }

    public void eat( Fish fish )
    {
        System.out.println( "Eating" );
        isHungry = false;
    }

    @Override
    public String toString()
    {
        return "Penguin { " +
               "name = " + name +
               ", left eye " + leftEye +
               ", right eye " + rightEye +
               ", left foot " + leftFoot +
               ", right foot " + rightFoot +
               ", Beak " + beak +
               ", isHungry = " + isHungry +
               " }";
    }
}
