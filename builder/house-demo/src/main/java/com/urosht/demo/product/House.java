package com.urosht.demo.product;

public class House {

  private String basement;
  private String structure;
  private String roof;

  public House() {
  }

  public String getBasement() {
    return basement;
  }

  public void setBasement(String basement) {
    this.basement = basement;
  }

  public String getStructure() {
    return structure;
  }

  public void setStructure(String structure) {
    this.structure = structure;
  }

  public String getRoof() {
    return roof;
  }

  public void setRoof(String roof) {
    this.roof = roof;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("House{");
    sb.append("basement='").append(basement).append('\'');
    sb.append(", structure='").append(structure).append('\'');
    sb.append(", roof='").append(roof).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
