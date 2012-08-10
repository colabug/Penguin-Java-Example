package animals.parts;

/**
 * Author: Corey Leigh Latislaw
 * Date: 7/29/12
 * Purpose: GDI classroom example
 */
public class Eye
{
    String color = "";

    public Eye( String color )
    {
        System.out.println( "\t--Creating an eye with color " + color );

        this.color = color;
    }

    @Override
    public String toString()
    {
        return "color = " + color;
    }
}
