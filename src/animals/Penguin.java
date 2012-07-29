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
    Eye  leftEye;
    Eye  rightEye;
    Foot rightFoot;
    Foot leftFoot;
    Beak beak;

    public Penguin( int age,
                    int weight,
                    String leftEyeColor,
                    String rightEyeColor,
                    float leftFootLength,
                    float rightFootLength,
                    float beakLength )
    {
        System.out.println("Creating a penguin");

        // Store values
        this.age = age;
        this.weight = weight;

        // Construct new objects from parameters
        leftEye = new Eye( leftEyeColor );
        rightEye = new Eye( rightEyeColor );
        rightFoot = new Foot( leftFootLength );
        leftFoot = new Foot( rightFootLength );
        beak = new Beak( beakLength );
    }
}
