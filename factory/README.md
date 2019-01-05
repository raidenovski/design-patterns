## Problem

- A factory method is trying to standardize the architectural model for a range of applications but allow for individual applications to define their own domain objects and provide their instantiation.

## Intent

- Define an interface for creating an obhect but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

- Define a "virtual" constructor

- the `new` operator is considered harmful.

