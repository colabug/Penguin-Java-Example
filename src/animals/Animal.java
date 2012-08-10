package animals;

/**
 * Author: Corey Leigh Latislaw
 * Date: 7/29/12
 * Purpose: GDI classroom example
 */
public class Animal
{
    String name   = "";
    int    age    = 0;
    int    weight = 0;

    public Animal( String name, int age, int weight )
    {
        System.out.println( "\tAnimal()" );
        System.out.println( "\t--Creating an animal named " + name + " that is " + age + " years old and weighs " + weight + " pounds." );

        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}
