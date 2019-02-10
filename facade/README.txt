## Discussion
Facade discusses encapsulating a complex subsystem within a single interface objet. This reduces the learning curve necessary to successfully leverage the subsystem and also promotes the decoupling the subsystem from its potentially many clients. On the other hand, if the Facade is the only access point for the subsystem, it will limit the features and flexibility that "power users" may need

The Facade object should be a fairly simple advocate or facilitator. It should not become an all-knowing oracle or "God" object.

## Structure
Facade takes a "riddle wrapped in an enigma shrouded in mystery" and interjects a wrapper that tames the amorphous and inscrutable mass of software.

The Facade defines a unified higher level interface to a subsystem that makes it easier to use. Consumers encounter a Facade when ordering from a catalog. The consumer calls one numbers and speaks with a customer service representative. That customer service representative acts as a Facade, providing an interface to the order of fulfillment department, the billing and the shipping department.
