## Intent

Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces
Wrap an existing class with a new interface
Use it to match an old component to an new system

## Goals

 - Identify the desired interface
 - Design a 'wrapper' class that can match the old to the new
 - The adapter/wrapper class 'maps' (or delegates) to the legacy object
 - The client uses (is coupled to) the new interface

## Hints

 If we have a client that is using methods from classes that implement `NewService` interface and still need functionality from the `OldService`, we simply create an `Adapter` that will implement the `NewService` and will have an instance of the `OldService` (adaptee) where we will handle the adaptation
