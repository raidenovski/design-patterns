package com.urosht.demo;

import com.urosht.demo.builder.HawaiianPizzaBuilder;
import com.urosht.demo.builder.PizzaBuilder;
import com.urosht.demo.builder.SpicyPizzaBuilder;
import com.urosht.demo.director.Waiter;
import com.urosht.demo.product.Pizza;

public class PizzaApplication {

  public static void main(String[] args) {

    Waiter waiter = new Waiter();
    PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
    PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

    waiter.setPizzaBuilder(hawaiianPizzaBuilder);
    waiter.buildPizza();

    Pizza hawaiianPizza = waiter.getPizza();
    System.out.println("Waiter got pizza: " + hawaiianPizza.toString());

    waiter.setPizzaBuilder(spicyPizzaBuilder);
    waiter.buildPizza();

    Pizza spicyPizza = waiter.getPizza();
    System.out.println("Waiter got pizza: " + spicyPizza.toString());

  }

}
