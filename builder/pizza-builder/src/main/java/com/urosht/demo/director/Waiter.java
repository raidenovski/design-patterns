package com.urosht.demo.director;

import com.urosht.demo.builder.PizzaBuilder;
import com.urosht.demo.product.Pizza;

/**
 * Serves as a product director that mediates in between the client that orders the product and gives instructions to the builder.
 */
public class Waiter {

  private PizzaBuilder pizzaBuilder;

  public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
    this.pizzaBuilder = pizzaBuilder;
  }

  public void buildPizza() {
    pizzaBuilder.createNewPizzaProduct();
    pizzaBuilder.buildDough();
    pizzaBuilder.buildSauce();
    pizzaBuilder.buildTopping();
  }

  public Pizza getPizza() {
    return this.pizzaBuilder.getPizza();
  }

}
