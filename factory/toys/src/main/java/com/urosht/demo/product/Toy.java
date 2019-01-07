package com.urosht.demo.product;

/**
 * This could easily be an abstract class if we are never to instantiate generic 'Toy' objects.
 */
public class Toy {

  private String color;
  private String sound;
  private String material;

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getSound() {
    return sound;
  }

  public void setSound(String sound) {
    this.sound = sound;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }
}
