package com.urosht.demo.builder;

import com.urosht.demo.product.Pizza;

/**
 * Abstact pizza builder, a general blueprint for building pizza products.
 */
public abstract class PizzaBuilder {

  protected Pizza pizza;

  public void createNewPizzaProduct() {
    this.pizza = new Pizza();
  }

  public Pizza getPizza() {
    return pizza;
  }

  public abstract void buildDough();
  public abstract void buildSauce();
  public abstract void buildTopping();
}
