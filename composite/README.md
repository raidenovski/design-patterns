## Usage

- The composite pattern is intended to allow treating individual objects and compostitions of objects, or "composites" in the same way

## Members
- **Component** - base interface for all the objects in the composition. Can be an interface or an abstract class with the common methods to manage the child composites
- **Leaf** - Implements the default behavour of the base component. It does not contain a reference to other objects
- **Composite** - Has leaf elements. It implements the base component methods and defines the child-related operations
- **Client** - Has access to the composition elements by using the base component object
