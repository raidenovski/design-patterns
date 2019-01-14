## Intent

- This pattern is used when we want to create some objects using a prototypical instance and create new objects by cloning this prototype

- Co-opt one instance of a class for use as a breeder of all future instances

- The `new` operator is considerd harmful

## Idea

Declare an abstract base class that specifies a pure virutal `clone` method and maintain a dictionary of all cloneable concrete derived classes. Any class that needs a polymorphic constructor capability derives itself from the abstract base class, registers its prototypical instance and implements the `clone()` operation.

The client then, instead of writing code that invokes the `new` operator on a hard-wired class, instead calls a `clone()` method on the abstract base class, supplying a string, enum or any kind of parametr that designates the particular concrete class that is desired.

## Rules of thumb

Somethis, creational patterns are competitors. There are cases where either `Prototype` or an `AbstractFactory` could be used properly. At other times they can be complementary. `AbstractFactory` might store a set of `Prototypes` from which to clone and return product objects. `AbstractFactory`, `Builder` and `Prototype` can use `Singleton` in their implementations.

Often, desugn starts out using `FactoryMethod` pattern which is less complicated and more customizable. It then later, evolves towards `AbstractFactory`, `Prototype` or a `Builder` which are more complex but more flexible.
