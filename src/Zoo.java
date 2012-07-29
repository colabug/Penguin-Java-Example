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
        penguins[0] = new Penguin( "Waddles",
                                   10,
                                   150,
                                   "green",
                                   "blue",
                                   12.0f,
                                   11.0f,
                                   6.0f );

        penguins[1] = new Penguin( "Fluffy",
                                   2,
                                   2000,
                                   "black",
                                   "black",
                                   24.0f,
                                   24.0f,
                                   10.0f );
    }

    public static void main( String[] argv )
    {
        System.out.println( "Hello, I have a zoo!" );
        Zoo zoo = new Zoo();

        Penguin[] penguins = zoo.getPenguins();
        System.out.println( "The zoo has " + penguins.length + " penguins" );
        for ( Penguin penguin : penguins )
        {
            System.out.println( penguin.toString() );
        }
    }

    public Penguin[] getPenguins()
    {
        return penguins;
    }
}
