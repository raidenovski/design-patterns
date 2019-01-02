package com.urosht.demo.product;

/**
 * Product that is being built. Can have many inputs/variations.
 */
public class Pizza {

  private String dough;
  private String sauce;
  private String topping;

  public String getDough() {
    return dough;
  }

  public void setDough(String dough) {
    this.dough = dough;
  }

  public String getSauce() {
    return sauce;
  }

  public void setSauce(String sauce) {
    this.sauce = sauce;
  }

  public String getTopping() {
    return topping;
  }

  public void setTopping(String topping) {
    this.topping = topping;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Pizza{");
    sb.append("dough='").append(dough).append('\'');
    sb.append(", sauce='").append(sauce).append('\'');
    sb.append(", topping='").append(topping).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
