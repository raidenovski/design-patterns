package com.urosht.demo.product;

public class Car {

  private int wheels;
  private String color;
  private String type;

  public Car() {
  }

  public int getWheels() {
    return wheels;
  }

  public void setWheels(int wheels) {
    this.wheels = wheels;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Car{");
    sb.append("wheels=").append(wheels);
    sb.append(", color='").append(color).append('\'');
    sb.append(", type='").append(type).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
