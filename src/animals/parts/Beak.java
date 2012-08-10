package animals.parts;

/**
 * Author: Corey Leigh Latislaw
 * Date: 7/29/12
 * Purpose: GDI classroom example
 */
public class Beak
{
    float length;

    public Beak( float length )
    {
        System.out.println( "\t--Creating a beak with length " + length );

        this.length = length;
    }

    @Override
    public String toString()
    {
        return "length = " + length;
    }
}
