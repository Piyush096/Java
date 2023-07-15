import java.util.Scanner;


class Test
{
    public static void main(String[] args)
    {


    }
}
/*
In Java, an interface is a blueprint of a class that defines a set of methods
(and optionally constants) that any class implementing the interface must provide.
It acts as a contract, ensuring that implementing classes adhere to a specific set of methods and behavior.
Here's an example to illustrate the concept of an interface:

// Define an interface named Animal
interface Animal {
    void makeSound(); // Abstract method declaration
}

// Implementing class Dog that implements the Animal interface
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

// Implementing class Cat that implements the Animal interface
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Main class to demonstrate interface usage
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound(); // Output: Woof!

        Animal cat = new Cat();
        cat.makeSound(); // Output: Meow!
    }
}


In the example above, we have an interface named Animal that declares a single method makeSound().
The Dog and Cat classes implement the Animal interface, which means they must provide an implementation
for the makeSound() method. In this case, the Dog class outputs "Woof!" when makeSound() is called, and the
Cat class outputs "Meow!".
Interfaces allow you to define a common set of methods that multiple classes can implement,
enabling polymorphism and allowing objects of different classes to be treated uniformly when
they share a common interface. This promotes code reusability, modularity, and flexibility in Java applications.


--------------------------------------------------------------

The main differences between abstract classes and interfaces in Java are as follows:

Method Implementation: An abstract class can have both abstract and non-abstract methods.
It can provide method implementations and can also declare abstract methods that must be implemented
by its subclasses. On the other hand, an interface can only declare abstract methods, which must be
implemented by the classes that implement the interface. In Java 8 and later versions, interfaces can
also have default and static methods with implementations.

Inheritance: A class can extend only one abstract class, while it can implement multiple interfaces.
This is because Java supports single inheritance (a class can have only one direct superclass),
but it allows a class to implement multiple interfaces. This gives interfaces an advantage in achieving
multiple inheritance-like behavior in Java.

Constructors: An abstract class can have constructors that are invoked when its subclasses are instantiated.
Interfaces cannot have constructors because they are not meant to be instantiated directly.

Access Modifiers: In an abstract class, you can use different access modifiers
(e.g., public, protected, private) for its members (fields, methods, etc.). In an interface,
all methods are implicitly public and all fields are implicitly public, static, and final.

Type of Relationship: Abstract classes are generally used when there is a "is-a" relationship between
the class and the abstract class. For example, a Dog class can extend an abstract class Animal. Interfaces,
on the other hand, are used when there is a "has-a" relationship or when multiple unrelated classes need to
share common behavior. For example, a Car class can implement the Drivable interface.

Usage and Design: Abstract classes are suitable for creating classes that provide a common base implementation
and can be extended to add specific behavior. Interfaces are used to define a contract that a class must adhere
to, without providing any implementation details. They are often used to achieve abstraction, polymorphism, and
loose coupling between components.

It's important to note that a class can extend an abstract class and implement multiple
interfaces simultaneously, taking advantage of the benefits offered by both approaches


Abstract Class:
Instance Variables: Abstract classes can have instance variables, just like regular classes.
These variables are declared within the abstract class but outside of any method or constructor.
Instance variables in an abstract class are inherited by its subclasses and are accessible to them.
Static Variables: Abstract classes can also have static variables (class variables).
Static variables belong to the abstract class itself and are shared among all instances and
subclasses of the abstract class.

Interface:
Constants: In an interface, you can define constants, which are implicitly public, static, and final.
Constants in interfaces represent fixed values and are typically used to define symbolic names or
configuration values.
Default Interface Variables (Java 8 and later): Starting from Java 8, interfaces can also have default variables.
Default interface variables are declared using the default keyword and can have an initial value. These variables
are implicitly public, static, and final, similar to constants.

 */
