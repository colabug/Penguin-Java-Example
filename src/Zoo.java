import animals.Fish;
import animals.Penguin;

/**
 * Author: Corey Leigh Latislaw
 * Date: 7/29/12
 * Purpose: GDI classroom example
 */
public class Zoo
{
    static final int NUMBER_OF_PENGUINS = 2;

    Penguin[] penguins;

    public Zoo()
    {
        penguins = new Penguin[NUMBER_OF_PENGUINS];
        penguins[0] = new Penguin( "Waddles", // Name
                                   10,        // Age
                                   150,       // Weight
                                   "blue",    // Right eye color
                                   "green",   // Left eye color
                                   11.0f,     // Right foot length
                                   12.0f,     // Left foot length
                                   6.0f );    // Beak length

        penguins[1] = new Penguin( "Fluffy",         // Name
                                   2, 2000,          // Age & weight
                                   "black", "black", // Eyes
                                   24.0f, 24.0f,     // Feet
                                   10.0f );          // Beak
    }

    public static void main( String[] argv )
    {
        System.out.println( "Hello, I have a zoo!" );
        Zoo zoo = new Zoo();

        Penguin[] penguins = zoo.getPenguins();
        System.out.println();
        System.out.println( "The zoo has " + penguins.length + " penguins:" );
        for ( Penguin penguin : penguins )
        {
            System.out.println( "\t" + penguin.toString() );
        }

        System.out.println();
        System.out.println( "Penguin actions:" );
        for ( Penguin penguin : penguins )
        {
            penguin.waddle();
            penguin.swim();
            penguin.eat( new Fish( "Nemo" ) );
            System.out.println( "\t" + penguin.toString() );
            System.out.println();
        }
    }

    public Penguin[] getPenguins()
    {
        return penguins;
    }
}
