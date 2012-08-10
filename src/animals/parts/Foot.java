package animals.parts;

/**
 * Author: Corey Leigh Latislaw
 * Date: 7/29/12
 * Purpose: GDI classroom example
 */
public class Foot
{
    float length;
    int   location;

    public Foot( float length )
    {
        System.out.println( "\t--Creating a foot with length " + length );
        this.length = length;
        location = 0;
    }

    public void moveForward()
    {
        location++;
    }

    public void flap()
    {
        location += 2;
    }

    @Override
    public String toString()
    {
        return "length = " + length;
    }
}
