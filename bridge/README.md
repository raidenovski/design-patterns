## Intent

- Decouple an abstraction from it's implementation so that the two can vary independently
- Publish interface in an inheritance hierarchy and bury implementation in its own inheritance hierarchy

Decompose the component's interface and implementation into orthogonal class hierarchies. The interface class contains a pointer to the abstract implementation class but all subsequent interaction from the interface class to the implementation class is limited to the abstraction maintained in the implementation base class. The client interacts with the interface class and in turn delegates all requests to the implementation class.

The interface object is the "handle" known and used by the client while the implementation object or "body" is safely encapsulated to ensure that it may continue to evolve or be entirely replaced or shared at run-time.

Use the bridge pattern when:

- You want to share an implementation among multiple objects
- You need to map orthogonal class hierachies
- You have classes with a coupled interface and multiple implementations

## Usage
- Bridge can be used with `Inteface - Interface` or `Abstact Class - Interface` where the `Implementor` is an Interface
- The basic idea is that the `Implementor` 'has-a' instance of the bridged class and we can use any `Implementor` implementation with the bridged implementation (implementception)
