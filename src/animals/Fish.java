package animals;

/**
 * Author: Corey Leigh Latislaw
 * Date: 7/29/12
 * Purpose: GDI classroom example
 */
public class Fish extends Animal
{
    public Fish( String name, int age, int weight )
    {
        super( name, age, weight );
        System.out.println( "\t--Creating a fish with name " + name );
        this.name = name;
    }
}
