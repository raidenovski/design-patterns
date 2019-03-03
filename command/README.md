## Intent
- Encapsulate a request as an object, thereby letting you parametrize clients with different requests, queue or log requests and support undoable operations
- Promote "Invocation of a method on an object" to full object status
- An object-oriented callback

## Discussion
- Command decouples the object that invokes the operation from the one that knows how to perform it. To achieve this separation, the designer creates an abstract base class that maps a receiver (an object) with an action. The base class contains an `execute()` method that simply calls the action on the receiver.

## Check list
- Define a Command interface with a method signature like `execute()`
- Create one or more derived classes that encapsulate some subset of the following: a receiver object, the method to invoke, the arguments to pass
- Instantiate a Command object for each deferred execution request
- Pass the Command object from the creater (aka sender) to the invoker (aka receiver)
- The receiver decides when to execute
