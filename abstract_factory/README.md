## Intent

Provides an interface for creating similar or dependant objects without specifying their concrete class implementations

A hierarchy that encapsulates many possible 'platforms' and a construction of a 'suite of products'

The `new` operator is considered harmful

- Main difference between the Factory and Abstract Factory pattern is that in the Factory pattern, we are using a single method (that can be overriden to create other objects) and in Abstract Factory we are using an object that is passed as argument in order to create families of objects.

### Example:

An `AbstractKingdomFactory` that creates abstract objects like `King` and `Army`. Then we can create concrete Kingdom factories like `ElvenKingdomFactory` or `OrcKingdomFactory` that are in charge of creating concrete implementations for `ElfKing`, `OrcKing`, `ElfArmy` and an `OrcArmy`. We should only interact with abstract objects like `King` and `Army` and pass a concrete factory implementation as a method argument for creating our `Kingdom` with it's `King` and `Army`.
