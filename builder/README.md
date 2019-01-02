- Used when we want to seperate the process of building a complex object from the client and/or we want to create a building process where we can controll each step (as oposed from any factory methods where we just get the created o bject).

- Usually we interact with the builder through a `Director` which acts as an intermediate between the `Client` and the `Builder`.

- Use this pattern when we have to construct the same/similar object with various/different parameters.

### Example:

- A `Customer` (`Client`) orders a `Menu` Product to a `Waiter` (`Director`). The `Waiter` then builds the product by assembling it (Build drink, a hamburger, side dish, a toy if it's a kid's menu, etc...). Once the product building is completed, the `Waiter` then returns the product to the `Customer`.


