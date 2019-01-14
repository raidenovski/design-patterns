## Problem

- A factory method is trying to standardize the architectural model for a range of applications but allow for individual applications to define their own domain objects and provide their instantiation.

## Intent

- Define an interface for creating an obhect but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

- Define a "virtual" constructor

- the `new` operator is considered harmful.

## Usage

- If we have an inheritance hierarchy that uses polymorphism, we can defina our base class factory method as `static`.

- Design the factory to receive arguments. Think about what qualities are necessary and sufficient to identify the correct class to instantiate.

- Optionally, we could design an internal object pool that will allow objects to be reused instead of created from scratch (Think database connection pools).

- Force the usage of factory by making all constructors `private` or `protected`.

There are usually two major varieties of this pattern. First, one where the base class is an abstract class and doesn't hold any default implementation. Second, where the base class is a concrete class and holds a default implementation.
