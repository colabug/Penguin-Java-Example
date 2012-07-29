import animals.Penguin;

/**
 * Author: Corey Leigh Latislaw
 * Date: 7/29/12
 * Purpose: GDI classroom example
 */
public class Zoo
{
    Penguin waddles;
    Penguin fluffy;

    public Zoo()
    {
        waddles = new Penguin( 10, 150, "green", "blue", 12.0f, 11.0f, 6.0f );
        fluffy = new Penguin( 2, 2000, "black", "black", 24.0f, 24.0f, 10.0f );
    }

    public static void main(String[] argv)
    {
        Zoo zoo = new Zoo();
        System.out.println("Hello, I have a zoo!");
    }
}
