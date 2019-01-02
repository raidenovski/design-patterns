package com.urosht.demo.builder;

/**
 * A concrete builder for a specific product type.
 */
public class SpicyPizzaBuilder extends PizzaBuilder {

  public void buildDough() {
    pizza.setDough("pan baked");
  }

  public void buildSauce() {
    pizza.setSauce("spicy");
  }

  public void buildTopping() {
    pizza.setTopping("pepperoni & salami");
  }
}
