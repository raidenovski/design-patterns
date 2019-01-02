package com.urosht.demo.builder;

/**
 * Concrete pizza builder for a specific type of product.
 */
public class HawaiianPizzaBuilder extends PizzaBuilder {

  public void buildDough() {
    pizza.setDough("cross");
  }

  public void buildSauce() {
    pizza.setSauce("mild");
  }

  public void buildTopping() {
    pizza.setTopping("pineapple & ham");
  }
}
