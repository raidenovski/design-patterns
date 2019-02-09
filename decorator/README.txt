## Intent

- Attach additional responsibilites to an object dinamically. Decorators provide alternative to subclassing for extending funcionality
- Client-specified embellishment of a core object by recursively wrapping it
- Wrapping a gift, putting it in a box and wrapping the box

## Rules of thumb

- Create a "lowest common denominator" that mkes classes interchangeable
- Create a second level base class for optional functionality
- "Core" class and "Decorator" class declare a "is-a" relationship
- Decorator class "has a" instance of the "lowest common denominator"
- Decorator class delegates to the "has-a" object
- Create a Decorator derived class for each optional embellishment
- Decorator derived class delegate to the base class AND add the extra stuff
- Client has the responsibility to compose desired configurations
